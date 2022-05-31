package design_project.nutrition;


public class CheesecherryCake {
  private String ServingSize;


  private String protein;

  private String carbohydrate;

  private String fat;

  private String sodium;

  private String sugar;

  private String calories;

  public void setServingSize(String ServingSize) {
   this.ServingSize = ServingSize;
  }


  public void setprotein(String protein) {
    this.protein = protein;
  }

  public void setcarbohydrate(String carbohydrate) {
    this.carbohydrate = carbohydrate;
  }

  public void setfat(String fat) {
   this.fat = fat;
  }

  public void setsodium(String sodium) {
   this.sodium = sodium;
  }

  public void setsugar(String sugar) {
   this.sugar = sugar;
  }

  public void setcalories(String calories) {
    this.calories = calories; 
  }
@Override
 public String toString() {
      return  "CheesecherryCake ServingSize: "+ServingSize+" [calories: "+calories+"protein: "+protein+"carbohydrate: "+carbohydrate+"fat: "+fat+"sodium: "+sodium+"sugar: "+sugar+"]";
    }
             
             
 }



