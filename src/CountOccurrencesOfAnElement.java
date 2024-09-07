import java.util.Scanner;

public class CountOccurrencesOfAnElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an character array");
        int size = scanner.nextInt();
        char[] characterArray = new char[size];
        for (int i = 0; i < characterArray.length; i++) {
            System.out.println("Enter the " + (i+1) + " character element");
            characterArray[i] = scanner.next().charAt(0);
        }
        System.out.println("Enter the character which you want to count");
        char countElement = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < characterArray.length; i++) {
            if(characterArray[i] == countElement){
                count++;
            }
        }
        System.out.println("'" + countElement + "' occurs " + count + " times");
    }
}
