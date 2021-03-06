/**
 *최초 작성자 : 이혜리, 이재혁
 *최초 작성일 : 2022-05-22
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

public class Signup {
    String url = CreateFile.URL + "\\client.txt";

    private String id = null;
    private String ps = null;
    private String name = null;

    public boolean CompareID(String url) {
        try {
            String str;
            String[] array = null;

            BufferedReader is = new BufferedReader(new FileReader(url));
            // 파일 객체 생성
            Path path = Paths.get(url);
            // 캐릭터셋 지정
            Charset cs = StandardCharsets.UTF_8;
            // 파일 내용을 담을 리스트
            ArrayList<String> list = new ArrayList<String>();
            list = (ArrayList<String>) Files.readAllLines(path, cs);
            // 모든 파일 내용 읽어와서 저장
            ArrayList<String> list_temp = new ArrayList<String>();  // 임시 저장
            ArrayList<String> id_list = new ArrayList<String>();    // 아이디 저장

            for (String i : list) {
                array = i.split("\n");
                list_temp.add(array[0]);
            }

            for (String i : list_temp) {
                String[] temp = i.split("/");
                id_list.add(temp[1]);   // 아이디
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

    public void Register() {
        Scanner sc = new Scanner(System.in);

        System.out.println("이름 : ");
        name = sc.nextLine();

        System.out.println("아이디 : ");
        id = sc.nextLine();

        System.out.println("비밀번호 : ");
        ps = sc.nextLine();
        
        Store();
    }

    public void Store() {

        try {
            String s = "/";
            String n = "\n";

            boolean id_temp = CompareID(url);

            if (id_temp) {
                File file = new File(url);
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

                System.out.println("회원가입 완료");
            } else {
                System.out.println("같은 아이디가 존재합니다.");
                Register();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
