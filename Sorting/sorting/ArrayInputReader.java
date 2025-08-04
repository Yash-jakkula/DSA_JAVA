package sorting;
import java.util.Scanner;
public class ArrayInputReader{
    public int[] createArrray(){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        System.out.println("enter array elements");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}
