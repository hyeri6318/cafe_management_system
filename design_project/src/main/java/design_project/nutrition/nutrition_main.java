package design_project.nutrition;

public class nutrition_main {
    public void nutrition(){
        NutritionBuilder AmericanoBuilder = new AmericanoBuilder();
        Director director = new Director(AmericanoBuilder);
        director.constructnutrition();

        Americano americano = director.getAmericano();
        System.out.println(americano);

        NutritionBuilder BlackteaBuilder = new BlackteaBuilder();
        director = new Director(BlackteaBuilder);
        director.constructnutrition();

        Blacktea blacktea = director.getBlacktea();
        System.out.println(blacktea);

        NutritionBuilder ChocolateFrappuccinoBuilder = new ChocolateFrappuccinoBuilder();
        director = new Director(ChocolateFrappuccinoBuilder);
        director.constructnutrition();

        ChocolateFrappuccino chocolateFrappuccino = director.getChocolateFrappuccino();
        System.out.println(chocolateFrappuccino);

        NutritionBuilder KiwiSmoothieBuilder = new KiwiSmoothieBuilder();
        director = new Director(KiwiSmoothieBuilder);
        director.constructnutrition();

        KiwiSmoothie kiwiSmoothie = director.getKiwiSmoothie();
        System.out.println(kiwiSmoothie);

        NutritionBuilder LatteBuilder = new LatteBuilder();
        director = new Director(LatteBuilder);
        director.constructnutrition();

        Latte latte = director.getLatte();
        System.out.println(latte);

        NutritionBuilder MatchaBuilder = new MatchaBuilder();
        director = new Director(MatchaBuilder);
        director.constructnutrition();

        Matcha matcha = director.getMatcha();
        System.out.println(matcha);

        NutritionBuilder StrawberrySmoothieBuilder = new StrawberrySmoothieBuilder();
        director = new Director(StrawberrySmoothieBuilder);
        director.constructnutrition();

        StrawberrySmoothie strawberrySmoothie = director.getStrawberrySmoothie();
        System.out.println(strawberrySmoothie);

        NutritionBuilder VanillaFrappuccinoBuilder = new VanillaFrappuccinoBuilder();
        director = new Director(VanillaFrappuccinoBuilder);
        director.constructnutrition();

        VanillaFrappuccino vanillaFrappuccino = director.getVanillaFrappuccino();
        System.out.println(vanillaFrappuccino);

        NutritionBuilder CheeseappleCakeBuilder = new CheeseappleCakeBuilder();
        director = new Director(CheeseappleCakeBuilder);
        director.constructnutrition();

        CheeseappleCake cheeseappleCake = director.getCheeseappleCake();
        System.out.println(cheeseappleCake);

        NutritionBuilder CheeseblueberryCakeBuilder = new CheeseblueberryCakeBuilder();
        director = new Director(CheeseblueberryCakeBuilder);
        director.constructnutrition();

        CheeseblueberryCake cheeseblueberryCake = director.getCheeseblueberryCake();
        System.out.println(cheeseblueberryCake);

        NutritionBuilder CheesecherryCakeBuilder = new CheesecherryCakeBuilder();
        director = new Director(CheesecherryCakeBuilder);
        director.constructnutrition();

        CheesecherryCake cheesecherryCake = director.getCheesecherryCake();
        System.out.println(cheesecherryCake);

        NutritionBuilder ChiffonappleCakeBuilder = new ChiffonappleCakeBuilder();
        director = new Director(ChiffonappleCakeBuilder);
        director.constructnutrition();

        ChiffonappleCake chiffonappleCake = director.getChiffonappleCake();
        System.out.println(chiffonappleCake);

        NutritionBuilder ChiffonblueberryCakeBuilder = new ChiffonblueberryCakeBuilder();
        director = new Director(ChiffonblueberryCakeBuilder);
        director.constructnutrition();

        ChiffonblueberryCake chiffonblueberryCake = director.getChiffonblueberryCake();
        System.out.println(chiffonblueberryCake);

        NutritionBuilder ChiffoncherryCakeBuilder = new ChiffoncherryCakeBuilder();
        director = new Director(ChiffoncherryCakeBuilder);
        director.constructnutrition();

        ChiffoncherryCake chiffoncherryCake = director.getChiffoncherryCake();
        System.out.println(chiffoncherryCake);

        NutritionBuilder FreshcreamappleCakeBuilder = new FreshcreamappleCakeBuilder();
        director = new Director(FreshcreamappleCakeBuilder);
        director.constructnutrition();

        FreshcreamappleCake freshcreamappleCake = director.getFreshcreamappleCake();
        System.out.println(freshcreamappleCake);

        NutritionBuilder FreshcreamblueberryCakeBuilder = new FreshcreamblueberryCakeBuilder();
        director = new Director(FreshcreamblueberryCakeBuilder);
        director.constructnutrition();

        FreshcreamblueberryCake freshcreamblueberryCake = director.getFreshcreamblueberryCake();
        System.out.println(freshcreamblueberryCake);

        NutritionBuilder FreshcreamcherryCakeBuilder = new FreshcreamcherryCakeBuilder();
        director = new Director(FreshcreamcherryCakeBuilder);
        director.constructnutrition();

        FreshcreamcherryCake freshcreamcherryCake = director.getFreshcreamcherryCake();
        System.out.println(freshcreamcherryCake);
    }
}
