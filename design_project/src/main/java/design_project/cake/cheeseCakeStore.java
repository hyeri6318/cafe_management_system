package design_project.cake;

/**
 *
 * @author 윤채민
 */
public class cheeseCakeStore extends cakeStore {
    protected cake createCake(String item) {
        cake cake = null;
        cakeIngredientFactory factory = new cheeseIngredientFactory();

        if(item.equals("사과")){
            cake = new appleCake((cheeseIngredientFactory) factory);
            cake.setName("사과 치즈케이크");
        }else if(item.equals("블루베리")){
            cake = new blueberryCake((cheeseIngredientFactory) factory);
            cake.setName("블루베리 치즈케이크");
        }else if(item.equals("체리")){
            cake = new cherryCake((cheeseIngredientFactory) factory);
            cake.setName("체리 치즈케이크");
        }
        return cake;
    }
}
