/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_project.observer;

/**
 *
 * @author mikwang
 */
public class Console implements Observer {

    public String Description;
    public int cost;
    public int otime;
    
    public void Console(){
        System.out.println("메뉴: " + Description);
        System.out.println("가격: " + cost);
        System.out.println("제작 소요 시간: " + otime);
    }
    @Override
    public void update(String type, String ID, String Description, int cost, int otime) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
