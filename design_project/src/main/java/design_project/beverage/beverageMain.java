/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_project.beverage;

/**
 *
 * @author 윤채민
 */
public class beverageMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        beverage bev = new beverage() {
            @Override
            public int cost() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        bev.orderCheck();
        bev.drinkFinal();
    }
}