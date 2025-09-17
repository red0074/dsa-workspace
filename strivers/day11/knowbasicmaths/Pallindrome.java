package day11.knowbasicmaths;

import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(is_pallindrome(n)){
            System.out.println("Pallindrome number");
        }else{
            System.out.println("Not pallindrome Number");
        }
        sc.close();
    }
    public static boolean is_pallindrome(int n){
        int rev=reverse(n);
        if(rev==n){
            return true;
        }
        return false;
    }
    public static int reverse(int n){
        int r=0;
        while(n>0){
            int rem=n%10;
            r=(r*10)+rem;
            n/=10;
        }
        return r;
    }
}
