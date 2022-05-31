package design_project.nutrition;

public class StrawberrySmoothieBuilder extends NutritionBuilder {

   @Override
    public void ServingSize() {
        strawberrySmoothie.setServingSize("200ml ");
    }
    
    
    
    @Override
    public void calories() {
        strawberrySmoothie.setcalories("420kcal ");
    }

    @Override
    public void protein() {
       strawberrySmoothie.setprotein("12g ");
    }

    @Override
    public void carbohydrate() {
        strawberrySmoothie.setcarbohydrate("46g ");
    }

    @Override
    public void fat() {
        strawberrySmoothie.setfat("15g ");
    }

    @Override
    public void sodium() {
       strawberrySmoothie.setsodium("250mg ");
    }

    @Override
    public void sugar() {
        strawberrySmoothie.setsugar("37g ");
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