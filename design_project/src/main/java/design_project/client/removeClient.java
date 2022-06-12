/**
 *최초 작성자 : 이혜리, 이재혁
 *최초 작성일 : 2022-06-01
 * 목적 : 
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

public class removeClient {

    String url = CreateFile.URL + "\\client.txt";
    String ID = null;

    public void doRemove() {
        Scanner sc = new Scanner(System.in);

        System.out.println("아이디 : ");
        ID = sc.nextLine();

        remove();
    }

    public void remove() {
        try {
            String str;
            String[] array = null;

            BufferedReader is = new BufferedReader(new FileReader(url));

            Path path = Paths.get(url);

            Charset cs = StandardCharsets.UTF_8;

            ArrayList<String> list = new ArrayList<String>();
            list = (ArrayList<String>) Files.readAllLines(path, cs);

            ArrayList<String> list_temp = new ArrayList<String>();
            ArrayList<String> name_list = new ArrayList<String>();
            ArrayList<String> id_list = new ArrayList<String>();
            ArrayList<String> pw_list = new ArrayList<String>();

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
                        writer.write(name_list.get(i));
                        writer.write(s);
                        writer.write(id_list.get(i));
                        writer.write(s);
                        writer.write(pw_list.get(i));
                        writer.write(n);

                        writer.flush(); // 출력은 버퍼에 쌓여있기에 쌓인 버퍼를 목적지로 보내줌
                    }
                }
                end = 0;
                System.out.println("회원 탈퇴 성공\n");
            }

            if (end == -1) {
                System.out.println("없는 정보 입니다.\n");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
