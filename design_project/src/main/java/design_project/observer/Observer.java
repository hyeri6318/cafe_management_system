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
public interface Observer {
    void update(String type, String ID, String Description, int cost, int otime); //메뉴종류, 사용자ID, 메뉴이름, 가격, 시간
}
