/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_project.beverage;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author 윤채민
 */
public abstract class beverage {

    public String Description = "beverage";

    public abstract int cost();

    public String getDescription() {
        return Description;
    }

    Scanner sc = new Scanner(System.in);
    int response = 0;

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
                System.out.println("음료를 주문하지 않습니다.");
                question1 = false;
            } else {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }
        }
    }

    public void selectbeverage() {
        boolean question2 = true;
        while (question2) {
            System.out.println("음료를 선택해주세요.\n1.아메리카노 2.라떼 3.프라푸치노 4.스무디 5.티");
            response = sc.nextInt();
            if (response == 1) {
                System.out.println("아메리카노를 주문합니다.");
                americano americano = new americano();
                Description = "아메리카노 ";
                selectTopping();
                break;
            } else if (response == 2) {
                System.out.println("라떼를 주문합니다.");
                latte latte = new latte();
                Description = "라떼 ";
                selectTopping();
                break;
            } else if (response == 3) {

                System.out.println("프라푸치노 종류를 선택하세요.\n1.초콜릿 2.바닐라");
                response = sc.nextInt();
                if (response == 1) {
                    System.out.println("초콜릿 프라푸치노를 주문합니다.");
                    chocolateFrappuccino chocolateFrappuccino = new chocolateFrappuccino();
                    Description = "초콜릿 프라푸치노 ";
                    selectTopping();
                    break;
                } else if (response == 2) {
                    System.out.println("바닐라 프라푸치노를 주문합니다.");
                    vanillaFrappuccino vanillaFrappuccino = new vanillaFrappuccino();
                    Description = "바닐라 프라푸치노 ";
                    selectTopping();
                    break;
                }
            } else if (response == 4) {
                System.out.println("스무디 종류를 선택하세요.\n1.딸기 2.키위");
                response = sc.nextInt();
                if (response == 1) {
                    System.out.println("딸기 스무디를 주문합니다.");
                    strawberrySmoothie strawberrySmoothie = new strawberrySmoothie();
                    Description = "딸기 스무디 ";
                    selectTopping();
                    break;
                } else if (response == 2) {
                    System.out.println("키위 스무디를 주문합니다.");
                    kiwiSmoothie kiwiSmoothie = new kiwiSmoothie();
                    Description = "키위 스무디 ";
                    selectTopping();
                    break;
                }
            } else if (response == 5) {
                System.out.println("차 종류를 선택하세요.\n1.녹차 2.말차");
                response = sc.nextInt();
                if (response == 1) {
                    System.out.println("홍차를 주문합니다.");
                    blacktea blacktea = new blacktea();
                    Description = "홍차 ";
                    selectTopping();
                    break;
                } else if (response == 2) {
                    System.out.println("말차를 주문합니다.");
                    matcha matcha = new matcha();
                    Description = "말차 ";
                    selectTopping();
                    break;
                } else {
                    System.out.println("잘못된 입력입니다. 다시 입력하세요.");
                }
            }
        }
    }

    public void selectTopping() {
        boolean question3 = true;
        String ice = "", whip = "";
        int shot = 0, syrup = 0;
        while (question3) {
            System.out.println("토핑을 선택하세요.\n1.얼음 2.샷 3.휘핑 4.시럽 5.추가 안 함");
            response = sc.nextInt();
            if (response == 1) {
                if (ice.equals("")) {
                    System.out.println("아이스로 주문합니다.");
                    ice = "아이스 ";
                } else if (ice.equals("아이스 ")) {
                    System.out.println("이미 선택한 옵션입니다..");
                }
            } else if (response == 2) {
                System.out.println("샷을 추가합니다.");
                shot++;
            } else if (response == 3) {
                if (ice.equals("")) {
                    System.out.println("휘핑을 추가합니다.");
                    whip = "휘핑 ";
                } else if (whip.equals("휘핑 ")) {
                    System.out.println("이미 선택한 옵션입니다..");
                }
            } else if (response == 4) {
                System.out.println("시럽을 추가합니다.");
                syrup++;
            } else if (response == 5) {
                System.out.println("토핑 추가를 종료합니다.");
                Description = ice + shot + "샷 시럽" + syrup + "펌프 " + Description;
                System.out.println(Description);
                break;
            } else {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }
        }
    }

    public void drinkFinal() {
        //  String URL = "C:\\Users\\yooun\\Desktop\\cafe_test_txt";
        String s = "/";
        String n = "\n";
        try {
            File file = new File("C:\\Users\\yooun\\Desktop\\cafe_test_txt");
            FileWriter writer;
            writer = new FileWriter(file, true);
            writer.write(Description);
           // writer.write(sub);
            writer.write(n);

            writer.flush();
            writer.close();

            System.out.print("음료 주문 완료");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}