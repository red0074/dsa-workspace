package day2.patterns;

import java.util.Scanner;

public class ReverseLetterTrianglePattern {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        for(int i=n;i>0;i--){
            for(char ch='A';ch<'A'+i;ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
