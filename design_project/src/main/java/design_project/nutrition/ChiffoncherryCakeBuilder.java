/**
 *최초 작성자 : 이혜리
 *최초 작성일 : 
 * 목적 : 체리 시폰 케이크에 해당하는 영양정보 값을 구체적으로 지정하기 위함
 */
package design_project.nutrition;

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
