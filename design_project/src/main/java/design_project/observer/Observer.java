/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_project.observer;

/**
 *
 * @author mikwang
 */
public interface Observer {
    void update(String type, String ID, String Description, int cost, int otime);
}
