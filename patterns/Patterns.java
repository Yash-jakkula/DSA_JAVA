package patterns;
class Pat{
    /*
      *
    * * *
  * * * * *
* * * * * * *
     */
    public void pattern1(int n){
        int c = 1;
        for(int i=0;i<n;i++){
            System.out.print("  ".repeat(n-(i+1)));
            for(int j=0;j<c;j++){
                System.out.print("* ");
            }
            c+=2;
            System.out.println();
        }
    }
    /*
      *
    * * *
  * * * * *
* * * * * * *
  * * * * *
    * * *
      *
     */
    public void pattern2(int n){
        int c = 1;
        for(int i=0;i<n;i++){
            
            System.out.print("  ".repeat(n-(i+1)));
            for(int j=0;j<c;j++){
                System.out.print("* ");
            }
            System.out.println();
            c+=2;
            if(i == n-1){
                c=c-2;
                for(i=n;i>0;i--){
                    c-=2;
                System.out.print("  ".repeat(n-(i-1)));
                for(int j=0;j<c;j++){
                    System.out.print("* ");
                }
                
                System.out.println();
            }
            i=n;
            }
            
        }
    }
    /*
     1      1
     12    21
     123  321
     12344321
     */
    public void pattern3(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(j+1);
            }
            System.out.print("  ".repeat((n-(i+1))));   
            for(int k=i;k>=0;k--){
                System.out.print(k+1);
            }
            
            System.out.println();
        }
    }
}
public class Patterns {
  public static void main(String args[]){
    Pat p = new Pat();
    p.pattern3(4);
  }  
}
