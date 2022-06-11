/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_project.nutrition;

/**
 *
 * @author 이혜리
 */
public class AmericanoBuilder implements NutritionBuilder{
    Nutrition nutrition;
    
    public AmericanoBuilder(){
        nutrition= new Nutrition();
    }

    @Override
    public void Menu() {
        nutrition.setMenu("아메리카노");
    }

    @Override
    public void caloreis() {
       nutrition.setCalories("250kcal");
    }

    @Override
    public void protein() {
        nutrition.setProtein("5g");
    }

    @Override
    public void carbohydrate() {
        nutrition.setCarbohydrate("30g");
    }

    @Override
    public void fat() {
        nutrition.setFat("6g");
    }

    @Override
    public void sodium() {
        nutrition.setSodium("150mg");
    }

    @Override
    public void sugar() {
        nutrition.setSugar("10g");
    }

    @Override
    public void servingSize() {
        nutrition.setServingSize("200ml");
    }

    @Override
    public Nutrition getNutrition() {
        return nutrition;
    }
    
}
