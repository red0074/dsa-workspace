package day8.knowbasicmaths;

import java.util.Scanner;

public class ResetithBit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=sc.nextInt();
        int res=reset(n,i);
        System.out.println("Binary of the n before reset of i th bit: "+binary(n));
        System.out.println("Binary of the n after reset of ith bit: "+binary(res));
        sc.close();
    }
    public static String binary(int n){
        String temp="";
        while (n>0) {
            int rem=n%2;
            temp=rem+temp;
            n/=2;
        }
        return temp;
    }
    public static int reset(int n,int i){
        return n & ~(1<<(i-1));
    }
}
