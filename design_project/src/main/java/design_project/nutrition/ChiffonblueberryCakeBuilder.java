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
public class ChiffonblueberryCakeBuilder implements NutritionBuilder{
    
    Nutrition nutrition;

    public ChiffonblueberryCakeBuilder() {
        nutrition = new Nutrition();
    }

    @Override
    public void Menu() {
        nutrition.setMenu("블루베리 시폰 케이크");
    }

    @Override
    public void caloreis() {
        nutrition.setCalories("330kcal");
    }

    @Override
    public void protein() {
        nutrition.setProtein("6g");
    }

    @Override
    public void carbohydrate() {
        nutrition.setCarbohydrate("33g");
    }

    @Override
    public void fat() {
        nutrition.setFat("6g");
    }

    @Override
    public void sodium() {
        nutrition.setSodium("200mg");
    }

    @Override
    public void sugar() {
        nutrition.setSugar("19g");
    }

    @Override
    public void servingSize() {
        nutrition.setServingSize("90g");
    }

    @Override
    public Nutrition getNutrition() {
        return nutrition;
    }
}
