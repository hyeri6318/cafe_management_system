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

    //옵저버 등록
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    //옵저버 삭제
    public void removeObserver(Observer observer) {
        //배열에 들어간 내용 삭제하기
        observers.remove(observer);
    }

    //옵저버에 변경값 알림
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(type, ID, Description, cost, otime);
        }
    }

    //입력받은 값 저장 및 알림 메소드 실행
    public void setMeasurements(String type, String ID, String Description, int cost, int otime) {
        this.type = type;
        this.ID = ID;
        this.Description = Description;
        this.cost = cost;
        this.otime = otime;
        notifyObserver();
    }

    //음료 저장 타입 불러오기
    public String gettype() {
        return type;
    }

    //ID 불러오기
    public String getID() {
        return ID;
    }

    //메뉴 이름 불러오기
    public String getDescription() {
        return Description;
    }

    //가격 불러오기
    public int getcost() {
        return cost;
    }

    //시간 불러오기
    public int otime() {
        return otime;
    }
}
