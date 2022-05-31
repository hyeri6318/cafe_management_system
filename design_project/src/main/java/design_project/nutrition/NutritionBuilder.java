package design_project.nutrition;

public abstract class  NutritionBuilder {
     public Americano americano;
     public Blacktea blacktea;
     public CheeseappleCake cheeseappleCake;
     public CheeseblueberryCake cheeseblueberryCake;
     public CheesecherryCake   cheesecherryCake;               
     public ChiffonappleCake chiffonappleCake;
     public ChiffonblueberryCake chiffonblueberryCake;
     public ChiffoncherryCake chiffoncherryCake;
     public ChocolateFrappuccino chocolateFrappuccino;
     public FreshcreamappleCake freshcreamappleCake;
     public FreshcreamblueberryCake freshcreamblueberryCake;
     public FreshcreamcherryCake freshcreamcherryCake;
     public KiwiSmoothie kiwiSmoothie;
     public Latte latte;
     public Matcha matcha;
     public StrawberrySmoothie   strawberrySmoothie;      
     public VanillaFrappuccino vanillaFrappuccino;
                   
            
            
  public void AmericanoBuilder() {
      americano = new Americano();
  }
   
  public void BlackteaBuilder() {
     blacktea = new Blacktea();
  }
  
  public void CheeseappleCakeBuilder() {
      cheeseappleCake = new CheeseappleCake();
  }
  
   public void CheeseblueberryCakeBuilder() {
      cheeseblueberryCake = new CheeseblueberryCake();
  }
   
   public void CheesecherryCakeBuilder() {
      cheesecherryCake = new CheesecherryCake();
  }
   
    public void ChiffonappleCakeBuilder() {
      chiffonappleCake = new ChiffonappleCake();
  }
    
     public void ChiffonblueberryCakeBuilder() {
      chiffonblueberryCake = new ChiffonblueberryCake();
  }
     
     public void ChiffoncherryCakeBuilder() {
      chiffoncherryCake = new ChiffoncherryCake();
  }
     
     public void ChocolateFrappuccinoBuilder() {
      chocolateFrappuccino = new ChocolateFrappuccino();
  }
     
     public void FreshcreamappleCakeBuilder() {
      freshcreamappleCake = new FreshcreamappleCake();
  }
     
     public void FreshcreamblueberryCakeBuilder() {
       freshcreamblueberryCake = new  FreshcreamblueberryCake();
  }
     
     public void FreshcreamcherryCakeBuilder() {
      freshcreamcherryCake = new FreshcreamcherryCake();
  }
     
     
    public void KiwiSmoothieBuilder() {
      kiwiSmoothie = new KiwiSmoothie();
  }
    
    public void   LatteBuilder() {
          latte = new Latte();
  }
    
    public void      MatchaBuilder() {
     matcha = new Matcha();
  }
    
    public void StrawberrySmoothieBuilder() {
    strawberrySmoothie = new StrawberrySmoothie();
  }
    
    public void VanillaFrappuccinoBuilder() {
   vanillaFrappuccino = new VanillaFrappuccino();
  }
  public abstract void ServingSize();
  
  
  
  public abstract void calories();
   
  

  public abstract void protein();
  

  public abstract void carbohydrate();
  
  public abstract void fat();
          
  public abstract  void sodium();
          
  public abstract  void sugar ();       
  

  public abstract Americano    getAmericano();
  

  public abstract Blacktea getBlacktea();
  
  public abstract CheeseappleCake getCheeseappleCake();
  
  public abstract  CheeseblueberryCake getCheeseblueberryCake();
  
  public abstract CheesecherryCake getCheesecherryCake();
  
  public abstract ChiffonappleCake getChiffonappleCake ();
  
  public abstract ChiffonblueberryCake getChiffonblueberryCake ();
  
  public abstract ChiffoncherryCake getChiffoncherryCake ();
  
  public abstract ChocolateFrappuccino getChocolateFrappuccino();
  
  public abstract FreshcreamappleCake getFreshcreamappleCake();
  
  public abstract FreshcreamblueberryCake getFreshcreamblueberryCake();
  
  public abstract FreshcreamcherryCake getFreshcreamcherryCake();

   public abstract KiwiSmoothie getKiwiSmoothie();

   public abstract Latte getLatte();
 
   public abstract Matcha getMatcha();
 
   public abstract StrawberrySmoothie getStrawberrySmoothie();

    public abstract VanillaFrappuccino getVanillaFrappuccino();
  












}

