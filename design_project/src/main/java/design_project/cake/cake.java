package design_project.cake;

import design_project.FileSystem.CreateFile;
import design_project.client.Login;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author 윤채민
 */
public class cake {

    String url = CreateFile.URL + "\\order.txt";

    String name = "";
    int response = 0;
    String Description = "";

    cake cake = null;
    cakeStore sheet = null;

    protected fruit fruit;
    protected topping topping;

    Scanner sc = new Scanner(System.in);

    public void cook() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void orderCheck() {
        boolean question1 = true;
        while (question1) {
            System.out.println("케이크를 주문하시겠습니까?\n1.예 2.아니오");
            response = sc.nextInt();
            if (response == 1) {
                System.out.println("케이크를 주문합니다.");
                selectSheet();
                //oncreate(cake);
                break; //break랑 boolean false 구분하기
            } else if (response == 2) {
                System.out.println("케이크를 주문하지 않습니다.");
                question1 = false;
            } else {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }
        }
    }

    public void selectSheet() {
        boolean question2 = true;

        while (question2) {
            System.out.println("시트를 선택해 주세요.\n1.생크림 2.쉬폰 3.치즈");
            response = sc.nextInt();

            if (response == 1) {
                System.out.println("생크림 케이크를 주문합니다.");
                cakeStore whippedCakeStore = new whippedCakeStore();
                sheet = whippedCakeStore;       // 클래스의 변수를 수정. this.cake에는 영향이 가지 않음
                selectJam();
                break;
            } else if (response == 2) {
                System.out.println("쉬폰 케이크를 주문합니다.");
                cakeStore chiffonCakeStore = new chiffonCakeStore();
                sheet = chiffonCakeStore;
                selectJam();
                break;
            } else if (response == 3) {
                System.out.println("치즈 케이크를 주문합니다.");
                cakeStore cheeseCakeStore = new cheeseCakeStore();
                sheet = cheeseCakeStore;
                selectJam();
                break;
            } else {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }
        }
    }

    public void selectJam() {
        boolean question3 = true;
        while (question3) {
            System.out.println("잼 종류를 선택해 주세요.\n1.사과 2.블루베리 3.체리");
            response = sc.nextInt();
            if (response == 1) {
                System.out.println("사과 잼을 선택하셨습니다.");
                cake = sheet.orderCake("사과");     // this.cake를 새로 생성된 케이크로 할당. this.cake가 변경됨
                break;
            } else if (response == 2) {
                System.out.println("블루베리 잼을 선택하셨습니다.");
                cake = sheet.orderCake("블루베리");
                break;
            } else if (response == 3) {
                System.out.println("체리 잼을 선택하셨습니다.");
                cake = sheet.orderCake("체리");
                break;
            } else {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }
        }
        this.cake.sheet = sheet;    // 이 코드가 없을 시, this.cake의 sheet와 cake는 null이기 때문에, nullPointerException이 날 수 있음.
        this.cake.cake = cake;
        createFile();
    }

    public void createFile() {
        try {
            Description = cake.cake.getName() + cake.fruit.getName()+cake.topping.getName();   

            String s = "/";
            String n = "\n";

            File file = new File(url);
            FileWriter writer;

            Charset cs = StandardCharsets.UTF_8;

            writer = new FileWriter(file, true);
            writer.write("cake");
            writer.write(s);

            if (Login.id == null) {
                writer.write("");
            } else {
                writer.write(Login.id);
            }

            if (Login.nid == 0) {
                writer.write("");
            } else {
                writer.write(Login.nid);
            }
            writer.write(s);
            writer.write(Description);
            writer.write(n);

            System.out.println("작성완료");

            writer.flush();
            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
