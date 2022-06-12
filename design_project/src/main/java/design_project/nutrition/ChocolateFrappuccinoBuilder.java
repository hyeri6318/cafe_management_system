/**
 *최초 작성자 : 이혜리
 *최초 작성일 : 
 * 목적 : 초콜릿 프라푸치노에 해당하는 영양정보 값을 구체적으로 지정하기 위함
 */
package design_project.nutrition;

public class ChocolateFrappuccinoBuilder implements NutritionBuilder{
    
    Nutrition nutrition;

    public ChocolateFrappuccinoBuilder() {
        nutrition = new Nutrition();
    }

    @Override
    public void Menu() {
        nutrition.setMenu("초콜릿 프라푸치노");
    }

    @Override
    public void caloreis() {
        nutrition.setCalories("360kcal");
    }

    @Override
    public void protein() {
        nutrition.setProtein("2g");
    }

    @Override
    public void carbohydrate() {
        nutrition.setCarbohydrate("35g");
    }

    @Override
    public void fat() {
        nutrition.setFat("5g");
    }

    @Override
    public void sodium() {
        nutrition.setSodium("230mg");
    }

    @Override
    public void sugar() {
        nutrition.setSugar("26g");
    }

    @Override
    public void servingSize() {
        nutrition.setServingSize("150ml");
    }

    @Override
    public Nutrition getNutrition() {
        return nutrition;
    }
}
