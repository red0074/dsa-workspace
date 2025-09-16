package day10.knowbasicmaths;

import java.util.*;

public class CountOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(countOpt(n));
        sc.close();
    }
    //bruteforce--> tc: O(log 10 (N))     sc: O(1)
    public static int count(int n){
        int cnt=0;
        while(n>0){
            cnt++;
            n/=10;
        }
        return cnt;
    }
    //optimal--> tc: O(1) sc:O(1)
    public static int countOpt(int n){
        return (int) (Math.log10(n)+1);
    }
}
