package org.example;

import java.util.List;

/**
 * MyPicture.java
 * --------------
 * Write the code to draw your scene here. Most of your changes should go inside
 * the drawPicture method below, unless you're defining additional methods or
 * variables to help organize your code.
 *
 * If you want to enhance the functionality of the drawing library itself (e.g. add
 * a new shape function), put that in SimpleGraphics.java instead.
 */
public class MyPicture {

    public static void drawPicture(double width, double height) {
        // Fill the background
        SimpleGraphics.fillBackground("white");

        // make some variables available
        String[] colors = {"red", "green", "blue", "cyan", "magenta", "yellow"};

        double triangleHeight = height / 5;
        double triangleWidth = width / 3;

        // Draw the tessellation
        // code for red triangles
        SimpleGraphics.setFillColor(colors[0]);

        // call fill
        SimpleGraphics.fillCircle(450, 50, 50);

        SimpleGraphics.setFillColor("#827e7e"); // relatively dark gray
        SimpleGraphics.fillTriangle(300, 150, 400, 20, 350, 150);
        SimpleGraphics.setFillColor("#c7c1c1"); // lighter gray
        SimpleGraphics.fillTriangle(350, 150, 400, 20, 550, 150);

        SimpleGraphics.setOutlineColor("black");
        SimpleGraphics.setLineThickness(1);
        SimpleGraphics.drawLine(0, 150, 600, 150);

        // Define the points the curve should bend through
        List<double[]> riverPoints = List.of(
            new double[]{100, 150}, // Start point
            new double[]{300, 200}, // Bends towards here
            new double[]{200, 350}, // Bends back here
            new double[]{500, 500}  // End point
        );

        SimpleGraphics.setOutlineColor("blue");
        SimpleGraphics.setLineThickness(8);
        SimpleGraphics.drawCurve(riverPoints);
    }

    public static void main(String[] args) {
        // Launch the window; only edit the starting canvas dimensions if you'd like to.
        SimpleGraphics.start(MyPicture::drawPicture, 600, 400);
    }
}
