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
public interface NutritionBuilder {

    public void Menu();

    public void caloreis();

    public void protein();

    public void carbohydrate();

    public void fat();

    public void sodium();

    public void sugar();

    public void servingSize();
    
    public Nutrition getNutrition();
}
