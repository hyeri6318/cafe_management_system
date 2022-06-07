package design_project.cake;

/**
 *
 * @author 윤채민
 */
public class cheeseIngredientFactory implements cakeIngredientFactory {
    public fruit createFruit() {
        return new mango();
    }

    public topping createTopping() {
        return new macaroon();
    }
}