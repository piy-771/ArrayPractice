import java.util.Scanner;

public class SumOfOddElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = scanner.nextInt();
        int[] integerArray = new int[size];
        int oddSum = 0;
        for (int i = 0; i < integerArray.length; i++) {
            System.out.println("Enter the "+ (i+1) +" integer element");
            integerArray[i] = scanner.nextInt();
            if(integerArray[i]%2 != 0){
                oddSum += integerArray[i];
            }
        }
        System.out.println("Sum of odd elements = " + oddSum);
    }
}
