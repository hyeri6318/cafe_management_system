/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_project.observer;

/**
 *
 * @author 윤채민
 */
public class ConsoleObserver implements Observer{
    public String Description;
    public int cost;
    public int otime;
    private Subject orderdata;
    
    
    public ConsoleObserver(Subject orderdata){
        this.orderdata = orderdata; //할 필요 없음, register가 하면 됨
        orderdata.registerObserver(this);
    }
    
    public void update(String type, String ID, String Description, int cost, int otime){
        this.Description = Description;
        this.cost= cost;
        this.otime=otime;
        display();
    }

    public void display(){
        System.out.println("메뉴: " + Description);
        System.out.println("가격: " + cost);
        System.out.println("제작 소요 시간: " + otime);
    }
}
