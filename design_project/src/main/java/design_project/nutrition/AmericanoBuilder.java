/**
 *최초 작성자 : 이혜리
 *최초 작성일 : 
 * 목적 : 아메리카노에 해당하는 영양정보 값을 구체적으로 지정하기 위함
 */
package design_project.nutrition;

public class AmericanoBuilder implements NutritionBuilder{
    Nutrition nutrition;
    
    public AmericanoBuilder(){
        nutrition= new Nutrition();
    }

    @Override
    public void Menu() {
        nutrition.setMenu("아메리카노");
    }

    @Override
    public void caloreis() {
       nutrition.setCalories("250kcal");
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
        nutrition.setFat("6g");
    }

    @Override
    public void sodium() {
        nutrition.setSodium("150mg");
    }

    @Override
    public void sugar() {
        nutrition.setSugar("10g");
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
