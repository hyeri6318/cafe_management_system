/**
 *최초 작성자 : 이혜리
 *최초 작성일 : 
 * 목적 : 체리 치즈 케이크에 해당하는 영양정보 값을 구체적으로 지정하기 위함
 */
package design_project.nutrition;

public class CheesecherryCakeBuilder implements NutritionBuilder{
    
    Nutrition nutrition;

    public CheesecherryCakeBuilder() {
        nutrition = new Nutrition();
    }

    @Override
    public void Menu() {
        nutrition.setMenu("체리 치즈 케이크");
    }

    @Override
    public void caloreis() {
        nutrition.setCalories("400kcal");
    }

    @Override
    public void protein() {
        nutrition.setProtein("6g");
    }

    @Override
    public void carbohydrate() {
        nutrition.setCarbohydrate("21g");
    }

    @Override
    public void fat() {
        nutrition.setFat("3g");
    }

    @Override
    public void sodium() {
        nutrition.setSodium("180mg");
    }

    @Override
    public void sugar() {
        nutrition.setSugar("10g");
    }

    @Override
    public void servingSize() {
        nutrition.setServingSize("100g");
    }

    @Override
    public Nutrition getNutrition() {
        return nutrition;
    }
}
