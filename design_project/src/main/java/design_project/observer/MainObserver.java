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
public class MainObserver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String type = "test_type";
        String ID = "test_ID";
        String Description = "test_Description";
        int cost = 10;
        int otime = 20;
        
        OrderData orderdata = new OrderData();
        Console console = new Console(orderdata);
        File file = new File(orderdata);
        
        orderdata.setMeasurements(type, ID, Description, cost, otime);
        orderdata.setMeasurements(type, ID, Description, cost, otime);
    }
    
}
