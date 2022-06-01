package design_project.nutrition;

public class nutrition_main {
    
        public void nutrition() {
        System.out.println("--------------- 커피 ----------------");

        NutritionBuilder AmericanoBuilder = new AmericanoBuilder(); // 아메리카노
        Director director = new Director(AmericanoBuilder);
        director.constructnutrition();

        Americano americano = director.getAmericano();
        System.out.println(americano);

        NutritionBuilder LatteBuilder = new LatteBuilder(); // 라떼
        director = new Director(LatteBuilder);
        director.constructnutrition();

        Latte latte = director.getLatte();
        System.out.println(latte);
        System.out.print("\n");

        System.out.println("--------------- 티 ----------------");

        NutritionBuilder BlackteaBuilder = new BlackteaBuilder();   // 홍차
        director = new Director(BlackteaBuilder);
        director.constructnutrition();

        Blacktea blacktea = director.getBlacktea();
        System.out.println(blacktea);

        NutritionBuilder MatchaBuilder = new MatchaBuilder();   // 말차
        director = new Director(MatchaBuilder);
        director.constructnutrition();

        Matcha matcha = director.getMatcha();
        System.out.println(matcha);
        System.out.print("\n");

        System.out.println("--------------- 프라푸치노 ----------------");

        NutritionBuilder VanillaFrappuccinoBuilder = new VanillaFrappuccinoBuilder();   // 바닐라 프라푸치노
        director = new Director(VanillaFrappuccinoBuilder);
        director.constructnutrition();

        VanillaFrappuccino vanillaFrappuccino = director.getVanillaFrappuccino();
        System.out.println(vanillaFrappuccino);

        NutritionBuilder ChocolateFrappuccinoBuilder = new ChocolateFrappuccinoBuilder();   // 초코 프라푸치노
        director = new Director(ChocolateFrappuccinoBuilder);
        director.constructnutrition();

        ChocolateFrappuccino chocolateFrappuccino = director.getChocolateFrappuccino();
        System.out.println(chocolateFrappuccino);
        System.out.print("\n");

        System.out.println("--------------- 스무디 ----------------");

        NutritionBuilder StrawberrySmoothieBuilder = new StrawberrySmoothieBuilder();   // 딸기 스무디
        director = new Director(StrawberrySmoothieBuilder);
        director.constructnutrition();

        StrawberrySmoothie strawberrySmoothie = director.getStrawberrySmoothie();
        System.out.println(strawberrySmoothie);

        NutritionBuilder KiwiSmoothieBuilder = new KiwiSmoothieBuilder();   // 키위 스무디
        director = new Director(KiwiSmoothieBuilder);
        director.constructnutrition();

        KiwiSmoothie kiwiSmoothie = director.getKiwiSmoothie();
        System.out.println(kiwiSmoothie);
        System.out.print("\n");

        System.out.println("--------------- 치즈 케이크 ----------------");

        NutritionBuilder CheeseappleCakeBuilder = new CheeseappleCakeBuilder(); // 치즈 사과 케이크
        director = new Director(CheeseappleCakeBuilder);
        director.constructnutrition();

        CheeseappleCake cheeseappleCake = director.getCheeseappleCake();
        System.out.println(cheeseappleCake);

        NutritionBuilder CheeseblueberryCakeBuilder = new CheeseblueberryCakeBuilder(); // 치즈 블루베리 케이크
        director = new Director(CheeseblueberryCakeBuilder);
        director.constructnutrition();

        CheeseblueberryCake cheeseblueberryCake = director.getCheeseblueberryCake();
        System.out.println(cheeseblueberryCake);

        NutritionBuilder CheesecherryCakeBuilder = new CheesecherryCakeBuilder();   // 치즈 체리 케이크
        director = new Director(CheesecherryCakeBuilder);
        director.constructnutrition();

        CheesecherryCake cheesecherryCake = director.getCheesecherryCake();
        System.out.println(cheesecherryCake);
        System.out.print("\n");

        System.out.println("--------------- 시폰 케이크 ----------------");

        NutritionBuilder ChiffonappleCakeBuilder = new ChiffonappleCakeBuilder();   // 시폰 사과 케이크
        director = new Director(ChiffonappleCakeBuilder);
        director.constructnutrition();

        ChiffonappleCake chiffonappleCake = director.getChiffonappleCake();
        System.out.println(chiffonappleCake);

        NutritionBuilder ChiffonblueberryCakeBuilder = new ChiffonblueberryCakeBuilder();   // 시폰 블루베리 케이크
        director = new Director(ChiffonblueberryCakeBuilder);
        director.constructnutrition();

        ChiffonblueberryCake chiffonblueberryCake = director.getChiffonblueberryCake();
        System.out.println(chiffonblueberryCake);

        NutritionBuilder ChiffoncherryCakeBuilder = new ChiffoncherryCakeBuilder(); // 시폰 체리 케이크
        director = new Director(ChiffoncherryCakeBuilder);
        director.constructnutrition();

        ChiffoncherryCake chiffoncherryCake = director.getChiffoncherryCake();
        System.out.println(chiffoncherryCake);
        System.out.print("\n");

        System.out.println("--------------- 생크림 케이크 ----------------");

        NutritionBuilder FreshcreamappleCakeBuilder = new FreshcreamappleCakeBuilder(); // 생크림 사과 케이크
        director = new Director(FreshcreamappleCakeBuilder);
        director.constructnutrition();

        FreshcreamappleCake freshcreamappleCake = director.getFreshcreamappleCake();
        System.out.println(freshcreamappleCake);

        NutritionBuilder FreshcreamblueberryCakeBuilder = new FreshcreamblueberryCakeBuilder(); // 생크림 블루베리 케이크
        director = new Director(FreshcreamblueberryCakeBuilder);
        director.constructnutrition();

        FreshcreamblueberryCake freshcreamblueberryCake = director.getFreshcreamblueberryCake();
        System.out.println(freshcreamblueberryCake);

        NutritionBuilder FreshcreamcherryCakeBuilder = new FreshcreamcherryCakeBuilder();   // 생크림 체리 케이크
        director = new Director(FreshcreamcherryCakeBuilder);
        director.constructnutrition();

        FreshcreamcherryCake freshcreamcherryCake = director.getFreshcreamcherryCake();
        System.out.println(freshcreamcherryCake);
        System.out.print("\n");
    }
}
