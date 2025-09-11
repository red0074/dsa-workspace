package day8.knowbasicmaths;

import java.util.Scanner;

public class FindithBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        System.out.println("Enter the ith bit (1 = LSB):");
        int i = sc.nextInt();
        int res = iThBit(n, i);
        System.out.println("The " + i + "th bit is: " + res);
        sc.close();
    }

    public static int iThBit(int n, int i) {
        return (n & (1 << (i - 1)))!=0?1:0;
    }
}
