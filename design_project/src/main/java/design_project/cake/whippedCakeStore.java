package design_project.cake;

/**
 *
 * @author 윤채민, 이혜리
 */
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