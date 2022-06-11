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
public class LatteBuilder implements NutritionBuilder {

    Nutrition nutrition;

    public LatteBuilder() {
        nutrition = new Nutrition();
    }

    @Override
    public void Menu() {
        nutrition.setMenu("라떼");
    }

    @Override
    public void caloreis() {
        nutrition.setCalories("30cal");
    }

    @Override
    public void protein() {
        nutrition.setProtein("1g");
    }

    @Override
    public void carbohydrate() {
        nutrition.setCarbohydrate("3g");
    }

    @Override
    public void fat() {
        nutrition.setFat("2g");
    }

    @Override
    public void sodium() {
        nutrition.setSodium("120mg");
    }

    @Override
    public void sugar() {
        nutrition.setSugar("8g");
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
