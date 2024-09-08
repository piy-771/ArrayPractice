import java.util.Scanner;

public class ProductOfArrayElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = scanner.nextInt();
        double[] doubleArray = new double[size];
        double product = 1;
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.println("Enter the " + (i+1) + " double element");
            doubleArray[i] = scanner.nextDouble();
            product = product * doubleArray[i];
        }
        System.out.println("Product = " + product);
     }
}
