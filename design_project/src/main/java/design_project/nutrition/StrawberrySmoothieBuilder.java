/**
 *최초 작성자 : 이혜리
 *최초 작성일 : 2022-06-01
 * 목적 : 딸기 스무디에 해당하는 영양정보 값을 구체적으로 지정하기 위함
 */
package design_project.nutrition;

public class StrawberrySmoothieBuilder implements NutritionBuilder{
    
    Nutrition nutrition;

    public StrawberrySmoothieBuilder() {
        nutrition = new Nutrition();
    }

    @Override
    public void Menu() {
        nutrition.setMenu("딸기 스무디");
    }

    @Override
    public void caloreis() {
        nutrition.setCalories("420kcal");
    }

    @Override
    public void protein() {
        nutrition.setProtein("12g");
    }

    @Override
    public void carbohydrate() {
        nutrition.setCarbohydrate("46g");
    }

    @Override
    public void fat() {
        nutrition.setFat("15g");
    }

    @Override
    public void sodium() {
        nutrition.setSodium("250mg");
    }

    @Override
    public void sugar() {
        nutrition.setSugar("37g");
    }

    @Override
    public void servingSize() {
        nutrition.setServingSize("200ml");
    }

    @Override
    public Nutrition getNutrition() {
        return nutrition;
    }
}
