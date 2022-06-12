/**
 *최초 작성자 : 윤채민
 *최초 작성일 : 2022-06-11
 */
package design_project.observer;

public interface Observer {
    void update(String type, String ID, String Description, int cost, int otime); //메뉴종류, 사용자ID, 메뉴이름, 가격, 시간
}
