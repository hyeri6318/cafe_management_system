/**
 *최초 작성자 : 이혜리
 *최초 작성일 : 
 * 목적 : 홍차에 해당하는 영양정보 값을 구체적으로 지정하기 위함
 */
package design_project.nutrition;

public class BlackteaBuilder implements NutritionBuilder {

    Nutrition nutrition;

    public BlackteaBuilder() {
        nutrition = new Nutrition();
    }

    @Override
    public void Menu() {
        nutrition.setMenu("홍차");
    }

    @Override
    public void caloreis() {
        nutrition.setCalories("50kcal");
    }

    @Override
    public void protein() {
        nutrition.setProtein("2g");
    }

    @Override
    public void carbohydrate() {
        nutrition.setCarbohydrate("18g");
    }

    @Override
    public void fat() {
        nutrition.setFat("5g");
    }

    @Override
    public void sodium() {
        nutrition.setSodium("30mg");
    }

    @Override
    public void sugar() {
        nutrition.setSugar("10g");
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
