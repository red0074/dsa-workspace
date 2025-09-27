//tc: O(n^2) required O(n) or O(nlogn) so tle 
import java.util.*;
public class BuyAndSell {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int prices[]=new int[n];
        for(int i=0;i<n;i++){
            prices[i]=sc.nextInt();
        }
        int maxProfit=findProfit(prices);
        System.out.println(maxProfit);
        sc.close();
    }
    public static int findProfit(int prices[]){
        int n=prices.length;
        List<Integer> ls=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(prices[i]<prices[j]){
                    ls.add(prices[j]-prices[i]);
                }
            }
        }
        int maxi=0;
        for(int i=0;i<ls.size();i++){
            if(maxi<ls.get(i)){
                maxi=ls.get(i);
            }
        }
        return maxi;
    }
}
