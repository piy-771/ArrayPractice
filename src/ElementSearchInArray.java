import java.util.Scanner;

public class ElementSearchInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = scanner.nextInt();
        int[] integerArray = new int[size];
        for (int i = 0; i < integerArray.length; i++) {
            System.out.println("Enter the" + (i+1) + "element");
            integerArray[i] = scanner.nextInt();
        }
        System.out.println("Enter the search element");
        int search = scanner.nextInt();

        for (int i = 0; i < integerArray.length; i++) {
            if(integerArray[i] == search){
                System.out.println("Element " + search + "found at index " + i);
                break;
            }
        }
    }
}
