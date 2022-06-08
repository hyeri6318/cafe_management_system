/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_project.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mikwang
 */
public class OrderData {

    private List<Observer> observers;
    public String type;
    public String ID;
    public String Description;
    public int cost;
    public int otime;
    Observer console = new Console();
    Observer file = new File();

    public OrderData() {
        observers = new ArrayList<Observer>();
    }

    public void registObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(type, ID, Description, cost, otime);
        }
    }

    public void setMeasurements(String type, String ID, String Description, int cost, int otime) {
        this.type = type;
        this.ID = ID;
        this.Description = Description;
        this.cost = cost;
        this.otime = otime;
        System.out.println(type); //여기까지 정상 반환
        notifyObserver(); //값이 변화했으니까 알리기
        registObserver(console); //콘솔 출력
//        registObserver(file); //텍스트 파일 처리
    }

    public String gettype() {
        return type;
    }

    public String ID() {
        return ID;
    }

    public String getDescription() {
        return Description;
    }

    public int getcost() {
        return cost;
    }

    public int getotime() {
        return otime;
    }

}
