package day10.knowbasicmaths;

import java.util.Scanner;

public class ExtractionDigits{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        extract(n);
        sc.close();
    }
    public static void extract(int n){
        while(n>0){
            int last=n%10;
            n/=10;
            System.out.println(last);
        }
    }
}