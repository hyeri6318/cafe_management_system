/**
 *최초 작성자 : 윤채민
 *최초 작성일 : 2022-05-30
 *목적 : 음료 정보를 상속하기 위함
 */
package design_project.beverage;

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

public abstract class beverage {

    String URL = CreateFile.URL + "\\order.txt";
    String type = "beverage";
    String Description = "";
    int cost = 0;
    int otime = 0;
    public String coffeeDescription = "";
    public String toppingDescription = "";
    public int toppingNumDescription = 0;
    public int costDescription = 0;
    public int timeDescription = 0;

    OrderData od = new OrderData() {
    };

    public String getcoffeeDescription() {
        return coffeeDescription;
    }

    public String gettoppingDescription() {
        return toppingDescription;
    }

    public int gettoppingNumDescription() {
        return toppingNumDescription;
    }

    public int getcostDescription() {
        return costDescription;
    }

    public int gettimeDescription() {
        return timeDescription;
    }

    Scanner sc = new Scanner(System.in);
    int response = 0;

    //음료 주문 여부를 확인하는 메소드, 주문하지 않을 시 케이크 주문으로 바로 이동
    public void orderCheck() {
        boolean question1 = true;
        while (question1) {
            System.out.println("음료를 주문하시겠습니까?\n1.예 2.아니오");
            response = sc.nextInt();
            if (response == 1) {
                System.out.println("음료를 주문합니다.");
                selectbeverage();
                break;
            } else if (response == 2) {
                System.out.println("음료를 주문하지 않습니다.\n");
                question1 = false;
            } else {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }
        }
    }

    //주문할 음료 종류를 확인하는 메소드, 선택 후 토핑 추가로 이동
    public void selectbeverage() {
        boolean question2 = true;
        while (question2) {
            System.out.println("음료를 선택해주세요.\n1.아메리카노 2.라떼 3.프라푸치노 4.스무디 5.티");
            response = sc.nextInt();
            if (response == 1) {
                System.out.println("아메리카노를 주문합니다.");
                beverage americano = new americano();
                coffeeDescription = americano.getcoffeeDescription();
                cost += americano.getcostDescription();
                otime += americano.gettimeDescription();
                selectTopping();
                break;
            } else if (response == 2) {
                System.out.println("라떼를 주문합니다.");
                beverage latte = new latte();
                coffeeDescription = latte.getcoffeeDescription();
                cost += latte.getcostDescription();
                otime += latte.gettimeDescription();
                selectTopping();
                break;
            } else if (response == 3) {

                System.out.println("프라푸치노 종류를 선택하세요.\n1.초콜릿 2.바닐라");
                response = sc.nextInt();
                if (response == 1) {
                    System.out.println("초콜릿 프라푸치노를 주문합니다.");
                    chocolateFrappuccino chocolateFrappuccino = new chocolateFrappuccino();
                    coffeeDescription = chocolateFrappuccino.getcoffeeDescription();
                    cost += chocolateFrappuccino.getcostDescription();
                    otime += chocolateFrappuccino.gettimeDescription();
                    selectTopping();
                    break;
                } else if (response == 2) {
                    System.out.println("바닐라 프라푸치노를 주문합니다.");
                    vanillaFrappuccino vanillaFrappuccino = new vanillaFrappuccino();
                    coffeeDescription = vanillaFrappuccino.getcoffeeDescription();
                    cost += vanillaFrappuccino.getcostDescription();
                    otime += vanillaFrappuccino.gettimeDescription();
                    selectTopping();
                    break;
                }
            } else if (response == 4) {
                System.out.println("스무디 종류를 선택하세요.\n1.딸기 2.키위");
                response = sc.nextInt();
                if (response == 1) {
                    System.out.println("딸기 스무디를 주문합니다.");
                    strawberrySmoothie strawberrySmoothie = new strawberrySmoothie();
                    coffeeDescription = strawberrySmoothie.getcoffeeDescription();
                    cost += strawberrySmoothie.getcostDescription();
                    otime += strawberrySmoothie.gettimeDescription();
                    selectTopping();
                    break;
                } else if (response == 2) {
                    System.out.println("키위 스무디를 주문합니다.");
                    kiwiSmoothie kiwiSmoothie = new kiwiSmoothie();
                    coffeeDescription = kiwiSmoothie.getcoffeeDescription();
                    cost += kiwiSmoothie.getcostDescription();
                    otime += kiwiSmoothie.gettimeDescription();
                    selectTopping();
                    break;
                }
            } else if (response == 5) {
                System.out.println("차 종류를 선택하세요.\n1.홍차 2.말차");
                response = sc.nextInt();
                if (response == 1) {
                    System.out.println("홍차를 주문합니다.");
                    blacktea blacktea = new blacktea();
                    coffeeDescription = blacktea.getcoffeeDescription();
                    cost += blacktea.getcostDescription();
                    otime += blacktea.gettimeDescription();
                    selectTopping();
                    break;
                } else if (response == 2) {
                    System.out.println("말차를 주문합니다.");
                    matcha matcha = new matcha();
                    coffeeDescription = matcha.getcoffeeDescription();
                    cost += matcha.getcostDescription();
                    otime += matcha.gettimeDescription();
                    selectTopping();
                    break;
                }
            } else {
                System.out.println("잘못된 입력입니다. 다시 입력하세요.");
            }
        }
    }

