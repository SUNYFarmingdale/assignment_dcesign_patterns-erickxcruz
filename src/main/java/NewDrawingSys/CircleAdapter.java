/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewDrawingSys;



/**
 * This is the CircleAdapter that implements the Shape interface.
 * @author erickcruz
 */
public class CircleAdapter implements Shape {
    
    //Creating an instabnce of the circle class
    private Circle circle;

    /**
     * Creating an instance of the CircleAdapter that takes in a circle as an argument.
     * @param circle 
     */
    public CircleAdapter(Circle circle) {
        this.circle = circle;
    }

    /**
     * This draw method will be used to calculate the radius and draw the circle.
     * Overrides the method in the interface.
     * @param x1
     * @param y1
     * @param x2
     * @param y2 
     */
    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        int radius = (int) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        circle.draw(x1, y1, radius);
    }
}
