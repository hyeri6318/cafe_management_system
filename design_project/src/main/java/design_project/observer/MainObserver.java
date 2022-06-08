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
public class MainObserver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //테스트를 위한 임의 값 지정, 추후 메인 클래스에서 받아오도록 수정 필요
        String type = "type_test";
        String ID = "ycm_test";
        String Description = "description_test";
        int cost = 1313;
        int otime = 2424;
        
        OrderData orderdata = new OrderData();
        Observer console = new Console();
        Observer file = new File();
        
        //옵저버 신규 등록, 메뉴 주문 후 실행
        orderdata.setMeasurements(type, ID, Description, cost, otime);
//        orderdata.registObserver(console);
//         orderdata.registObserver(file);
        
        //옵저버 삭제, 픽업 후 실행
//        orderdata.removeObserver(console);
//        orderdata.removeObserver(file);
        
        //register, remove 이후 실행
//        orderdata.notifyObserver();
//        orderdata.notifyObserver();
    }
    
}
