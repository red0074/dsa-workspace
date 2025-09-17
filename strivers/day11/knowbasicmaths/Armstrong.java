package day11.knowbasicmaths;

import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(is_armstrong(n)){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not Armstrong Number");
        }
        sc.close();
    }
    // ->optimal tc: O(log 10 N+1) sc:O(1)
    public static boolean is_armstrong(int n){
        // int count=count(n);
        int count=String.valueOf(n).length();
        int sum=0;
        int temp=n;
        while(n>0){
            int rem=n%10;
            sum=sum+(int)Math.pow(rem,count);
            n/=10;
        }
        if(sum==temp){
            return true;
        }
        return false;
    }
    public static int count(int n){
        int c=0;
        int temp=n;
        while(temp>0){
            c++;
            temp/=10;
        }
        return c;
    }
}
