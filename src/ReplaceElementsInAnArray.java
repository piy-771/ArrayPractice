import java.util.Scanner;

public class ReplaceElementsInAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = scanner.nextInt();
        int[] integerArray = new int[size];
        for (int i = 0; i < integerArray.length; i++) {
            System.out.println("Enter the " + (i+1) + " integer element");
            integerArray[i] = scanner.nextInt();
        }
        System.out.println("Enter the specific element you want to replace with another element");
        int specificElement = scanner.nextInt();
        System.out.println("Enter the another element");
        int anotherElement = scanner.nextInt();
        for (int i = 0; i < integerArray.length; i++) {
            if(integerArray[i] == specificElement){
                integerArray[i] = anotherElement;
            }
        }
        for (int i = 0; i < integerArray.length; i++) {
            if(i==0){
                System.out.print("[");
            }
            System.out.print(integerArray[i]);
            if(i != integerArray.length-1){
                System.out.print(", ");
            }else {
                System.out.print("]");
            }
        }
    }
}
