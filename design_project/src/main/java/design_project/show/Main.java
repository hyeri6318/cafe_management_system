/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_project.show;

/**
 *
 * @author lhl63
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*
    orderstatusData orderstatusData = new orderstatusData();
    DessertorderDisplay_1 dessertorderDisplay
         = new DessertorderDisplay_1(orderstatusData);
    
     BeverageorderDisplay_2 BeverageorderDisplay
         = new BeverageorderDisplay_2 (orderstatusData);
    
     orderstatusData.setmeasurements(8,9,4);
     orderstatusData.setmeasurements(2,5,6);
     orderstatusData.setmeasurements(3,4,7);
    
    }
         */
        OrderstatusData orderstatusData = new OrderstatusData();
        DessertorderDisplay_1 dessertorderDisplay
                = new DessertorderDisplay_1(orderstatusData);

        BeverageorderDisplay_2 BeverageorderDisplay
                = new BeverageorderDisplay_2(orderstatusData);

        orderstatusData.setmeasurements(8, 9, 4);
        orderstatusData.setmeasurements(2, 5, 6);
        orderstatusData.setmeasurements(3, 4, 7);

    }
}
