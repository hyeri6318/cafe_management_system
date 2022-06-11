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
public class BlackteaBuilder implements NutritionBuilder {

    Nutrition nutrition;

    public BlackteaBuilder() {
        nutrition = new Nutrition();
    }

    @Override
    public void Menu() {
        nutrition.setMenu("홍차");
    }

    @Override
    public void caloreis() {
        nutrition.setCalories("50kcal");
    }

    @Override
    public void protein() {
        nutrition.setProtein("2g");
    }

    @Override
    public void carbohydrate() {
        nutrition.setCarbohydrate("18g");
    }

    @Override
    public void fat() {
        nutrition.setFat("5g");
    }

    @Override
    public void sodium() {
        nutrition.setSodium("30mg");
    }

    @Override
    public void sugar() {
        nutrition.setSugar("10g");
    }

    @Override
    public void servingSize() {
        nutrition.setServingSize("100ml");
    }

    @Override
    public Nutrition getNutrition() {
        return nutrition;
    }
}
