/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_project.show;

/**
 *
 * @author 이혜리, 최주호
 */
public class BeverageorderDisplay_2 implements Observer, DisplayElement {

    private int production;

    private int time;

    private int waiting;

    private Subject orderstatusData;

    public BeverageorderDisplay_2(Subject orderstatusData) {

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
      System.out.print("\n음료 주문현황==>");
   System.out.print("대기 인원 :" + waiting);
   System.out.print("\t제작 현황 :" + production);
  System.out.print("\t예상 시간 :" + time);
  }
     */
    public void display() {

        System.out.print("\n 제작현황: 40% ");
        System.out.print("제작현황: 60%");
        System.out.print("제작현황: 80%");

    }
}
