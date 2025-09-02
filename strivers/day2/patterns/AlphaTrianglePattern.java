package day2.patterns;

import java.util.Scanner;

public class AlphaTrianglePattern {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++){
            for(char ch=(char)(int)('A'+n-i);ch<(char)(int)('A'+n);ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
