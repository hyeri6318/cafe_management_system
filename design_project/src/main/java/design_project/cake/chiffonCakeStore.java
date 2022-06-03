/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_project.cake;

/**
 *
 * @author 윤채민
 */
public class chiffonCakeStore extends cakeStore {
  protected cake createCake(String item) {
        cake cake = null;
        cakeIngredientFactory factory = new chiffonIngredientFactory();

        if(item.equals("사과")){
            cake = new appleCake((chiffonIngredientFactory) factory);
            cake.setName("사과 쉬폰케이크");
        }else if(item.equals("블루베리")){
            cake = new blueberryCake((chiffonIngredientFactory) factory);
            cake.setName("블루베리 쉬폰케이크");
        }else if(item.equals("체리")){
            cake = new cherryCake((chiffonIngredientFactory) factory);
            cake.setName("체리 쉬폰케이크");
        }
        return cake;
    }
}
