import java.util.Scanner;

public class SumOfArrayElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] integerArray = new int[10];
        int sum = 0;
        for (int i = 0; i < integerArray.length; i++) {
            System.out.println("Enter the " + (i+1) +" Element");
            integerArray[i] = scanner.nextInt();
            sum += integerArray[i];
        }
        System.out.println("Sum = " + sum);
    }
}
