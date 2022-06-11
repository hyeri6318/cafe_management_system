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
public class CheeseappleCakeBuilder implements NutritionBuilder{
    
    Nutrition nutrition;

    public CheeseappleCakeBuilder() {
        nutrition = new Nutrition();
    }

    @Override
    public void Menu() {
        nutrition.setMenu("사과 치즈 케이크");
    }

    @Override
    public void caloreis() {
        nutrition.setCalories("250kcal");
    }

    @Override
    public void protein() {
        nutrition.setProtein("3g");
    }

    @Override
    public void carbohydrate() {
        nutrition.setCarbohydrate("25g");
    }

    @Override
    public void fat() {
        nutrition.setFat("8g");
    }

    @Override
    public void sodium() {
        nutrition.setSodium("110mg");
    }

    @Override
    public void sugar() {
        nutrition.setSugar("15g");
    }

    @Override
    public void servingSize() {
        nutrition.setServingSize("80g");
    }

    @Override
    public Nutrition getNutrition() {
        return nutrition;
    }
}
