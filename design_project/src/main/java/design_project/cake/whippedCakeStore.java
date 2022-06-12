/**
 *최초 작성자 : 윤채민, 이혜리
 *최초 작성일 : 2022-06-03
 * 목적 : cakeStore의 틀을 가져와서 실제로 케이크를 완성
 */
package design_project.cake;

public class whippedCakeStore extends cakeStore {
    protected cake createCake(String item) {
        cake cake = null;
        cakeIngredientFactory factory = new whippedIngredientFactory();

        if (item.equals("사과")) {
            cake = new appleCake((cakeIngredientFactory) factory);
            cake.setName("Apple Whipped Cake");
        } else if (item.equals("블루베리")) {
            cake = new blueberryCake((cakeIngredientFactory) factory);
            cake.setName("Blueberry Whipped Cake");
        } else if (item.equals("체리")) {
            cake = new cherryCake((cakeIngredientFactory) factory);
            cake.setName("Cherry Whipped Cake");
        }
        return cake;
    }
}