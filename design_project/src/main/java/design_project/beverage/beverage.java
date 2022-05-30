/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_project.beverage;

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
    String coffee, option, drink = null;

    //음료 주문 여부 확인
    public void orderCheck() {
        boolean question1 = true;
        System.out.println("음료를 주문하시겠습니까?\n1.예 2.아니오");
        while (question1) {
            response = sc.nextInt();
            if (response == 1) {
                orderBeverage();
                orderOption();
                check();
            } else if (response == 2) {
                System.out.println("케이크 주문으로 넘어갑니다."); //TODO: 케이크 주문 기능으로 넘기기
                question1 = false;
            } else {
                System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }
        }
    }

       //주문 음료 종류 확인
    public void orderBeverage() {
        boolean question2 = true;
        System.out.println("음료를 선택해주세요.\n1.커피 2.라떼 3.프라푸치노 4.스무디 5.티");
        while (question2) {
            response = sc.nextInt();
            switch (response) {
                case 1:
                    beverage americano = new americano();
                    coffee = americano.getDescription() + cost() + "원";
                    //question2 = false;
                    return;
                case 2:
                    beverage latte = new latte();
                    coffee = latte.getDescription() + cost() + "원";
                    //question2 = false;
                    return;
                case 3:
                    boolean question2frappuccino = true;
                    System.out.println("프라푸치노 종류를 선택해 주세요.\n1.초콜릿 2.바닐라");
                    while (question2frappuccino) {
                        response = sc.nextInt();
                        if (response == 1) {
                            beverage chocolateFrappuccino = new chocolateFrappuccino();
                            coffee = chocolateFrappuccino.getDescription() + cost() + "원";
                            //question2frappuccino = false;
                            return;
                        } else if (response == 2) {
                            beverage vanillaFrappuccino = new vanillaFrappuccino();
                            coffee = vanillaFrappuccino.getDescription() + cost() + "원";
                            //question2frappuccino = false;
                            return;
                        } else {
                            System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
                            continue;
                        }
                    }
                case 4:
                    boolean question2smoothie = true;
                    System.out.println("스무디 종류를 선택해 주세요.\n1.딸기 2.키위");
                    while (question2smoothie) {
                        response = sc.nextInt();
                        if (response == 1) {
                            beverage strawberrySmoothie = new strawberrySmoothie();
                            coffee = strawberrySmoothie.getDescription() + cost() + "원";
                            //question2smoothie = false;
                            return;
                        } else if (response == 2) {
                            beverage kiwiSmoothie = new kiwiSmoothie();
                            coffee = kiwiSmoothie.getDescription() + cost() + "원";
                            //question2smoothie = false;
                            return;
                        } else {
                            System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
                            continue;
                        }
                        //question2smoothie = false;
                    }
                case 5:
                    boolean question2tea = true;
                    System.out.println("차 종류를 선택해 주세요.\n1.홍차 2.말차");
                    while (question2tea) {
                        response = sc.nextInt();
                        if (response == 1) {
                            beverage blacktea = new blacktea();
                            coffee = blacktea.getDescription() + cost() + "원";
                            //question2tea = false;
                            return;
                        } else if (response == 2) {
                            beverage matcha = new matcha();
                            coffee = matcha.getDescription() + cost() + "원";
                            //question2tea = false;
                            return;
                        } else {
                            System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
                            continue;
                        }
                        //question2tea = false;
                    }
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }
            System.out.println(coffee + "커피"); //TODO: 지우기
        }
    }

    //주문 토핑 종류 확인
    public void orderOption() {
        boolean question3 = true;
        System.out.println("옵션을 선택하세요.\n1.아이스 2.샷 3.시럽 4.휘핑 5.선택 안 함");
        while (question3) {
            response = sc.nextInt();
            switch (response) {
                case 1:
                    extra ice = new ice();
                    option = option + ice.getDescription() + " ";
                    continue;
                case 2:
                    extra shot = new shot();
                    option = option + shot.getDescription() + " ";
                    continue;
                case 3:
                    extra syrup = new syrup();
                    option = option + syrup.getDescription() + " ";
                    continue;
                case 4:
                    extra whip = new whip();
                    option = option + whip.getDescription() + " ";
                    continue;
                case 5:
                    System.out.println("토핑을 선택하지 않습니다.");
                    return;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }
            System.out.println(option + "옵션"); //TODO: 지우기
        }
    }

    public void check() {
        drink = option + coffee;
        System.out.println(drink);
    }
}
