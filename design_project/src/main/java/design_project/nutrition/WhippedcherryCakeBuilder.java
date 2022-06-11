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
public class WhippedcherryCakeBuilder implements NutritionBuilder{
        
    Nutrition nutrition;

    public WhippedcherryCakeBuilder() {
        nutrition = new Nutrition();
    }

    @Override
    public void Menu() {
        nutrition.setMenu("체리 생크림 케이크");
    }

    @Override
    public void caloreis() {
        nutrition.setCalories("290kcal");
    }

    @Override
    public void protein() {
        nutrition.setProtein("6g");
    }

    @Override
    public void carbohydrate() {
        nutrition.setCarbohydrate("21g");
    }

    @Override
    public void fat() {
        nutrition.setFat("9g");
    }

    @Override
    public void sodium() {
        nutrition.setSodium("140mg");
    }

    @Override
    public void sugar() {
        nutrition.setSugar("9g");
    }

    @Override
    public void servingSize() {
        nutrition.setServingSize("130g");
    }

    @Override
    public Nutrition getNutrition() {
        return nutrition;
    }
}
