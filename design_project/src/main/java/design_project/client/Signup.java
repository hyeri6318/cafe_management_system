/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_project.client;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 이혜리
 */
public class Signup {
        String URL = "C:\\DProject\\src\\main\\java\\info\\client.txt";
    String id, ps, name;

    public boolean CompareID() {
        try {
            String str;
            String[] array = null;

            BufferedReader is = new BufferedReader(new FileReader(URL));

            Path path = Paths.get(URL);
            Charset cs = StandardCharsets.UTF_8;
            ArrayList<String> list = new ArrayList<String>();
            list = (ArrayList<String>) Files.readAllLines(path, cs);

            ArrayList<String> list_temp = new ArrayList<String>();
            ArrayList<String> id_list = new ArrayList<String>();

            for (String i : list) {
                array = i.split("\n");
                list_temp.add(array[0]);
            }

            for (String i : list_temp) {
                String[] temp = i.split("/");
                id_list.add(temp[1]);
            }

            for (String tmp : id_list) {
                if (id.equals(tmp)) {
                    is.close();
                    return false;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    public void register() {

        Scanner sc = new Scanner(System.in);

        System.out.println("이름 : ");
        name = sc.nextLine();

        System.out.println("아이디 : ");
        id = sc.nextLine();

        System.out.println("비밀번호 : ");
        ps = sc.nextLine();

        String s = "/";
        String n = "\n";

        if (CompareID()) {
            try {
                File file = new File(URL);
                FileWriter writer;
                writer = new FileWriter(file, true);
                writer.write(name);
                writer.write(s);
                writer.write(id);
                writer.write(s);
                writer.write(ps);
                writer.write(n);
                writer.flush();
                writer.close();

                System.out.print("회원가입 완료");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.print("회원가입 실패");
        }
    }
}
