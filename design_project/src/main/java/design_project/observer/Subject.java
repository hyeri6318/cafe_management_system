/**
 *최초 작성자 : 윤채민
 *최초 작성일 : 2022-06-11
 */
package design_project.observer;

public interface Subject {
    void registerObserver(Observer observer);
    void notifyObserver();
}
