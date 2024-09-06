/*3. **Average of Array Elements:**
    - **Task:** Create a float array of size 7. Write a program to calculate the average of the elements in the array.
    - **Sample Input:** `[1.5f, 2.5f, 3.5f, 4.5f, 5.5f, 6.5f, 7.5f]`
    - **Sample Output:** `Average = 4.7857143`*/

import java.util.Scanner;

public class AverageOfArrayElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] floatArray = new float[7];
        float sum = 0;
        for (int i = 0; i < floatArray.length; i++) {
            System.out.println("Enter the " + (i+1) + " Element");
            floatArray[i] = scanner.nextFloat();
            sum += floatArray[i];
        }
        double average =  (double) sum/floatArray.length;
        System.out.println("Average = " + average);
    }
}
