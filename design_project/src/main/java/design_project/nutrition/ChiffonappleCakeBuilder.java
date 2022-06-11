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
public class ChiffonappleCakeBuilder implements NutritionBuilder{
    
    Nutrition nutrition;

    public ChiffonappleCakeBuilder() {
        nutrition = new Nutrition();
    }

    @Override
    public void Menu() {
        nutrition.setMenu("사과 시폰 케이크");
    }

    @Override
    public void caloreis() {
        nutrition.setCalories("450kcal");
    }

    @Override
    public void protein() {
        nutrition.setProtein("8g");
    }

    @Override
    public void carbohydrate() {
        nutrition.setCarbohydrate("45g");
    }

    @Override
    public void fat() {
        nutrition.setFat("10g");
    }

    @Override
    public void sodium() {
        nutrition.setSodium("220mg");
    }

    @Override
    public void sugar() {
        nutrition.setSugar("30g");
    }

    @Override
    public void servingSize() {
        nutrition.setServingSize("150g");
    }

    @Override
    public Nutrition getNutrition() {
        return nutrition;
    }
}
