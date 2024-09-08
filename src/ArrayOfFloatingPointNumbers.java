import java.util.Scanner;

public class ArrayOfFloatingPointNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] floatArray = new float[4];
        for (int i = 0; i < floatArray.length; i++) {
            System.out.println("Enter the " + (i+1) + " floating number element");
            floatArray[i] = scanner.nextFloat();
        }
        for (int i = 0; i < floatArray.length; i++) {
            if(i==0){
                System.out.print("[");
            }
            System.out.print(floatArray[i]);
            if(i != floatArray.length-1){
                System.out.print(", ");
            }else {
                System.out.print("]");
            }
        }

    }
}
