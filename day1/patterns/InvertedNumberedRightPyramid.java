package day1.patterns;

import java.util.Scanner;

public class InvertedNumberedRightPyramid {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>0;i--){
            int count=1;
            for(int j=0;j<i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
        sc.close();
    }
}
