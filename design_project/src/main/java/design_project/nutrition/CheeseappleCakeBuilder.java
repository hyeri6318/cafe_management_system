/**
 *최초 작성자 : 이혜리
 *최초 작성일 : 2022-06-01
 * 목적 : 사과 치즈 케이크에 해당하는 영양정보 값을 구체적으로 지정하기 위함
 */
package design_project.nutrition;

public class CheeseappleCakeBuilder implements NutritionBuilder{
    
    Nutrition nutrition;

    public CheeseappleCakeBuilder() {
        nutrition = new Nutrition();
    }

    @Override
    public void Menu() {
        nutrition.setMenu("사과 치즈 케이크");
    }

    @Override
    public void caloreis() {
        nutrition.setCalories("250kcal");
    }

    @Override
    public void protein() {
        nutrition.setProtein("3g");
    }

    @Override
    public void carbohydrate() {
        nutrition.setCarbohydrate("25g");
    }

    @Override
    public void fat() {
        nutrition.setFat("8g");
    }

    @Override
    public void sodium() {
        nutrition.setSodium("110mg");
    }

    @Override
    public void sugar() {
        nutrition.setSugar("15g");
    }

    @Override
    public void servingSize() {
        nutrition.setServingSize("80g");
    }

    @Override
    public Nutrition getNutrition() {
        return nutrition;
    }
}
