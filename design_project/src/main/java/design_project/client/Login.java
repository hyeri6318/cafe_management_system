/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_project.client;

import design_project.FileSystem.CreateFile;
import design_project.beverage.beverage;
import design_project.cake.cake;
import design_project.md.MD;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 이혜리
 */
public class Login {

    String url = CreateFile.URL + "\\client.txt";

    String ID = null;
    String PW = null;
    int NID=0;

    public static String id = null; // 회원 아이디
    public static String nid = null; // 비회원 아이디

    MD m = new MD() {
        @Override
        public int cost() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public String exhibit() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };

    beverage b = new beverage() {};

    cake c = new cake();

    public void DoLogin() {
        Scanner sc = new Scanner(System.in);

        System.out.println("아이디 : ");
        ID = sc.nextLine();
        id = ID;

        System.out.println("비밀번호 : ");
        PW = sc.nextLine();

        LoginCheck();

    }

    public void non_member() {  // 비회원일 경우 숫자로 랜덤 아이디 부여
        Random random = new Random();
        NID = random.nextInt(100);
        nid = Integer.toString(NID);

        System.out.println(nid);
        show();
    }

    public boolean Compare(String url) {
        try {
            String str;
            String[] array = null;

            BufferedReader is = new BufferedReader(new FileReader(url));

            Path path = Paths.get(url);

            Charset cs = StandardCharsets.UTF_8;

            ArrayList<String> list = new ArrayList<String>();
            list = (ArrayList<String>) Files.readAllLines(path, cs);

            ArrayList<String> list_temp = new ArrayList<String>();
            ArrayList<String> id_list = new ArrayList<String>();
            ArrayList<String> pw_list = new ArrayList<String>();

            for (String i : list) {
                array = i.split("\n");
                list_temp.add(array[0]);
            }

            for (String i : list_temp) {
                String[] temp = i.split("/");
                id_list.add(temp[1]);
                pw_list.add(temp[2]);
            }

            for (int i = 0; i < id_list.size(); i++) {
                if (ID.equals(id_list.get(i)) && PW.equals(pw_list.get(i))) {
                    is.close();
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public void LoginCheck() {

        boolean id_temp = Compare(url);

        if (id_temp) {
            System.out.print("로그인 성공\n\n");
            show();
        } else {
            System.out.print("로그인 실패\n");
            DoLogin();
        }
    }

    public void show() {
        System.out.print("-----------------------음료 및 케이크 영양 정보를 제공합니다-----------------------\n");
        b.orderCheck();
        c.orderCheck();
        m.buy();
    }
}
