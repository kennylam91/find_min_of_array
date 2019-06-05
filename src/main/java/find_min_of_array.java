import java.util.Scanner;

public class find_min_of_array {
    public static void main(String[] args) {
        int[] myArray;
        System.out.println("Input number elements of Array:");
        Scanner scanner= new Scanner(System.in);
        int sizeArray= scanner.nextInt();
        myArray= new int[sizeArray];
        for(int i=0;i<myArray.length;i++){
            System.out.println("Input element:");
            myArray[i]=scanner.nextInt();

        }
        System.out.println(findMin(myArray));

    }
    public static int findMin(int[] array){
        int min=array[0];
        for(int each:array){
            if(min>each) min=each;
        }
        return min;
    }
}
