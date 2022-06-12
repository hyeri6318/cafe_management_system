/**
 *최초 작성자 : 윤채민
 *최초 작성일 : 2022-05-30
 * 목적 : 음료(바닐라 프라푸치노)의 객체를 생성하고 반환
 */
package design_project.beverage;

public class vanillaFrappuccino extends beverage {
    public vanillaFrappuccino() {
        coffeeDescription = "vanilla frappuccino";
        costDescription = 4000;
        timeDescription = 15;
    }
}