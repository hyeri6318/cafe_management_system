/**
 *최초 작성자 : 이혜리
 *최초 작성일 : 2022-06-01
 * 목적 : 블루베리 생크림 케이크에 해당하는 영양정보 값을 구체적으로 지정하기 위함
 */
package design_project.nutrition;

public class WhippedblueberryCakeBuilder implements NutritionBuilder{
        
    Nutrition nutrition;

    public WhippedblueberryCakeBuilder() {
        nutrition = new Nutrition();
    }

    @Override
    public void Menu() {
        nutrition.setMenu("블루베리 생크림 케이크");
    }

    @Override
    public void caloreis() {
        nutrition.setCalories("80kcal");
    }

    @Override
    public void protein() {
        nutrition.setProtein("1g");
    }

    @Override
    public void carbohydrate() {
        nutrition.setCarbohydrate("10g");
    }

    @Override
    public void fat() {
        nutrition.setFat("3g");
    }

    @Override
    public void sodium() {
        nutrition.setSodium("80mg");
    }

    @Override
    public void sugar() {
        nutrition.setSugar("7g");
    }

    @Override
    public void servingSize() {
        nutrition.setServingSize("50g");
    }

    @Override
    public Nutrition getNutrition() {
        return nutrition;
    }
}
