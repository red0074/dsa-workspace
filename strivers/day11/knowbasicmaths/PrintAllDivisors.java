package day11.knowbasicmaths;

import java.util.Scanner;

public class PrintAllDivisors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        divisors(n);
        sc.close();
    }
    // brute force tc:O(n) sc: O(n)
    public static void divisors(int n){
        int arr[]=new int [n];
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                arr[count]=i;
                count++;
            }
        }
        printAll(arr, count);
    }    
    public static void printAll(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
