package day2.patterns;

import java.util.Scanner;

public class AlphaRampPattern {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        char ch='A';
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(ch+" ");
            }
            System.out.println();
            ch+=1;
        }
    }
}
