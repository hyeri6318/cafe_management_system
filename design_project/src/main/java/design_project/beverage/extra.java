/**
 *최초 작성자 : 윤채민
 *최초 작성일 : 2022-05-30
 * 목적 : 토핑 정보를 상속하는 추상 클래스
 */
package design_project.beverage;

public abstract class extra extends beverage {
    public abstract String gettoppingDescription();
    public abstract int gettoppingNumDescription();
    public abstract int getcostDescription();
    public abstract int gettimeDescription();
}