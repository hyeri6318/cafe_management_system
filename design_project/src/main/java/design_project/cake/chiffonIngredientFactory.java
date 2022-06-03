/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_project.cake;

/**
 *
 * @author 윤채민
 */
public class chiffonIngredientFactory implements cakeIngredientFactory {
  public topping createTopping() {
      return new icecream();
  }

  public fruit createFruit() {
      return new grape();
  }
}