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
public class StrawberrySmoothieBuilder implements NutritionBuilder{
    
    Nutrition nutrition;

    public StrawberrySmoothieBuilder() {
        nutrition = new Nutrition();
    }

    @Override
    public void Menu() {
        nutrition.setMenu("딸기 스무디");
    }

    @Override
    public void caloreis() {
        nutrition.setCalories("420kcal");
    }

    @Override
    public void protein() {
        nutrition.setProtein("12g");
    }

    @Override
    public void carbohydrate() {
        nutrition.setCarbohydrate("46g");
    }

    @Override
    public void fat() {
        nutrition.setFat("15g");
    }

    @Override
    public void sodium() {
        nutrition.setSodium("250mg");
    }

    @Override
    public void sugar() {
        nutrition.setSugar("37g");
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
