import java.util.Scanner;

public class FindSecondLargestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = scanner.nextInt();
        int[] integerArray = new int[size];
        for (int i = 0; i < integerArray.length; i++) {
            System.out.println("Enter the " + (i+1) + " integer element");
            integerArray[i] = scanner.nextInt();
        }
        int largest = integerArray[0];
        int secondLargest = -2147483648;
        for (int i = 1; i < integerArray.length; i++) {
            if(integerArray[i]>largest){
                secondLargest = largest;
                largest = integerArray[i];
            }
            if(integerArray[i]<largest && integerArray[i]>secondLargest){
                secondLargest = integerArray[i];
            }

        }
        System.out.println("Second Largest Element = " + secondLargest);
    }
}
