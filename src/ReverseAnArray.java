import java.util.Arrays;
import java.util.Scanner;

/*6. **Reverse an Array:**
    - **Task:** Create a program to reverse the elements in a character array and print the reversed array.
    - **Sample Input:** `['a', 'b', 'c', 'd', 'e']`
    - **Sample Output:** `['e', 'd', 'c', 'b', 'a']`*/
public class ReverseAnArray {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = scanner.nextInt();
        char[] characterArray = new char[size];
        for (int i = 0; i < characterArray.length; i++) {
            System.out.println("Enter the " + (i+1) + " character type element");
            characterArray[i] = scanner.next().charAt(0);

        }
        int mid = characterArray.length/2;
        for (int i = 0;i<mid;i++){
            char temp = characterArray[i];
            characterArray[i] = characterArray[characterArray.length-(i+1)];
            characterArray[characterArray.length-(i+1)] = temp;
        }
        for (int i = 0; i < characterArray.length; i++) {
            if(i==0){
                System.out.print("[");
            }
            System.out.print(characterArray[i]);
            if(i != characterArray.length-1){
                System.out.print(", ");
            }else {
                System.out.print("]");
            }
        }
    }
}
