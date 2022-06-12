/**
 *최초 작성자 : 윤채민
 *최초 작성일 : 2022-06-11
 */
package design_project.observer;

public class ConsoleObserver implements Observer{
    public String Description;
    public int cost;
    public int otime;
    private Subject orderdata;
    
    public ConsoleObserver(Subject orderdata){
        this.orderdata = orderdata;
        orderdata.registerObserver(this);
    }
    
    //입력된 값 불러오기
    public void update(String type, String ID, String Description, int cost, int otime){
        this.Description = Description;
        this.cost= cost;
        this.otime=otime;
        display();
    }

    //콘솔에 출력
    public void display(){
        System.out.println("메뉴: " + Description);
        System.out.println("가격: " + cost);
        System.out.println("제작 소요 시간: " + otime);
    }
}
