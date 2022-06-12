/**
 *최초 작성자 : 윤채민
 *최초 작성일 : 2022-05-30
 * 목적 : 음료(아메리카노)의 객체를 생성하고 반환
 */
package design_project.beverage;

public class americano extends beverage {
    public americano() {
        coffeeDescription = "americano";
        costDescription = 2000;
        timeDescription = 5;
    }
}