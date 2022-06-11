package design_project.cake;

/**
 *
 * @author 윤채민, 이혜리
 */
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