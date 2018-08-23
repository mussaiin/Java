/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task9;

/**
 *
 * @author Nurlybek
 */
public class Circle extends GeometricObject{
    double radius;
    public Circle() {
    }
    public Circle(double radius){
        this.radius = radius;
    }
    @Override 
    public double getArea() {
	return radius * radius * Math.PI;
    }

}
