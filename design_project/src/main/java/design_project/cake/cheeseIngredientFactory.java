package design_project.cake;

/**
 *
 * @author 윤채민, 이혜리
 */
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