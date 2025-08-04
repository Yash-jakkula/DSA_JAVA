
class BinaryRepitative{
    public boolean search(int[] arr,int low,int high,int k){
        int mid = low + (high-low)/2;
  
        if(mid > high) {
            return false;
        }
        if(arr[mid] == k){
            return true;
        }

        if(arr[mid] > k){
            return search(arr,low,mid,k);
        }
        if(arr[mid] < k){
            return search(arr,mid+1,high,k);
        }

        return false;
    }
}


public class BinarySearch {
    public static void main(String args[]){
        int[] arr = new int[]{1,2,3,4,5};
        BinaryRepitative binary = new BinaryRepitative();
        System.out.println(binary.search(arr,0,arr.length,5));
    }
}
