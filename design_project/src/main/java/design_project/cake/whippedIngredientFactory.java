package design_project.cake;

/**
 *
 * @author 윤채민
 */
public class whippedIngredientFactory implements cakeIngredientFactory {
    public fruit createFruit(){
        return new strawberry();
    }
    
    public topping createTopping(){
        return new chocolate();
    }
}