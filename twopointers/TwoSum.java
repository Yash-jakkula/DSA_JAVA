package twopointers;

public class TwoSum {
    public static void main(String args[]){
        int[] numbers = new int[]{5,25,75};
        int target = 100;
        int i = 0,j=numbers.length-1;
        while(i<j){
            int k = numbers[i] + numbers[j];
            if(k>target){
                j--;
            }
            else if(k<target){
                i++;
            }
            else{
               System.out.println(i+1+" "+j+1);
               break;
            }
        }

    }
}
