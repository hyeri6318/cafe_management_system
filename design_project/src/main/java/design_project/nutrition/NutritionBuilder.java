/**
 *최초 작성자 : 이혜리
 *최초 작성일 : 2022-06-01
 * 목적 : 탄수화물, 단백질, 지방, 당, 나트륨, 칼로리, 총제공량 상품 이름 등의 영양 정보 틀을 지정하기 위함
 */
package design_project.nutrition;

public interface NutritionBuilder {

    public void Menu(); // 상품 이름

    public void caloreis(); // 칼로리

    public void protein();  // 단백질

    public void carbohydrate(); // 탄수화물

    public void fat();  // 지방

    public void sodium();   // 나트륨

    public void sugar();    // 당

    public void servingSize();  // 총제공량
    
    public Nutrition getNutrition();
}
