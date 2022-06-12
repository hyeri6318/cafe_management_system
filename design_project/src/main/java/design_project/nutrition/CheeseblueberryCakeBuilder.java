/**
 *최초 작성자 : 이혜리
 *최초 작성일 : 
 * 목적 : 블루베리 치즈 케이크에 해당하는 영양정보 값을 구체적으로 지정하기 위함
 */
package design_project.nutrition;

public class CheeseblueberryCakeBuilder implements NutritionBuilder{
    
    Nutrition nutrition;

    public CheeseblueberryCakeBuilder() {
        nutrition = new Nutrition();
    }

    @Override
    public void Menu() {
        nutrition.setMenu("블루베리 치즈 케이크");
    }

    @Override
    public void caloreis() {
        nutrition.setCalories("300kcal");
    }

    @Override
    public void protein() {
        nutrition.setProtein("5g");
    }

    @Override
    public void carbohydrate() {
        nutrition.setCarbohydrate("30g");
    }

    @Override
    public void fat() {
        nutrition.setFat("9g");
    }

    @Override
    public void sodium() {
        nutrition.setSodium("160mg");
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
