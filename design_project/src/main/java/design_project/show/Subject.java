/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_project.show;

/**
 *
 * @author 이혜리, 최주호
 */
public interface Subject {

    void registerobserver(Observer o);

    void removeobserver(Observer o);

    void notifyobservers();
}
