package design_project.nutrition;

public class ChocolateFrappuccinoBuilder extends NutritionBuilder {

   @Override
    public void ServingSize() {
        chocolateFrappuccino.setServingSize("150ml ");
    }
    
    
    
    @Override
    public void calories() {
       chocolateFrappuccino.setcalories("300kcal ");
    }

    @Override
    public void protein() {
       chocolateFrappuccino.setprotein("2g ");
    }

    @Override
    public void carbohydrate() {
        chocolateFrappuccino.setcarbohydrate("35g ");
    }

    @Override
    public void fat() {
        chocolateFrappuccino.setfat("5g ");
    }

    @Override
    public void sodium() {
        chocolateFrappuccino.setsodium("230mg ");
    }

    @Override
    public void sugar() {
        chocolateFrappuccino.setsugar("26g ");
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