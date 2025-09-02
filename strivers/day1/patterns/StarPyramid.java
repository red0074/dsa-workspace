package day1.patterns;

import java.util.Scanner;

public class StarPyramid {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int count=(i*2)-1;
            for(int k=0;k<n-i;k++){
                System.out.print("  ");
            }
            for(int j=0;j<count;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
