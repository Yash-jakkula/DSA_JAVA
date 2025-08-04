import sorting.ArrayInputReader;
public class InsertionSort{
    public static void main(String args[]){
        ArrayInputReader a = new ArrayInputReader();
        int[] arr = a.createArrray();
        for(int k=0;k<arr.length;k++){
            for(int j=k;j>0;j--) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}