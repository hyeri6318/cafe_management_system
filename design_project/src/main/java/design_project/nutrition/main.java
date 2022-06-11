/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_project.nutrition;

/**
 *
 * @author 이혜리
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("--------------- 커피 ----------------");
        
        NutritionBuilder nutritionBuilder = new AmericanoBuilder(); // 아메리카노
        Director director = new Director(nutritionBuilder);
        director.showNutrition();   // 작성 x -> 지정한 값을 받아오지 못함
        Nutrition nutrition = director.getNutritoin();
        System.out.println(nutrition);

        nutritionBuilder = new LatteBuilder();  // 라뗴
        director = new Director(nutritionBuilder);
        director.showNutrition();
        nutrition = director.getNutritoin();
        System.out.println(nutrition);

        
        System.out.println("--------------- 티 ----------------");

        nutritionBuilder = new BlackteaBuilder();   // 홍차
        director = new Director(nutritionBuilder);
        director.showNutrition();
        nutrition = director.getNutritoin();
        System.out.println(nutrition);

        nutritionBuilder = new MatchaBuilder(); // 말차
        director = new Director(nutritionBuilder);
        director.showNutrition();
        nutrition = director.getNutritoin();
        System.out.println(nutrition);

        System.out.println("--------------- 프라푸치노 ----------------");
        
        nutritionBuilder = new VanillaFrappuccinoBuilder(); // 바닐라 프라푸치노
        director = new Director(nutritionBuilder);
        director.showNutrition();
        nutrition = director.getNutritoin();
        System.out.println(nutrition);

        nutritionBuilder = new ChocolateFrappuccinoBuilder();   // 초코릿 프라푸치노
        director = new Director(nutritionBuilder);
        director.showNutrition();
        nutrition = director.getNutritoin();
        System.out.println(nutrition);

        
        System.out.println("--------------- 스무디 ----------------");
        
        nutritionBuilder = new StrawberrySmoothieBuilder(); // 딸기 스무디
        director = new Director(nutritionBuilder);
        director.showNutrition();
        nutrition = director.getNutritoin();
        System.out.println(nutrition);

        nutritionBuilder = new KiwiSmoothieBuilder();   // 키위 스무디
        director = new Director(nutritionBuilder);
        director.showNutrition();
        nutrition = director.getNutritoin();
        System.out.println(nutrition);

        
        System.out.println("--------------- 치즈 케이크 ----------------");
        
        nutritionBuilder = new CheeseappleCakeBuilder();    // 사과 치즈 케이크
        director = new Director(nutritionBuilder);
        director.showNutrition();
        nutrition = director.getNutritoin();
        System.out.println(nutrition);

        nutritionBuilder = new CheeseblueberryCakeBuilder();    // 블루베리 치즈 케이크
        director = new Director(nutritionBuilder);
        director.showNutrition();
        nutrition = director.getNutritoin();
        System.out.println(nutrition);

        nutritionBuilder = new CheesecherryCakeBuilder();   // 체리 치즈 케이크
        director = new Director(nutritionBuilder);
        director.showNutrition();
        nutrition = director.getNutritoin();
        System.out.println(nutrition);

        
        System.out.println("--------------- 시폰 케이크 ----------------");

        nutritionBuilder = new ChiffonappleCakeBuilder();   // 사과 시폰 케이크
        director = new Director(nutritionBuilder);
        director.showNutrition();
        nutrition = director.getNutritoin();
        System.out.println(nutrition);

        nutritionBuilder = new ChiffonblueberryCakeBuilder();   // 블루베리 시폰 케이크
        director = new Director(nutritionBuilder);
        director.showNutrition();
        nutrition = director.getNutritoin();
        System.out.println(nutrition);

        nutritionBuilder = new ChiffoncherryCakeBuilder();  // 체리 시폰 케이크
        director = new Director(nutritionBuilder);
        director.showNutrition();
        nutrition = director.getNutritoin();
        System.out.println(nutrition);

        
        System.out.println("--------------- 생크림 케이크 ----------------");
        
        nutritionBuilder = new WhippedappleCakeBuilder();   // 사과 생크림 케이크
        director = new Director(nutritionBuilder);
        director.showNutrition();
        nutrition = director.getNutritoin();
        System.out.println(nutrition);

        nutritionBuilder = new WhippedblueberryCakeBuilder();   // 블루베리 생크림 케이크
        director = new Director(nutritionBuilder);
        director.showNutrition();
        nutrition = director.getNutritoin();
        System.out.println(nutrition);

        nutritionBuilder = new WhippedcherryCakeBuilder();  // 체리 생크림 케이크
        director = new Director(nutritionBuilder);
        director.showNutrition();
        nutrition = director.getNutritoin();
        System.out.println(nutrition);
    }

}
