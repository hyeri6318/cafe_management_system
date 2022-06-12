/**
 *최초 작성자 : 이혜리
 *최초 작성일 : 2022-06-01
 * 목적 : 말차에 해당하는 영양정보 값을 구체적으로 지정하기 위함
 */
package design_project.nutrition;

public class MatchaBuilder implements NutritionBuilder {

    Nutrition nutrition;

    public MatchaBuilder() {
        nutrition = new Nutrition();
    }

    @Override
    public void Menu() {
        nutrition.setMenu("말차");
    }

    @Override
    public void caloreis() {
        nutrition.setCalories("20kcal");
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
        nutrition.setSodium("80mg");
    }

    @Override
    public void sugar() {
        nutrition.setSugar("3g");
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
