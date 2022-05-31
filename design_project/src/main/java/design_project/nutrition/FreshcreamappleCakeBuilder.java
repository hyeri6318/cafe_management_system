package design_project.nutrition;

public class FreshcreamappleCakeBuilder extends NutritionBuilder {

   @Override
    public void ServingSize() {
        freshcreamappleCake.setServingSize("200g");
    }
    
    
    
    @Override
    public void calories() {
        freshcreamappleCake.setcalories("600kcal ");
    }

    @Override
    public void protein() {
        freshcreamappleCake.setprotein("10g ");
    }

    @Override
    public void carbohydrate() {
        freshcreamappleCake.setcarbohydrate("55g ");
    }

    @Override
    public void fat() {
        freshcreamappleCake.setfat("12g ");
    }

    @Override
    public void sodium() {
        freshcreamappleCake.setsodium("350mg ");
    }

    @Override
    public void sugar() {
        freshcreamappleCake.setsugar("30g ");
    }

    @Override
    public Americano getAmericano() {
        return americano;
    }

    @Override
    public Blacktea getBlacktea() {
        return blacktea;
    }

    @Override
    public CheeseappleCake  getCheeseappleCake() {
        return cheeseappleCake;
    }
@Override
    public CheeseblueberryCake getCheeseblueberryCake() {
        return cheeseblueberryCake;
    }
    
    
    @Override
    public CheesecherryCake getCheesecherryCake() {
        return cheesecherryCake;
    }
    
    @Override
    public ChiffonappleCake getChiffonappleCake() {
        return chiffonappleCake;
    }

  @Override
    public ChiffonblueberryCake getChiffonblueberryCake() {
        return chiffonblueberryCake;
    }

  @Override
    public ChiffoncherryCake getChiffoncherryCake() {
        return chiffoncherryCake;
    }
   
    @Override
    public ChocolateFrappuccino getChocolateFrappuccino() {
        return chocolateFrappuccino;
    }
   
    @Override
    public FreshcreamappleCake getFreshcreamappleCake() {
        return freshcreamappleCake;
    }
   
    @Override
    public FreshcreamblueberryCake getFreshcreamblueberryCake() {
        return freshcreamblueberryCake;
    }
   
    @Override
    public FreshcreamcherryCake getFreshcreamcherryCake() {
        return freshcreamcherryCake;
    }
 
    @Override
    public KiwiSmoothie getKiwiSmoothie() {
        return kiwiSmoothie;
    }
   
    @Override
    public Latte getLatte() {
        return latte;
    }
   
    @Override
    public Matcha getMatcha() {
        return matcha;
    }
  
    @Override
    public StrawberrySmoothie getStrawberrySmoothie() {
        return strawberrySmoothie;
    }
    
 @Override
    public VanillaFrappuccino getVanillaFrappuccino() {
        return vanillaFrappuccino;
    }
    
}