/**
 *최초 작성자 : 윤채민
 *최초 작성일 : 2022-05-30
 * 목적 : 토핑 정보(얼음)를 구현하는 클래스
 */
package design_project.beverage;

public class ice extends extra {
    public String gettoppingDescription(){
        return "iced ";
    }
    public int gettoppingNumDescription(){
        return 0;
    }
    public int getcostDescription(){
        return 500;
    }
    public int gettimeDescription(){
        return 1;
    }
}