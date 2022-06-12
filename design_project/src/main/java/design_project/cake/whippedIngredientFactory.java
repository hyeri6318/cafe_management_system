/**
 *최초 작성자 : 윤채민, 이혜리
 *최초 작성일 : 2022-06-03
 * 목적 : 실질적인 객체 생성을 담당
 */
package design_project.cake;

public class whippedIngredientFactory implements cakeIngredientFactory {
    //생크림케이크 과일 추가
    public fruit createFruit(){
        return new strawberry();
    }
    
    //생크림케이크 토핑 추가
    public topping createTopping(){
        return new chocolate();
    }
}