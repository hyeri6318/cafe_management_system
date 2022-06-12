/**
 *최초 작성자 : 윤채민, 이혜리
 *최초 작성일 : 2022-06-03
 */
package design_project.cake;

interface cakeIngredientFactory {
    fruit createFruit();
    topping createTopping();
}