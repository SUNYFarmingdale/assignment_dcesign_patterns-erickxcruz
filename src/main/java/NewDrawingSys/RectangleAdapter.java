/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewDrawingSys;



/**
 * This is the Rectangle Adapter class that implements the Shape interface
 * @author erickcruz
 */
public class RectangleAdapter implements Shape {
   //Create an instance of Rectangle
    private Rectangle rectangle;
    
    /**
     * Create an instance of the RectangleAdapter class
     * @param rectangle 
     */
    public RectangleAdapter(Rectangle rectangle) {
        this.rectangle = rectangle;
    }
    
    /**
     * Overrides the draw method in the interface. Draws the rectangle from its data.
     * @param x1
     * @param y1
     * @param x2
     * @param y2 
     */
    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        rectangle.draw(x1, y1, x2, y2);
    }
}
    
