package day2.patterns;

import java.util.Scanner;

public class IncreasingNumberTrianglePattern {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int c=1;
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        } 
    }
}
