import java.util.Scanner;

public class SumOfEvenElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = scanner.nextInt();
        int[] integerArray = new int[size];
        int evenSum = 0;
        for (int i = 0; i < integerArray.length; i++) {
            System.out.println("Enter the " +(i+1) +" element");
            integerArray[i] = scanner.nextInt();
            if(integerArray[i]%2 == 0){
                evenSum += integerArray[i];
            }
        }
        System.out.println("Sum of Even Elements = "+evenSum);
    }
}
