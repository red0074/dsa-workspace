package day9.knowbasicmaths;

import java.util.Scanner;

public class PositionofRSB {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(pos(n));
        sc.close();
    }
    public static int pos(int n){
        //bitwise and between n and -n
        if(n==0)
        return 0;
        int rsb=n & (~n+1);//=>isolate the right significant bit 
        int res=0;
        while(rsb>1){//=>shifting the rsb to right ,remove the zeros or simply counting the zeros after 1
            rsb>>=1;
            res++;
        }
        return res+1;
    }   
}
