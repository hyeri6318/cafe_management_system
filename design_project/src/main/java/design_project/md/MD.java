/**
 *최초 작성자 : 이혜리
 *최초 작성일 : 2022-06-02 
 */
package design_project.md;

import design_project.FileSystem.CreateFile;
import design_project.client.Login;
import design_project.observer.ConsoleObserver;
import design_project.observer.FileObserver;
import design_project.observer.OrderData;
import java.io.File;
import java.io.FileWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public abstract class MD {

   Scanner sc = new Scanner(System.in);
    int response = 0;

    MD mdName = null;
    String md_name = null;
    String md_message = null;
    String md_wrap = null;
    int cost = 0;
    String Description = null;
    int otime = 0;
    String type="MD";

    protected wrapBehavior wrapbehavior;
    protected messageBehavior messagebehavior;

    public abstract int cost();

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
            System.out.println("\n MD 상품을 더 구매하시겠습니까?\n 1.예 2.아니오");
            response = sc.nextInt();

            if (response == 1) {
                md_buy();
                break;
            } else if (response == 2) {
                //   MD_Final();
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
        cost = mdName.cost();

        Description = md_name + md_message + md_wrap;

        createFile();
    }

    // design_project.observer를 실행시켜 MD 주문 내역을 저장시키고 콘솔에 출력시킴
    public void createFile() { 
        OrderData orderdata = new OrderData();
        ConsoleObserver console = new ConsoleObserver(orderdata);
        FileObserver file = new FileObserver(orderdata);

        if (Login.id == null) {
            String ID = Login.nid;
            orderdata.setMeasurements(type, ID, Description, cost, otime);
        } else if (Login.nid == null) {
            String ID = Login.id;
            orderdata.setMeasurements(type, ID, Description, cost, otime);
        }
    }
}
