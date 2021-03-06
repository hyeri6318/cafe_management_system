/**
 *최초 작성자 : 이혜리
 *최초 작성일 : 2022-06-01
 * 목적 : 사과 시폰 케이크에 해당하는 영양정보 값을 구체적으로 지정하기 위함
 */
package design_project.nutrition;

public class ChiffonappleCakeBuilder implements NutritionBuilder{
    
    Nutrition nutrition;

    public ChiffonappleCakeBuilder() {
        nutrition = new Nutrition();
    }

    @Override
    public void Menu() {
        nutrition.setMenu("사과 시폰 케이크");
    }

    @Override
    public void caloreis() {
        nutrition.setCalories("450kcal");
    }

    @Override
    public void protein() {
        nutrition.setProtein("8g");
    }

    @Override
    public void carbohydrate() {
        nutrition.setCarbohydrate("45g");
    }

    @Override
    public void fat() {
        nutrition.setFat("10g");
    }

    @Override
    public void sodium() {
        nutrition.setSodium("220mg");
    }

    @Override
    public void sugar() {
        nutrition.setSugar("30g");
    }

    @Override
    public void servingSize() {
        nutrition.setServingSize("150g");
    }

    @Override
    public Nutrition getNutrition() {
        return nutrition;
    }
}
