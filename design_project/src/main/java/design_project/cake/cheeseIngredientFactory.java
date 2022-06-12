/**
 *최초 작성자 : 윤채민, 이혜리
 *최초 작성일 : 2022-06-03
 */
package design_project.cake;

public class cheeseIngredientFactory implements cakeIngredientFactory {
    //치즈케이크 과일 설정
    public fruit createFruit() {
        return new mango();
    }

    //치즈케이크 토핑 설정
    public topping createTopping() {
        return new macaroon();
    }
}