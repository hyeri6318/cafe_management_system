/**
 *최초 작성자 : 이혜리
 *최초 작성일 : 
 * 목적 : NutritionBuilder 클래스에 영양정보 객체 생성응 요청하기 위함
 */
package design_project.nutrition;

public class Director {
    private NutritionBuilder nutritionBuilder = null;
    
    public Director(NutritionBuilder nutritionBuilder){
        this.nutritionBuilder=nutritionBuilder;
    }
    
    public void showNutrition(){
        nutritionBuilder.Menu();
        nutritionBuilder.caloreis();
        nutritionBuilder.protein();
        nutritionBuilder.carbohydrate();
        nutritionBuilder.fat();
        nutritionBuilder.sodium();
        nutritionBuilder.sugar();
        nutritionBuilder.servingSize();
    }
    
    public Nutrition getNutritoin(){
        return nutritionBuilder.getNutrition();
    }
}
