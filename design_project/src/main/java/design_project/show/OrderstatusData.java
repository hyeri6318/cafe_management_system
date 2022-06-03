/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_project.show;

import java.util.ArrayList;

/**
 *
 * @author 이혜리, 최주호
 */
public class OrderstatusData implements Subject {

    private int waiting;

    private int production;

    private int time;

    private ArrayList observers;

    public OrderstatusData() {
        observers = new ArrayList();
    }

    public void registerobserver(Observer o) {
        observers.add(o);
    }

    public void removeobserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyobservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(waiting, production, time);
        }

    }

    public void measurementschanged() {
        notifyobservers();
    }

    public void setmeasurements(int waiting, int production, int time) {
        this.waiting = waiting;
        this.production = production;
        this.time = time;
        measurementschanged();
    }

    public int getWaiting() {
        return waiting;
    }

    public int getProduction() {
        return production;
    }

    public int getTime() {
        return time;

    }
}
