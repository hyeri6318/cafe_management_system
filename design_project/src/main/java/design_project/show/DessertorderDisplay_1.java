/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_project.show;

import java.util.Scanner;

/**
 *
 * @author 이혜리, 최주호
 */
public class DessertorderDisplay_1 implements Observer, DisplayElement {

    private int production;

    private int time;

    private int waiting;

    private Subject orderstatusData;

    public DessertorderDisplay_1(Subject orderstatusData) {

        this.orderstatusData = orderstatusData;
        orderstatusData.registerobserver(this);

    }

    public void update(int waiting, int production, int time) {
        this.waiting = waiting;
        this.production = production;
        this.time = time;
        display();
    }

    /*
  public void display() {
   System.out.print("\n 디저트 주문현황==>");
      System.out.print("대기 인원 :" + waiting);
   System.out.print("\t 제작 현황 :" + production);
  System.out.print("\t 예상 시간 :" + time);
  }

}
     */
    public void display() {
        Scanner sc = new Scanner(System.in);
        String num = null;

        System.out.print("\n 주문자 정보: ");
        num = sc.nextLine();

        System.out.print("\n 대기시간: 10분");
        System.out.print("\n 제작항목 : 아메리카노, 라떼, 체리케이크");

    }
}
