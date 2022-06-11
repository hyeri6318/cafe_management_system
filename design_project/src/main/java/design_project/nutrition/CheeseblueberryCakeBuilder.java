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
public class CheeseblueberryCakeBuilder implements NutritionBuilder{
    
    Nutrition nutrition;

    public CheeseblueberryCakeBuilder() {
        nutrition = new Nutrition();
    }

    @Override
    public void Menu() {
        nutrition.setMenu("치즈 블루베리 케이크");
    }

    @Override
    public void caloreis() {
        nutrition.setCalories("300kcal");
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
        nutrition.setFat("9g");
    }

    @Override
    public void sodium() {
        nutrition.setSodium("160mg");
    }

    @Override
    public void sugar() {
        nutrition.setSugar("11g");
    }

    @Override
    public void servingSize() {
        nutrition.setServingSize("120g");
    }

    @Override
    public Nutrition getNutrition() {
        return nutrition;
    }
}
