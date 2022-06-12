/**
 *최초 작성자 : 윤채민, 이혜리
 *최초 작성일 : 2022-06-03
 */
package design_project.cake;

public class cheeseCakeStore extends cakeStore {
    protected cake createCake(String item) {
        cake cake = null;
        cakeIngredientFactory factory = new cheeseIngredientFactory();

        if (item.equals("사과")) {
            cake = new appleCake((cakeIngredientFactory) factory);
            cake.setName("Apple Cheese Cake");
        } else if (item.equals("블루베리")) {
            cake = new blueberryCake((cakeIngredientFactory) factory);
            cake.setName("Blueberry Cheese Cake");
        } else if (item.equals("체리")) {
            cake = new cherryCake((cakeIngredientFactory) factory);
            cake.setName("Cherry Cheese Cake");
        }
        return cake;
    }
}
