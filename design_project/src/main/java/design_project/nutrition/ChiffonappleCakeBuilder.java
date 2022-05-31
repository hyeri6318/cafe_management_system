package design_project.nutrition;

public class ChiffonappleCakeBuilder extends NutritionBuilder {

   @Override
    public void ServingSize() {
        chiffonappleCake.setServingSize("150g");
    }
    
    
    
    @Override
    public void calories() {
        chiffonappleCake.setcalories("450kcal ");
    }

    @Override
    public void protein() {
        chiffonappleCake.setprotein("8g ");
    }

    @Override
    public void carbohydrate() {
        chiffonappleCake.setcarbohydrate("45g ");
    }

    @Override
    public void fat() {
        chiffonappleCake.setfat("10g ");
    }

    @Override
    public void sodium() {
        chiffonappleCake.setsodium("220mg ");
    }

    @Override
    public void sugar() {
        chiffonappleCake.setsugar("30g ");
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