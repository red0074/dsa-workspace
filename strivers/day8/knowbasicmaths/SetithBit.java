package day8.knowbasicmaths;

import java.util.Scanner;

public class SetithBit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=sc.nextInt();
        int res=setIthBit(n,i);
        System.out.println(res);
        System.out.println("Binary of n before set of ith bit: "+binaryOf(n));
        System.out.println("Binary of n after set of ith bit:  "+binaryOf(res));
        sc.close();
    }
    public static String binaryOf(int n){
        String temp="";
        while(n>0){
            int rem=n%2;
            temp=rem+temp;
            n/=2;
        }
        return temp;
    }
    public static int setIthBit(int n,int i){
        return (n | (1<<(i-1)));
    }
}
