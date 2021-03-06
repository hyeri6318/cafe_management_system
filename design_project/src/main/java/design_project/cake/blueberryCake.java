/**
 *최초 작성자 : 윤채민, 이혜리
 *최초 작성일 : 2022-06-03
 * 목적 : 케이크의 틀을 가져와서 실제로 완성된 케이크의 완성품
 */
package design_project.cake;

public class blueberryCake extends cake {
    private cakeIngredientFactory ingredientFactory;

    public blueberryCake(cakeIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    //과일, 토핑 추가
    public void cook() {
        this.fruit = ingredientFactory.createFruit();
        this.topping = ingredientFactory.createTopping();
    }
}