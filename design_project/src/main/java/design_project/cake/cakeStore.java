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
abstract class cakeStore {
    protected abstract cake createCake(String item);
    
    public cake orderCake(String type){
        cake cake = null;
        
        cake=createCake(type);
        
        cake.cook();
        
        return cake;
    }
}