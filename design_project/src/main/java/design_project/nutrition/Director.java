
package design_project.nutrition;

public class Director  {
  private NutritionBuilder nutritionBuilder;
  
  public Director(NutritionBuilder nutritionBuilder) {
      this.nutritionBuilder = nutritionBuilder;
  }
      
    public void constructnutrition() {
   nutritionBuilder.AmericanoBuilder();
   nutritionBuilder.BlackteaBuilder();
   nutritionBuilder.CheeseappleCakeBuilder();
   nutritionBuilder.CheeseblueberryCakeBuilder();
   nutritionBuilder.CheesecherryCakeBuilder();
   nutritionBuilder.ChiffonappleCakeBuilder();
   nutritionBuilder.ChiffonblueberryCakeBuilder();
   nutritionBuilder.ChiffoncherryCakeBuilder();
   nutritionBuilder.ChocolateFrappuccinoBuilder();
   nutritionBuilder.FreshcreamappleCakeBuilder();
   nutritionBuilder.FreshcreamblueberryCakeBuilder();
   nutritionBuilder.FreshcreamcherryCakeBuilder();
   nutritionBuilder.KiwiSmoothieBuilder();
   nutritionBuilder.LatteBuilder();
   nutritionBuilder.MatchaBuilder();
   nutritionBuilder.StrawberrySmoothieBuilder();
   nutritionBuilder.VanillaFrappuccinoBuilder();
   nutritionBuilder.ServingSize();
   nutritionBuilder.calories();
   nutritionBuilder.protein();
   nutritionBuilder.carbohydrate();
   nutritionBuilder.fat();
   nutritionBuilder.sodium();
   nutritionBuilder.sugar();
  }
  public Americano getAmericano () {
      return nutritionBuilder.getAmericano();
  }
  
  public Latte getLatte () {
      return nutritionBuilder.getLatte();
  }
  
  public Blacktea getBlacktea () {
      return nutritionBuilder.getBlacktea();
  }
  
  public CheeseappleCake getCheeseappleCake () {
      return nutritionBuilder.getCheeseappleCake();
  }
  
   public CheeseblueberryCake getCheeseblueberryCake () {
      return nutritionBuilder.getCheeseblueberryCake();
  }
   
    public CheesecherryCake getCheesecherryCake () {
      return nutritionBuilder.getCheesecherryCake();
  }
    
     public ChiffonappleCake getChiffonappleCake () {
      return nutritionBuilder.getChiffonappleCake();
  }
     
      public ChiffonblueberryCake getChiffonblueberryCake () {
      return nutritionBuilder.getChiffonblueberryCake();
  }

      public ChiffoncherryCake getChiffoncherryCake () {
      return nutritionBuilder.getChiffoncherryCake();
  }
      
      public ChocolateFrappuccino getChocolateFrappuccino () {
      return nutritionBuilder.getChocolateFrappuccino();
  }
      
      
      public FreshcreamappleCake getFreshcreamappleCake () {
      return nutritionBuilder.getFreshcreamappleCake();
  }
      
     public FreshcreamblueberryCake getFreshcreamblueberryCake () {
      return nutritionBuilder.getFreshcreamblueberryCake();
  }
     
     public FreshcreamcherryCake getFreshcreamcherryCake () {
      return nutritionBuilder.getFreshcreamcherryCake();
  }
     
     public KiwiSmoothie getKiwiSmoothie () {
      return nutritionBuilder.getKiwiSmoothie();
  }
     
     public Matcha getMatcha () {
      return nutritionBuilder.getMatcha();
  }
     
     public StrawberrySmoothie getStrawberrySmoothie () {
      return nutritionBuilder.getStrawberrySmoothie();
  }
     
     public VanillaFrappuccino getVanillaFrappuccino () {
      return nutritionBuilder.getVanillaFrappuccino();
  }
     
         
}