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
public class VanillaFrappuccinoBuilder implements NutritionBuilder{
    
    Nutrition nutrition;

    public VanillaFrappuccinoBuilder() {
        nutrition = new Nutrition();
    }

    @Override
    public void Menu() {
        nutrition.setMenu("바닐라 프라푸치노");
    }

    @Override
    public void caloreis() {
        nutrition.setCalories("560kcal");
    }

    @Override
    public void protein() {
        nutrition.setProtein("9g");
    }

    @Override
    public void carbohydrate() {
        nutrition.setCarbohydrate("51g");
    }

    @Override
    public void fat() {
        nutrition.setFat("11g");
    }

    @Override
    public void sodium() {
        nutrition.setSodium("340mg");
    }

    @Override
    public void sugar() {
        nutrition.setSugar("48g");
    }

    @Override
    public void servingSize() {
        nutrition.setServingSize("200ml");
    }

    @Override
    public Nutrition getNutrition() {
        return nutrition;
    }
}
