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
public class WhippedappleCakeBuilder implements NutritionBuilder{
        
    Nutrition nutrition;

    public WhippedappleCakeBuilder() {
        nutrition = new Nutrition();
    }

    @Override
    public void Menu() {
        nutrition.setMenu("사과 생크림 케이크");
    }

    @Override
    public void caloreis() {
        nutrition.setCalories("600kcal");
    }

    @Override
    public void protein() {
        nutrition.setProtein("10g");
    }

    @Override
    public void carbohydrate() {
        nutrition.setCarbohydrate("55g");
    }

    @Override
    public void fat() {
        nutrition.setFat("12g");
    }

    @Override
    public void sodium() {
        nutrition.setSodium("350mg");
    }

    @Override
    public void sugar() {
        nutrition.setSugar("30g");
    }

    @Override
    public void servingSize() {
        nutrition.setServingSize("200g");
    }

    @Override
    public Nutrition getNutrition() {
        return nutrition;
    }
}
