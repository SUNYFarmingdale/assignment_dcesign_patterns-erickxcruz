/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewDrawingSys;

/**
 * Driver File
 * @author MoaathAlrajab
 */
public class ModifiedSystem {

    public static void main(String[] args) {
        // Creating shape objects to add to the array
        Shape[] shapes = {new RectangleAdapter(new NewDrawingSys.Rectangle()), new CircleAdapter(new NewDrawingSys.Circle())};
        int x1 = 10, y1 = 20;
        int x2 = 30, y2 = 60;
        //Calls the draw function on the shapes.
        for (Shape shape : shapes) {
            shape.draw(x1, y1, x2, y2);
        }
    }
}
