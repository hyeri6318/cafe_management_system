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

    String URL = CreateFile.URL + "\\order.txt";

    Scanner sc = new Scanner(System.in);
    int response = 0;
    String cakeFinal = null;
    protected String name;
    protected fruit fruit;
    protected topping topping;
    String sheetName = null;
    String jamName = null;

    public void cook() {
        System.out.println("요리");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return this.name + '\n'; //토핑 + 과일 + 잼 + 시트 + 케이크 = 초콜릿 딸기 체리 생크림케이크
    }

    public void orderCheck() {
        boolean question1 = true;
        while (question1) {
            System.out.println("케이크를 주문하시겠습니까?\n1.예 2.아니오");
            response = sc.nextInt();
            if (response == 1) {
                System.out.println("케이크를 주문합니다.");
                selectSheet();
                break;
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
                whippedCakeStore createCake = new whippedCakeStore();
                sheetName = "생크림 ";
                selectJam();
                break;
            } else if (response == 2) {
                System.out.println("쉬폰 케이크를 주문합니다.");
                chiffonCakeStore createCake = new chiffonCakeStore();
                sheetName = "쉬폰 ";
                selectJam();
                break;
            } else if (response == 3) {
                System.out.println("치즈 케이크를 주문합니다.");
                cheeseCakeStore cheeseCake = new cheeseCakeStore();
                sheetName = "치즈 ";
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
                jamName = "사과 ";
                cakeFinal = sheetName + jamName + "케이크";
                System.out.println(cakeFinal);
                break;
            } else if (response == 2) {
                System.out.println("블루베리 잼을 선택하셨습니다.");
                jamName = "블루베리 ";
                cakeFinal = sheetName + jamName + "케이크";
                System.out.println(cakeFinal);
                break;
            } else if (response == 3) {
                System.out.println("체리 잼을 선택하셨습니다.");
                jamName = "체리  ";
                cakeFinal = sheetName + jamName + "케이크";
                System.out.println(cakeFinal + "주문 완료");
                break;
            } else {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }
        }
        createFile();
    }

    public void createFile() {
        try {
            String s = "/";
            String n = "\n";

            File file = new File(URL);
            FileWriter writer;

            Charset cs = StandardCharsets.UTF_8;

            writer = new FileWriter(file, true);
            writer.write(Login.id);
            writer.write(s);
            writer.write(cakeFinal);
            writer.write(n);

            writer.flush();
            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
