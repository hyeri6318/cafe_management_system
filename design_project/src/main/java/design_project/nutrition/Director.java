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
public class Director {
    private NutritionBuilder nutritionBuilder = null;
    
    public Director(NutritionBuilder nutritionBuilder){
        this.nutritionBuilder=nutritionBuilder;
    }
    
    public void showNutrition(){
        nutritionBuilder.Menu();
        nutritionBuilder.caloreis();
        nutritionBuilder.protein();
        nutritionBuilder.carbohydrate();
        nutritionBuilder.fat();
        nutritionBuilder.sodium();
        nutritionBuilder.sugar();
        nutritionBuilder.servingSize();
    }
    
    public Nutrition getNutritoin(){
        return nutritionBuilder.getNutrition();
    }
}
