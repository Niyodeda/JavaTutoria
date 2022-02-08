/*
Created by Adedoyin Adelabu for Assignment3 2021-01-29. This program creates a rectangle class and calculates its perimeter and area, changes its size, moves its position and prints all values.
 */
package assignment3;

/**
 *
 * @author Doyin
 */
public class Rect {

    double L, W;
    int y, x = 0;

    void SetDim(double Length, double Width) {// Sets dimension of rectangles//
        L = Length;
        W = Width;
        y = (int) Width;
    }

    double getCircumf() { // uses operations to get the circumference//
        return 2 * (L + W);
    }

    double getArea() { //uses operations to get the area//
        return (L * W);
    }

    void ChangeSize(int n) { // changes the Length and Width to the entered value//
        L = n;
        W = n;
        y = n;
    }

    void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void print() { // prints every variable in the class//
        System.out.printf("Length:%.2f, Width:%.2f, Area:%.2f, Circumference:%.2f, Topleft corner (%d,%d)\n", L, W, L * W, 2 * (L + W), x, y);
    }

}
