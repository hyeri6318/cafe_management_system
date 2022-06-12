/**
 *최초 작성자 : 이혜리
 *최초 작성일 : 
 * 목적 : 키위 스무디에 해당하는 영양정보 값을 구체적으로 지정하기 위함
 */
package design_project.nutrition;

public class KiwiSmoothieBuilder implements NutritionBuilder{
    
    Nutrition nutrition;

    public KiwiSmoothieBuilder() {
        nutrition = new Nutrition();
    }

    @Override
    public void Menu() {
        nutrition.setMenu("키위 스무디");
    }

    @Override
    public void caloreis() {
        nutrition.setCalories("180kcal");
    }

    @Override
    public void protein() {
        nutrition.setProtein("5g");
    }

    @Override
    public void carbohydrate() {
        nutrition.setCarbohydrate("20g");
    }

    @Override
    public void fat() {
        nutrition.setFat("5g");
    }

    @Override
    public void sodium() {
        nutrition.setSodium("190mg");
    }

    @Override
    public void sugar() {
        nutrition.setSugar("8g");
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
