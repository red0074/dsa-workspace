package day2.patterns;

import java.util.Scanner;
public class BInaryNumberTrianglePattern {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++){
            int c=1;
            if(i%2==0){
                c=0;
            }
            for(int j=0;j<i;j++){
                System.out.print(c+" ");
                if(c==1){
                    c--;
                }else{
                    c++;
                }
            }
            System.out.println();
        }
    }
}
