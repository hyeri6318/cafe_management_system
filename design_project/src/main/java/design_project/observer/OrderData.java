/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_project.observer;

import java.util.ArrayList;

/**
 *
 * @author 윤채민
 */
public class OrderData implements Subject {

    private ArrayList observers;
    public String type;
    public String ID;
    public String Description;
    public int cost;
    public int otime;

    public OrderData() {
        observers = new ArrayList();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        //배열에 들어간 내용 삭제하기
        observers.remove(observer);
    }

    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(type, ID, Description, cost, otime);
        }
    }

    public void setMeasurements(String type, String ID, String Description, int cost, int otime) {
        this.type = type;
        this.ID = ID;
        this.Description = Description;
        this.cost = cost;
        this.otime = otime;
        notifyObserver();
    }

    public String gettype() {
        return type;
    }

    public String getID() {
        return ID;
    }

    public String getDescription() {
        return Description;
    }

    public int getcost() {
        return cost;
    }

    public int otime() {
        return otime;
    }
}
