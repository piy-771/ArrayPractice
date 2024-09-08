import java.util.Scanner;

public class CheckForDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = scanner.nextInt();
        int[] integerArray = new int[size];
        for (int i = 0; i < integerArray.length; i++) {
            System.out.println("Enter the " + (i+1) + " integer elementt");
            integerArray[i] = scanner.nextInt();
        }
        int count = 0;
        for (int i = 0; i < integerArray.length; i++) {
            for (int j = i; j < integerArray.length; j++) {
                if(integerArray[i] == integerArray[j]){
                    count++;
                }
            }
            if(count>1){
                System.out.println("Duplicate found : " + integerArray[i]);
                break;
            }
        }
    }
}
