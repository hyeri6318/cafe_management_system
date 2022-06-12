/**
 *최초 작성자 : 이혜리
 *최초 작성일 : 2022-06-01
 * 목적 : 라떼에 해당하는 영양정보 값을 구체적으로 지정하기 위함
 */
package design_project.nutrition;

public class LatteBuilder implements NutritionBuilder {

    Nutrition nutrition;

    public LatteBuilder() {
        nutrition = new Nutrition();
    }

    @Override
    public void Menu() {
        nutrition.setMenu("라떼");
    }

    @Override
    public void caloreis() {
        nutrition.setCalories("30cal");
    }

    @Override
    public void protein() {
        nutrition.setProtein("1g");
    }

    @Override
    public void carbohydrate() {
        nutrition.setCarbohydrate("3g");
    }

    @Override
    public void fat() {
        nutrition.setFat("2g");
    }

    @Override
    public void sodium() {
        nutrition.setSodium("120mg");
    }

    @Override
    public void sugar() {
        nutrition.setSugar("8g");
    }

    @Override
    public void servingSize() {
        nutrition.setServingSize("100ml");
    }

    @Override
    public Nutrition getNutrition() {
        return nutrition;
    }
}
