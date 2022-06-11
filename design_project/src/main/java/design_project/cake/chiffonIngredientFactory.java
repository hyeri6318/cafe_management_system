/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_project.cake;

/**
 *
 * @author 윤채민, 이혜리
 */
public class chiffonIngredientFactory implements cakeIngredientFactory {

    //쉬폰케이크 과일 추가
    public fruit createFruit() {
        return new grape();
    }

    //쉬폰케이크 토핑 추가
    public topping createTopping() {
        return new icecream();
    }
}