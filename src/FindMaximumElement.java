/*4. **Find Maximum Element:**
    - **Task:** Given an integer array, write a program to find and print the maximum element in the array.
    - **Sample Input:** `[5, 12, 3, 19, 7, 26, 14]`
    - **Sample Output:** `Maximum Element = 26`*/

public class FindMaximumElement {
    public static void main(String[] args) {
        int[] integerArray = {5,12,3,1,19,7,26,14};
        int maximumElement = integerArray[0];
        for (int i = 1; i < integerArray.length; i++) {
            if(integerArray[i] > maximumElement){
                maximumElement = integerArray[i];
            }
        }
        System.out.println("Maximum Element = " + maximumElement);
    }
}
