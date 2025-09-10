package day7.KnowBasicsMath;

import java.util.Scanner;

public class EvenOrOdd{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        if(isEven(n)){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
    public static boolean isEven(int n){
        return (n&1)==0;
    }
}