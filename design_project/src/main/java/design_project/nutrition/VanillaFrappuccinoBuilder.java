/**
 *최초 작성자 : 이혜리
 *최초 작성일 : 2022-06-01
 * 목적 : 바닐라 프라푸치노에 해당하는 영양정보 값을 구체적으로 지정하기 위함
 */
package design_project.nutrition;

public class VanillaFrappuccinoBuilder implements NutritionBuilder{
    
    Nutrition nutrition;

    public VanillaFrappuccinoBuilder() {
        nutrition = new Nutrition();
    }

    @Override
    public void Menu() {
        nutrition.setMenu("바닐라 프라푸치노");
    }

    @Override
    public void caloreis() {
        nutrition.setCalories("560kcal");
    }

    @Override
    public void protein() {
        nutrition.setProtein("9g");
    }

    @Override
    public void carbohydrate() {
        nutrition.setCarbohydrate("51g");
    }

    @Override
    public void fat() {
        nutrition.setFat("11g");
    }

    @Override
    public void sodium() {
        nutrition.setSodium("340mg");
    }

    @Override
    public void sugar() {
        nutrition.setSugar("48g");
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
