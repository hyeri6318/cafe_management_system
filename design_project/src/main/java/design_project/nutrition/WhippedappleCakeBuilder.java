/**
 *최초 작성자 : 이혜리
 *최초 작성일 : 
 * 목적 : 사과 생크림 케이크에 해당하는 영양정보 값을 구체적으로 지정하기 위함
 */
package design_project.nutrition;

public class WhippedappleCakeBuilder implements NutritionBuilder{
        
    Nutrition nutrition;

    public WhippedappleCakeBuilder() {
        nutrition = new Nutrition();
    }

    @Override
    public void Menu() {
        nutrition.setMenu("사과 생크림 케이크");
    }

    @Override
    public void caloreis() {
        nutrition.setCalories("600kcal");
    }

    @Override
    public void protein() {
        nutrition.setProtein("10g");
    }

    @Override
    public void carbohydrate() {
        nutrition.setCarbohydrate("55g");
    }

    @Override
    public void fat() {
        nutrition.setFat("12g");
    }

    @Override
    public void sodium() {
        nutrition.setSodium("350mg");
    }

    @Override
    public void sugar() {
        nutrition.setSugar("30g");
    }

    @Override
    public void servingSize() {
        nutrition.setServingSize("200g");
    }

    @Override
    public Nutrition getNutrition() {
        return nutrition;
    }
}
