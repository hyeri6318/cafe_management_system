/**
 *최초 작성자 : 윤채민, 이혜리
 *최초 작성일 : 
 * 목적 : 
 */
package design_project.cake;

abstract class cakeStore {
    protected abstract cake createCake(String item);
    
    public cake orderCake(String type){
        cake cake = null;
        
        cake=createCake(type);
        
        cake.cook();
        
        return cake;
    }
}