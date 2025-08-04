import sorting.ArrayInputReader;

public class ShellSort {
    public static void main(String args[]) {
        ArrayInputReader a = new ArrayInputReader();
        int[] arr = a.createArrray();
        int h = 4;
//        while (h < h / 4)
//            h = 3 * h + 1; // 3x+1 increment modal
        while(h>=1){
            for(int i=h;i<arr.length;i++){
                for(int j=i;j>=h;j-=h){
                    if(arr[j-h] > arr[j]){
                        int temp = arr[j-h];
                        arr[j-h] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            h=h/4;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }


}
