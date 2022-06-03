package design_project.nutrition;

public class VanillaFrappuccino {
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
      return  "바닐라 프라푸치노 제공량 : "+ServingSize+" [칼로리 : "+calories+", 단백질 : "+protein+", 탄수화물 : "+carbohydrate+", 지방 : "+fat+", 나트륨 : "+sodium+", 당 : "+sugar+"]";
    }
             
             
 }



