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
public class ChocolateFrappuccinoBuilder implements NutritionBuilder{
    
    Nutrition nutrition;

    public ChocolateFrappuccinoBuilder() {
        nutrition = new Nutrition();
    }

    @Override
    public void Menu() {
        nutrition.setMenu("초코릿 프라푸치노");
    }

    @Override
    public void caloreis() {
        nutrition.setCalories("360kcal");
    }

    @Override
    public void protein() {
        nutrition.setProtein("2g");
    }

    @Override
    public void carbohydrate() {
        nutrition.setCarbohydrate("35g");
    }

    @Override
    public void fat() {
        nutrition.setFat("5g");
    }

    @Override
    public void sodium() {
        nutrition.setSodium("230mg");
    }

    @Override
    public void sugar() {
        nutrition.setSugar("26g");
    }

    @Override
    public void servingSize() {
        nutrition.setServingSize("150ml");
    }

    @Override
    public Nutrition getNutrition() {
        return nutrition;
    }
}
