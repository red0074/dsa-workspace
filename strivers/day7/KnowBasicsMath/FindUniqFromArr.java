package day7.KnowBasicsMath;

import java.util.Scanner;

public class FindUniqFromArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        int uniq=uniqEle(arr,n);
        System.out.println(uniq);
    }
    public static int uniqEle(int arr[],int n){
        int u=0;
        for(int i=0;i<n;i++){
            u^=arr[i];
        }
        return u;
    }
}
