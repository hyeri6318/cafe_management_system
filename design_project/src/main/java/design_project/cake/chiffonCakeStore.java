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
public class chiffonCakeStore extends cakeStore {

    protected cake createCake(String item) {
        cake cake = null;
        cakeIngredientFactory factory = new whippedIngredientFactory();

        if (item.equals("사과")) {
            cake = new appleCake((cakeIngredientFactory) factory);
            cake.setName("Apple Chiffon Cake");
        } else if (item.equals("블루베리")) {
            cake = new blueberryCake((cakeIngredientFactory) factory);
            cake.setName("Blueberry Chiffon Cake");
        } else if (item.equals("체리")) {
            cake = new cherryCake((cakeIngredientFactory) factory);
            cake.setName("Cherry Chiffon Cake");
        }
        return cake;
    }
}
