1.	Write a java program to print out the flag of Nigeria as shown in the slide
a)	Use a single loop.
Import.java.util;
 Public class NigeriaSingleLoop {
   Public State Void main (string[]args) {
      
        Int rows = 7;
        for (int i=1; i<=rows*3; i++) {
            if ((i-1) %3 == 0 && i>1) system.out.printin();
            if (i % 3 ==1 || i % 3 == 0) {
               system.out.print(“ \033[42m ”);
            }  else {
                 System.out.print (“ \033[47m ”);
            }
       }
        System.out.print (“\033[0m ”);
     }
}
b)	Using a nested loop

Import.java.util;
  Public class NigeriaNestedLoop {
     Public static void main(string{}args) {
        Int rows= 6;
        Int columns= 15;

        for (int i=0; i< rows; i++) {
           for (int j = 0; j< rows; j++) {
               if (j< columns / 3 || j>2*columns/3) {
                   system.out.print (“\033[42m ”);
                } else {
                      System.out.print (“\033m[47m ”);
                }
          }
           System.out.print(“\033m[0m ”);
          }
    }

2.	Write a java program to print out the flag of Nigeria as shown in the slide. To do this
a.	Use a single loop
public class NigeriaFlagSingleLoop {
    public static void main(String[] args) {
        int height = 5; 
        for (int i = 0; i < height; i++) {
            if (i < height) {
                System.out.print("Green ");
            }
            if (i < height) {
                System.out.print("White ");
            }
            if (i < height) {
                System.out.println("Green");
            }
        }
    }
}
b.	Use a nested loop
public class NigeriaFlagNestedLoop {
 public static void main(String[] args) {
   int height = 5; 
     for (int i = 0; i < height; i++) { 
      for (int j = 0; j < 3; j++) {
          if (j == 0 || j == 2) { 
       System.out.print("Green "); 
  } else {
    System.out.print("White ");
 }
                   }
 System.out.println();
                    }
                }
           }



3.	Consider any array that has the data shown below. Write a java program to do the following
a)	The mean. Mean = sum of all elements / number of element.
b)	Print out the median. Median= elements at the middle.
import java.util.Arrays;

public class MeanMedianCalculator {
    public static void main(String[] args) {
        double[] data = {12, 15, 14, 10, 18, 20, 16};

    
        double mean = calculateMean(data);
        System.out.println("Mean: " + mean);

        double median = calculateMedian(data);
        System.out.println("Median: " + median);
    }

    public static double calculateMean(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }
    public static double calculateMedian(double[] array) {
        Arrays.sort(array); // Sorting the array
        int length = array.length;
        if (length % 2 == 0) {
              return (array[length / 2 - 1] + array[length / 2]) / 2;
        } else {
            return array[length / 2];
        }
    }
}
4.	Declare an array of Length 10. 
Write a program using a loop to assign elements to the array by accepting input from the user. Make sure to state the index that the users input will be to the user before accepting the input.
Using a for loop, print out  the input extended by the user.
            import java.util.Scanner;

public class UserInputArray {
    public static void main(String[] args) {
        String[] array = new String[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter a value for index " + i + ": ");
            array[i] = scanner.nextLine();
        }
        System.out.println("\nYou entered the following values:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Index " + i + ": " + array[i]);
        }
        scanner.close();
    }
}
5.	Declare a 2D array of size 10 by 10.
Write a program using a loop to assign elements to the array by accepting input from the user. Make sure to state the index that the user’s input will be to the user before accepting the input.
Using a for each loop, print out the input entered by the user.
import java.util.Scanner;

public class TwoDArrayUserInput {
    public static void main(String[] args) {

        String[][] array = new String[10][10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("Enter a value for index [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextLine();
            }
        }

        System.out.println("\nYou entered the following values:");
        for (String[] row : array) {
            for (String value : row) {
                System.out.print(value + "\t");             }
            System.out.println(); // New line for each row
        }

        scanner.close();
    }
}
