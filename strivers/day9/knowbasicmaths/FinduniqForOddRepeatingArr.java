package day9.knowbasicmaths;

import java.util.Scanner;

public class FinduniqForOddRepeatingArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int res=findUniq(n,arr);
        System.out.println(res);
        sc.close();
    }    
    public static int findUniq(int n,int arr[]){
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=binary(arr[i]);
        }
        return sum%3;//=> %3 if the numbers or repeating three times
    }
    public static int binary(int n){
        String temp="";
        while(n>0){
            int rem=n%2;
            temp=rem+temp;
            n/=2;
        }
        return Integer.parseInt(temp);
    }
}
