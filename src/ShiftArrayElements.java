import java.util.Scanner;

public class ShiftArrayElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = scanner.nextInt();
        int[] integerArray = new int[size];
        for (int i = 0; i < integerArray.length; i++) {
            System.out.println("Enter the " + (i+1) + " element");
            integerArray[i] = scanner.nextInt();

        }
        int temp = integerArray[0];
        for (int i = 0; i < integerArray.length; i++) {
            if (i== integerArray.length-1){
                integerArray[i] = temp;
            }else{
                integerArray[i] = integerArray[i+1];
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
