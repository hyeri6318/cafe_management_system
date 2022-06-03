package design_project.cake;

/**
 *
 * @author 윤채민
 */
public class whippedCakeStore extends cakeStore {
  protected cake createCake(String item) {
        cake cake = null;
        cakeIngredientFactory factory = new whippedIngredientFactory();

        if(item.equals("사과")){
            cake = new appleCake((whippedIngredientFactory) factory);
            cake.setName("사과 생크림케이크");
        }else if(item.equals("블루베리")){
            cake = new blueberryCake((whippedIngredientFactory) factory);
            cake.setName("블루베리 생크림케이크");
        }else if(item.equals("체리")){
            cake = new cherryCake((whippedIngredientFactory) factory);
            cake.setName("체리 생크림케이크");
        }
        return cake;
  }
}