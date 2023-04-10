/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewDrawingSys;

/**
 * This is the Rectangle class that will be used to create instances of rectangle
 * @author erickcruz
 */
public class Rectangle {

    /**
     * This is a blank/default constructor for Rectangle
     */
    Rectangle() {
    }
        
    /**
     * This method gets the Rectangle information from its arguments and then prints it out.
     * @param x
     * @param y
     * @param width
     * @param height 
     */
     public void draw(int x, int y, int width, int height) {
        System.out.println("Rectangle with coordinate top-left corner (" + x + ";" + y + "), width: " + width
                + ", height: " + height);
    }
    
}
