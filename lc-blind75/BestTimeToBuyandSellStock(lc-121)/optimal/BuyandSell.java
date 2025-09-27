//tc: O(n) sc: O(n)
import java.util.*;
public class BuyandSell {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int prices[]=new int [n];
        for(int i=0;i<n;i++){
            prices[i]=sc.nextInt();
        }
        System.out.println(maxProfit(prices));
        sc.close();
    }
    public static int maxProfit(int prices[]){
        int n=prices.length;
        int l=0;
        int r=1;
        int maxp=0;
        while(r<n){
            if(prices[l]<prices[r]){
                int profit=prices[r]-prices[l];
                maxp=Math.max(maxp,profit);
            }else{
                l=r;
            }
            r++;
        }
        return maxp;
    }
}
