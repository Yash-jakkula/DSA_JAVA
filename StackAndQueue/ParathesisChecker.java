package StackAndQueue;
import java.util.*;
public class ParathesisChecker{
    public static void main(String args[]){
        Stack<Character> stack1 = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the parahesis to be matched:");
        String para = sc.nextLine();
        for(int i=0;i<para.length();i++){
            if(para.charAt(i) == '('){
                stack1.push(para.charAt(i));
            }
            else{
                stack1.pop();
            }
        }
        if(stack1.size() > 0){
            System.out.println("parathesis not matched");
        }
        else{
            System.out.println("paranthesis matched");
        }
        
    }
}