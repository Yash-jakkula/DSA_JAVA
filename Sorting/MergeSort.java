import sorting.ArrayDisplay;
import sorting.ArrayInputReader;

public class MergeSort{
    public static void merge(int[] arr,int[] temp,int lo,int mid,int hi){
        for(int i=lo;i<=hi;i++){
            temp[i] = arr[i];
        }
        int k=lo,j=mid+1;
        for(int i=lo;i<=hi;i++){
            if(k>mid) arr[i] = temp[j++];
            else if(j>hi) arr[i] = temp[k++];
            else if(temp[k] < temp[j]) arr[i] =temp[k++];
            else arr[i] = temp[j++];
        }
    }

    public static void sort(int[] arr,int[] temp,int lo,int hi){
        int mid = lo + (hi-lo)/2;
        if(lo<hi) {
            sort(arr, temp, lo, mid);
            sort(arr, temp, mid + 1, hi);
            merge(arr, temp, lo, mid, hi);
        }
    }
    public static void main(String args[]){
        ArrayInputReader arr1 = new ArrayInputReader();
        int[] arr = arr1.createArrray();
        int[] temp = new int[arr.length];
        sort(arr,temp,0, arr.length-1);
        ArrayDisplay d = new ArrayDisplay();
        d.display(arr);
    }
}