    //토핑 종류 선택
    public void selectTopping() {
        boolean question3 = true;
        String toppingIce = "", toppingWhip = "";
        int shotNum = 0, syrupNum = 0;
        while (question3) {
            System.out.println("토핑을 선택하세요.\n1.얼음 2.샷 3.휘핑 4.시럽 5.추가 안 함");
            response = sc.nextInt();
            if (response == 1) {
                if (toppingIce.equals("")) {
                    System.out.println("아이스로 주문합니다.");
                    ice ice = new ice();
                    toppingIce = ice.gettoppingDescription();
                    cost += ice.getcostDescription();
                    otime += ice.gettimeDescription();
                    toppingIce = "iced ";
                } else {
                    System.out.println("이미 선택한 옵션입니다.");
                }
            } else if (response == 2) {
                if (shotNum == 0) {
                    System.out.println("샷을 추가합니다.");
                    shot shot = new shot();
                    toppingDescription += shot.gettoppingDescription();
                    shotNum += shot.gettoppingNumDescription();
                    cost += shot.getcostDescription();
                    otime += shot.gettimeDescription();
                } else {
                    System.out.println("샷을 추가합니다.");
                    shot shot = new shot();
                    shotNum += shot.gettoppingNumDescription();
                    cost += shot.getcostDescription();
                    otime += shot.gettimeDescription();
                }
            } else if (response == 3) {
                if (toppingWhip.equals("")) {
                    whip whip = new whip();
                    toppingWhip = whip.gettoppingDescription();
                    cost += whip.getcostDescription();
                    otime += whip.gettimeDescription();
                    toppingWhip = "whip";
                } else if (toppingWhip.equals("whip")) {
                    System.out.println("이미 선택한 옵션입니다.");
                }
            } else if (response == 4) {
                if (syrupNum == 0) {
                    System.out.println("시럽을 추가합니다.");
                    syrup syrup = new syrup();
                    toppingDescription += syrup.gettoppingDescription();
                    syrupNum += syrup.gettoppingNumDescription();
                    cost += syrup.getcostDescription();
                    otime += syrup.gettimeDescription();
                } else {
                    System.out.println("시럽을 추가합니다.");
                    syrup syrup = new syrup();
                    syrupNum += syrup.gettoppingNumDescription();
                    cost += syrup.getcostDescription();
                    otime += syrup.gettimeDescription();
                }
            } else if (response == 5) {
                System.out.println("토핑 추가를 종료합니다.\n");
                Description = toppingIce + shotNum + "shot " + toppingWhip + syrupNum + "syrup " + coffeeDescription;
                createFile();
                beverage_last();
                break;
            } else {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }
        }
    }

    //음료 추가 주문 여부 확인
    public void beverage_last() {
        boolean question4 = true;

        while (question4) {
            System.out.println("\n음료를 더 주문하시겠습니까?\n1.예 2.아니오");
            response = sc.nextInt();

            if (response == 1) {
                selectbeverage();
                break;
            } else if (response == 2) {
                System.out.println("음료 주문 완료\n");
                break;
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }

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
        cost = 0;
    }
}
