package design_project.nutrition;

public class CheeseappleCakeBuilder extends NutritionBuilder {

   @Override
    public void ServingSize() {
        cheeseappleCake.setServingSize("80g");
    }
    
    
    
    @Override
    public void calories() {
        cheeseappleCake.setcalories("250kcal ");
    }

    @Override
    public void protein() {
        cheeseappleCake.setprotein("3g ");
    }

    @Override
    public void carbohydrate() {
       cheeseappleCake.setcarbohydrate("25g ");
    }

    @Override
    public void fat() {
        cheeseappleCake.setfat("8g ");
    }

    @Override
    public void sodium() {
        cheeseappleCake.setsodium("110mg ");
    }

    @Override
    public void sugar() {
        cheeseappleCake.setsugar("15g ");
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