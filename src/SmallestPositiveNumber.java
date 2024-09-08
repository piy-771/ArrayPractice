import java.util.Scanner;

public class SmallestPositiveNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = scanner.nextInt();
        int[] integerArray = new int[size];
        for (int i = 0; i < integerArray.length; i++) {
            System.out.println("Enter the " + (i+1) + " integer element");
            integerArray[i] = scanner.nextInt();
        }
        int smallestPositiveNumber = 2147483647;
        for (int i = 1; i < integerArray.length; i++) {
            if(integerArray[i] < smallestPositiveNumber && integerArray[i]>-1){
                smallestPositiveNumber = integerArray[i];
            }
        }
        System.out.println("Smallest Positive Number = " + smallestPositiveNumber);
    }
}
