package day2.patterns;

import java.util.Scanner;

public class AlphaHillPattern {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        char ch='A';
        for(int i=1;i<=n;i++){
            for(int k=0;k<n-i+1;k++){
                System.out.print("  ");
            }
            for(int j=0;j<i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            ch--;
            for(int l=i-1;l>0;l--){
                ch--;
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }    
}
