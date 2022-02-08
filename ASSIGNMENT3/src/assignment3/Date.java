/*
 Created by Adedoyin Adelabu for Assignment3 2021-01-29. This program makes a date class and prints the date imputted the days added and compares the date between the current and object
 */
package assignment3;

import static java.lang.Math.abs;

/**
 *
 * @author Doyin
 */
public class Date {
    int Day, Month, Year;

    void SetDate(int Day, int Month, int Year) { //sets the date to what was inputted//
        this.Day = Day;
        this.Month = Month;
        this.Year = Year;
    }

    void AddDays(int n) {
        while (n > 0) {
            switch (Month) { // all months that have 31 days//
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                    if (Day + n > 31) // Every switch case checks if the amount of days added is greater than how many days are in the month//
                    {
                        Month++; // if days added exceed the amount of days in the month, it moves to the next month//
                        Day = 1;
                        n = n - 31;
                        break;
                    } else {
                        Day += n;
                        n = 0;
                        break;
                    }
                case 2: // month that ends with 28//
                    if (Day + n > 28) {
                        Month++;
                        Day = 1;
                        n = n - 28;
                        break;
                    } else {
                        Day += n;
                        n = 0;
                        break;
                    }
                case 4:   // months with 30 days max// 
                case 6:
                case 9:
                case 11:
                    if (Day + n > 30) {
                        Month++;
                        Day = 1;
                        n = n - 30;
                        break;
                    } else {
                        Day += n;
                        n = 0;
                        break;
                    }
                case 12://new years//
                    if (Day + n > 31) {
                        Year++;
                        Month++;
                        Day = 1;
                        n = n - 31;
                        break;
                    } else {
                        Day += n;
                        n = 0;
                        break;
                    }
            }
        }
    }

    int compare(Date a) {
        return abs(this.Day - a.Day); // Questions asks for current object and input object// 
        // because current object and D1 are the same the return must be 0//

    }

    void print() { // prints every variable in the class//
        System.out.printf("%d-%d-%d\n", Day, Month, Year);
    }
    
}
