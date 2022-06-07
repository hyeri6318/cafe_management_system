/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_project.cake;

/**
 *
 * @author 윤채민, 이혜리
 */
public class appleCake extends cake {
    private cakeIngredientFactory ingredientFactory;

    public appleCake(cakeIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void cook() {
        System.out.println(name);
        this.fruit = ingredientFactory.createFruit();
        this.topping = ingredientFactory.createTopping();
    }
}