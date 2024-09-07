/*Find Minimum Element:**
    - **Task:** Write a Java program to find the minimum value in a double array.
    - **Sample Input:** `[2.5, 3.8, 1.9, 5.6, 4.3]`
    - **Sample Output:** `Minimum Element = 1.9`*/

import java.util.Scanner;

public class FindMinimumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = scanner.nextInt();
        double[] doubleArray = new double[size];
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.println("Enter the double type element");
            doubleArray[i] = scanner.nextDouble();
        }
        double minimumElement = doubleArray[0];
        for (int i = 0; i < doubleArray.length; i++) {
            if(doubleArray[i]<minimumElement){
                minimumElement = doubleArray[i];
            }
        }
        System.out.println("Minimum Element = " + minimumElement);
    }
}
