/**
 *최초 작성자 : 윤채민
 *최초 작성일 : 2022-05-30
 * 목적 : 토핑 정보(샷)를 구현하는 클래스
 */
package design_project.beverage;

public class shot extends extra {
    public String gettoppingDescription(){
        return "shot ";
    }
    public int gettoppingNumDescription(){
        return 1;
    }
    public int getcostDescription(){
        return 500;
    }
    public int gettimeDescription(){
        return 1;
    }
}