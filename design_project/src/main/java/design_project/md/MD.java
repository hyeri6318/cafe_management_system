/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_project.md;

import design_project.FileSystem.CreateFile;
import design_project.client.Login;
import java.io.File;
import java.io.FileWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 *
 * @author 이혜리
 */
public abstract class MD {

    String url = CreateFile.URL + "\\order.txt";

    Scanner sc = new Scanner(System.in);
    int response = 0;

    MD mdName = null;
    String md_name = null;
    String md_message = null;
    String md_wrap = null;
    String md_cost = null;
    String md_result = null;

    protected wrapBehavior wrapbehavior;
    protected messageBehavior messagebehavior;

    public abstract String cost();

    public abstract String exhibit();

    public String performMessage() {
        return messagebehavior.message();
    }

    public String performWrap() {
        return wrapbehavior.wrap();
    }

    public void setMessageBehavior(messageBehavior mb) {
        messagebehavior = mb;
    }

    public void setWrapBehavior(wrapBehavior wb) {
        wrapbehavior = wb;
    }

    public void buy() {
        boolean question1 = true;

        while (question1) {
            System.out.println("MD를 주문하시겠습니까?\n 1.예 2.아니오");
            response = sc.nextInt();

            if (response == 1) {
                System.out.println("MD를 주문합니다.");
                md_buy();
                break;
            } else if (response == 2) {
                System.out.println("MD를 주문하지 않습니다.");
                question1 = false;
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }

    public void md_buy() {
        boolean question2 = true;

        while (question2) {
            System.out.println("주문할 MD를 선택해 주세요.\n 1.텀블러 2.다이어리 3.컵 4.티백");
            response = sc.nextInt();

            if (response == 1) {
                mdName = new tumbler();
                md_extra1();
                break;
            } else if (response == 2) {
                mdName = new diary();
                md_extra1();
                break;
            } else if (response == 3) {
                mdName = new cup();
                md_extra1();
                break;
            } else if (response == 4) {
                mdName = new teabag();
                md_extra1();
                break;
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }

    public void md_extra1() {
        boolean question3 = true;

        while (question3) {
            System.out.println("1.메시지 작성하기 2.메시지 작성 안함");
            response = sc.nextInt();

            if (response == 1) {
                md_message();
                break;
            } else if (response == 2) {
                mdName.setMessageBehavior(new unmessage());
                extra2();
                break;
            } else {
                System.out.println("잘못된 입력입니다");
            }
        }
    }

    public void md_message() {
        boolean question4 = true;

        while (question4) {
            System.out.println("1.생일축하합니다. 2. 사랑합니다. 3. 건강하세요.");
            response = sc.nextInt();

            if (response == 1) {
                mdName.setMessageBehavior(new happyBirth());
                extra2();
                break;
            } else if (response == 2) {
                mdName.setMessageBehavior(new love());
                extra2();
                break;
            } else if (response == 3) {
                mdName.setMessageBehavior(new takeCare());
                extra2();
                break;
            } else {
                System.out.println("잘못된 입력입니다");
            }
        }
    }

    public void extra2() {
        boolean question5 = true;

        while (question5) {
            System.out.println("1.포장하기 2.포장 안함");
            response = sc.nextInt();

            if (response == 1) {
                md_wrap();
                break;
            } else if (response == 2) {
                mdName.setWrapBehavior(new unwrap());
                MD_Final();
                md_last();
                break;
            } else {
                System.out.println("잘못된 입력입니다");
            }
        }
    }

    public void md_wrap() {
        boolean question6 = true;

        while (question6) {
            System.out.println("1.택배 포장 2.선물 포장");
            response = sc.nextInt();

            if (response == 1) {
                mdName.setWrapBehavior(new deliveryWrap());
                MD_Final();
                md_last();
                break;
            } else if (response == 2) {
                mdName.setWrapBehavior(new giftWrap());
                MD_Final();
                md_last();
                break;
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }

    public void md_last() {
        boolean question7 = true;

        while (question7) {
            System.out.println("MD 상품을 더 구매하시겠습니까?\n 1.예 2.아니오");
            response = sc.nextInt();

            if (response == 1) {
                md_buy();
                break;
            } else if (response == 2) {
                System.out.println("MD 주문 완료");
                break;
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }

    public void MD_Final() {
        md_name = mdName.exhibit();
        md_message = mdName.performMessage();
        md_wrap = mdName.performWrap();
        md_cost = mdName.cost();

        md_result = md_name + md_message + md_wrap + md_cost;
        createFile();
    }

    public void createFile() {
        try {
            String s = "/";
            String n = "\n";

            File file = new File(url);
            FileWriter writer;

            Charset cs = StandardCharsets.UTF_8;

            writer = new FileWriter(file, true);
            writer.write("MD");
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
            writer.write(md_result);
            writer.write(n);

            writer.flush();
            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
