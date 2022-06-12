/**
 *최초 작성자 : 윤채민
 *최초 작성일 : 2022-05-30
 * 목적 : 토핑 정보(시럽)을 구현하는 클래스
 */
package design_project.beverage;

public class syrup extends extra {
    public String gettoppingDescription(){
        return "syrup ";
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