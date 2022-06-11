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
public class ChiffoncherryCakeBuilder implements NutritionBuilder{
    
    Nutrition nutrition;

    public ChiffoncherryCakeBuilder() {
        nutrition = new Nutrition();
    }

    @Override
    public void Menu() {
        nutrition.setMenu("체리 시폰 케이크");
    }

    @Override
    public void caloreis() {
        nutrition.setCalories("220kcal");
    }

    @Override
    public void protein() {
        nutrition.setProtein("7g");
    }

    @Override
    public void carbohydrate() {
        nutrition.setCarbohydrate("20g");
    }

    @Override
    public void fat() {
        nutrition.setFat("4g");
    }

    @Override
    public void sodium() {
        nutrition.setSodium("190mg");
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
