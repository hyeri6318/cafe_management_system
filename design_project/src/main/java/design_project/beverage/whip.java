/**
 *최초 작성자 : 윤채민
 *최초 작성일 : 
 * 목적 : 토핑 정보(휘핑)를 구현하는 클래스
 */
package design_project.beverage;

public class whip extends extra {
    public String gettoppingDescription(){
        return "whip ";
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