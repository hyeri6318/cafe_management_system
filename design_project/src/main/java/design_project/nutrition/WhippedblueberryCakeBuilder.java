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
public class WhippedblueberryCakeBuilder implements NutritionBuilder{
        
    Nutrition nutrition;

    public WhippedblueberryCakeBuilder() {
        nutrition = new Nutrition();
    }

    @Override
    public void Menu() {
        nutrition.setMenu("블루베리 생크림 케이크");
    }

    @Override
    public void caloreis() {
        nutrition.setCalories("80kcal");
    }

    @Override
    public void protein() {
        nutrition.setProtein("1g");
    }

    @Override
    public void carbohydrate() {
        nutrition.setCarbohydrate("10g");
    }

    @Override
    public void fat() {
        nutrition.setFat("3g");
    }

    @Override
    public void sodium() {
        nutrition.setSodium("80mg");
    }

    @Override
    public void sugar() {
        nutrition.setSugar("7g");
    }

    @Override
    public void servingSize() {
        nutrition.setServingSize("50g");
    }

    @Override
    public Nutrition getNutrition() {
        return nutrition;
    }
}
