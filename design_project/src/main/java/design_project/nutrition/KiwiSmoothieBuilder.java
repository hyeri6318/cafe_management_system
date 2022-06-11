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
public class KiwiSmoothieBuilder implements NutritionBuilder{
    
    Nutrition nutrition;

    public KiwiSmoothieBuilder() {
        nutrition = new Nutrition();
    }

    @Override
    public void Menu() {
        nutrition.setMenu("키위 스무디");
    }

    @Override
    public void caloreis() {
        nutrition.setCalories("180kcal");
    }

    @Override
    public void protein() {
        nutrition.setProtein("5g");
    }

    @Override
    public void carbohydrate() {
        nutrition.setCarbohydrate("20g");
    }

    @Override
    public void fat() {
        nutrition.setFat("5g");
    }

    @Override
    public void sodium() {
        nutrition.setSodium("190mg");
    }

    @Override
    public void sugar() {
        nutrition.setSugar("8g");
    }

    @Override
    public void servingSize() {
        nutrition.setServingSize("150ml");
    }

    @Override
    public Nutrition getNutrition() {
        return nutrition;
    }
}
