/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_project.pickup;

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
 * @author 이혜리
 */
public class Pickup {

    String url = CreateFile.URL + "\\order.txt";
    String ID = null;

    public void show() {
        Scanner sc = new Scanner(System.in);

        System.out.println("픽업");
        System.out.println("아이디 입력");
        ID = sc.nextLine();

        pickup_remove();
    }

    public void pickup_remove() {
        try {
            String str;
            String[] array = null;

            BufferedReader is = new BufferedReader(new FileReader(url));

            Path path = Paths.get(url);

            Charset cs = StandardCharsets.UTF_8;

            ArrayList<String> list = new ArrayList<String>();
            list = (ArrayList<String>) Files.readAllLines(path, cs);

            ArrayList<String> list_temp = new ArrayList<String>();
            ArrayList<String> sort_list = new ArrayList<String>();
            ArrayList<String> id_list = new ArrayList<String>();
            ArrayList<String> order_list = new ArrayList<String>();

            for (String i : list) {
                array = i.split("\n");
                list_temp.add(array[0]);
            }

            for (String i : list_temp) {
                String[] temp = i.split("/");

                sort_list.add(temp[0]);
                id_list.add(temp[1]);
                order_list.add(temp[2]);
            }

            int ch = -1; // 0이면 true, -1이면 false

            for (int i = 0; i < id_list.size(); i++) {
                if (ID.equals(id_list.get(i))) {
                    ch = 0;
                    break;
                }
            }

            int end = -1; //0은 정상 삭제. -1은 정보가 없는경우

            if (ch == 0) {
                File file = new File(url);
                FileWriter writer;
                writer = new FileWriter(file, false);

                for (int i = 0; i < id_list.size(); i++) {
                    if (ID.equals(id_list.get(i))) {
                        continue;
                    } else {
                        String s = "/";
                        String n = "\n";
                        writer.write(sort_list.get(i));
                        writer.write(s);
                        writer.write(id_list.get(i));
                        writer.write(s);
                        writer.write(order_list.get(i));
                        writer.write(n);

                        writer.flush();
                    }
                }
                end = 0;
                System.out.println("픽업 완료\n");
            }

            if (end == -1) {
                System.out.println("아이디 불일치\n");
                show();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
