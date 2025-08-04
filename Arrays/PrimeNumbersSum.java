package Arrays;
import java.util.Scanner;
class PrimeFinder{
    boolean prime(int n){
        if(n == 1) return false;
        if(n == 2 || n == 3) return true;
        if(n%2 ==0 || n%3 == 0) return false;
        for(int i=5;i<=Math.sqrt(n);i=i+6){
            if(n % i == 0 || n%(i+2) == 0){
                return false;
            }
            else return true;
        }
        return true;
    }
}
public class PrimeNumbersSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrimeFinder pf = new PrimeFinder();
        int sum = 0,count =0;
        for(int i=2;i<n;i++){
            sum+=i;
            if(sum <= n && pf.prime(sum)){
                count++;
            }
        }
        System.out.println(count);
    }
}
