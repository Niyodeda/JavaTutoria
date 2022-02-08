/*
 Created by Adedoyin Adelabu for Assignment3 2021-01-29. This program takes created classes and displays them.
 */
package assignment3;

/**
 *
 * @author Doyin
 */
public class ASSIGNMENT3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rect R1= new Rect(); // Creates a new rectangle//
        R1.SetDim(5.0,4.0); // Sets dimension of rectangles//
        R1.print(); // calls for the information sstored in the function//
        R1.ChangeSize(6);//Changes the rectangle to a perfect square//
        R1.move(5, 9);
        R1.print(); // Calls for the new information after change//
        
        Date D1 = new Date(); // creates date//
        D1.SetDate(1,2,2022);// sets date//
        D1.print();//prints contents of date//
        int K = D1.compare(D1);// initializes and sets variable K to output of compare method//
        System.out.println(K);// prints k//
        D1.AddDays(70);// adds amount of days to previous date//
        D1.print();//prints all the contennts of date class including new date after days added//
        
             
}
}