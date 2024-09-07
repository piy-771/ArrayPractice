import java.util.Scanner;

public class CopyingArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an first array");
        int size = scanner.nextInt();
        int[] firstArray = new int[size];
        int[] secondArray = new int[size];
        for (int i = 0; i < firstArray.length; i++) {
            System.out.println("Enter the " + (i+1) +" element");
            firstArray[i] = scanner.nextInt();
            secondArray[i] = firstArray[i];
        }
        System.out.print("Second array: ");
        for (int i = 0; i < secondArray.length; i++) {
            if(i==0){
                System.out.print("[");
            }
            System.out.print(secondArray[i]);
            if(i != secondArray.length-1){
                System.out.print(", ");
            }else{
                System.out.print("]");
            }
        }
    }
}
