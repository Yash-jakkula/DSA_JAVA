package Sorting;

public class SelectionSort {
    public static void main(String args[]){
        int[] arr = {2,10,1,5,7,8,8,3,4,5};
        for(int i=0;i<arr.length;i++){
            int min = arr[i];
            int index = 0;
            for(int j=i+1;j<arr.length;j++){
                if(min > arr[j]){
                    min=arr[j];
                    index = j;
                }
            }
            if(index!=0){
            int temp = arr[i];
            arr[i] = min;
            arr[index] = temp;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
