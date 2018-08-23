/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication6;

/**
 *
 * @author Admin
 */
public interface Player {

    void moveRight();

    void moveLeft();

    void moveUp();

    void moveDown();

    Position getPosition();
    
}
