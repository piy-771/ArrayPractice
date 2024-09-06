public class IntegerArrayInitialization {
    public static void main(String[] args) {
        int[] integerArray = {10,20,30,40,50};
        for (int i = 0; i < integerArray.length; i++) {
            if(i==0){
                System.out.print("[");
            }
            System.out.print(integerArray[i]);
            if(i != integerArray.length-1){
                System.out.print(", ");
            }else{
                System.out.print("]");
            }
        }
    }
}
