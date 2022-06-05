/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_project.client;

import design_project.FileSystem.CreateFile;
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
 * @author 이혜리, 이재혁
 */
public class changePW {

    String url = CreateFile.URL + "\\client.txt";

    String Name = null;
    String ID = null;
    String PW = null;
    String npw1 = null;

    ArrayList<String> name_list = new ArrayList<String>();
    ArrayList<String> id_list = new ArrayList<String>();
    ArrayList<String> pw_list = new ArrayList<String>();

    public void doChangePW() {
        Scanner sc = new Scanner(System.in);

        System.out.println("이름 : ");
        Name = sc.nextLine();

        System.out.println("아이디 : ");
        ID = sc.nextLine();

        System.out.println("현재 비밀번호 : ");
        PW = sc.nextLine();

        System.out.println("새 비밀번호 : ");
        npw1 = sc.nextLine();

        check();
    }

    private boolean ComparePW(int index) {
        if ((Name.equals(name_list.get(index))) && (ID.equals(id_list.get(index))) && (PW.equals(pw_list.get(index)))) {
            return true;
        } else {
            return false;
        }
    }

    public void rewrite() {   //변경하고 메모장에 다시 저장
        try {
            File file = new File(url);

            FileWriter writer;

            String s = "/";
            String n = "\n";

            writer = new FileWriter(file, false);
            for (int i = 0; i < name_list.size(); i++) {
                writer.write(name_list.get(i));
                writer.write(s);
                writer.write(id_list.get(i));
                writer.write(s);
                writer.write(pw_list.get(i));
                writer.write(n);

                writer.flush();
            }
            writer.close();

            name_list.clear();
            id_list.clear();
            pw_list.clear();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void check() {
        try {
            String str;
            String[] array = null;

            BufferedReader is = new BufferedReader(new FileReader(url));

            Path path = Paths.get(url);

            Charset cs = StandardCharsets.UTF_8;

            ArrayList<String> list = new ArrayList<String>();
            list = (ArrayList<String>) Files.readAllLines(path, cs);

            ArrayList<String> list_temp = new ArrayList<String>();
            is.close();

            for (String i : list) {
                array = i.split("\n");
                list_temp.add(array[0]);
            }

            for (String i : list_temp) {
                String[] temp = i.split("/");

                name_list.add(temp[0]);
                id_list.add(temp[1]);
                pw_list.add(temp[2]);
            }

            int ch = 0;
            for (int i = 0; i < name_list.size(); i++) {
                if (ComparePW(i)) {
                    name_list.set(i, Name);
                    id_list.set(i, ID);
                    pw_list.set(i, npw1);

                    ch = 0;
                    break;
                } else {
                    ch = -1;
                }
            }

            if (ch == -1) {
                System.out.println("기존 정보와 일치하지 않습니다.\n\n");

                name_list.clear();
                id_list.clear();
                pw_list.clear();
                doChangePW();
            } else {
                rewrite();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
