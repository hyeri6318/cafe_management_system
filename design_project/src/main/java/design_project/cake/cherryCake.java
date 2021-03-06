/**
 *최초 작성자 : 윤채민, 이혜리
 *최초 작성일 : 2022-06-03
 */
package design_project.cake;

public class cherryCake extends cake {
    private cakeIngredientFactory ingredientFactory;
    
    public cherryCake(cakeIngredientFactory ingredientFactory){
        this.ingredientFactory=ingredientFactory;
    }
    
    public void cook(){
        this.fruit=ingredientFactory.createFruit();
        this.topping=ingredientFactory.createTopping();
    }
}