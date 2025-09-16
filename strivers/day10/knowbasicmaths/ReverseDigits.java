package day10.knowbasicmaths;

import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=reverse(n);
        System.out.println(rev);
        sc.close();
    }    
    public static int reverse(int n){
        int ans=0;
        while(n>0){
            int rem=n%10;
            ans=(ans*10)+rem;
            n/=10;
        }
        return ans;
    }
}
