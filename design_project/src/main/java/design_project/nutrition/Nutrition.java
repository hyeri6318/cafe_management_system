/**
 *최초 작성자 : 이혜리
 *최초 작성일 : 
 * 목적 : 지정된 영양정보 값을 Director 클래스로 전달하기 위함
 */
package design_project.nutrition;

public class Nutrition {

    private String menu;
    private String servingSize;
    private String protein;
    private String carbohydrate;
    private String fat;
    private String sodium;
    private String sugar;
    private String calories;

    public void setMenu(String menu){ 
        this.menu=menu;
    }
    
    public void setServingSize(String servingSize) {
        this.servingSize = servingSize;
    }

    public void setProtein(String protein) {
        this.protein = protein;
    }

    public void setCarbohydrate(String carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public void setFat(String fat) {
        this.fat = fat;
    }

    public void setSodium(String sodium) {
        this.sodium = sodium;
    }

    public void setSugar(String sugar) {
        this.sugar = sugar;
    }

    public void setCalories(String calories) {
        this.calories = calories;
    }
    
    public String getMenu(){
        return menu;
    }
    
    public String getServingSize(){
        return servingSize;
    }
    
    public String getProtein(){
        return protein;
    }
    
    public String getCarbohydrate(){
        return carbohydrate;
    }
    
    public String getFat(){
        return fat;
    }

    public String getSodium(){
        return sodium;
    }
    
    public String getSugar(){
        return sugar;
    }
    
    public String getCalories(){
        return calories;
    }
    
    @Override
    public String toString() {
        return menu+ " 제공량 : " + servingSize + " [칼로리 : " + calories + ", 단백질 : " + protein + ", 탄수화물 : " + carbohydrate + ", 지방 : " + fat + ", 나트륨 : " + sodium + ", 당 : " + sugar + "]";
    }
}
