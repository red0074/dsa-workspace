//tc:O(n^2) sc:O()
import java.util.*;
public class ProductSelf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int [n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int res[]=produceExceptSelf(nums);
        for(int i=0;i<n;i++){
            System.out.println(res[i]);
        }
        sc.close();
    }
    public static int[] produceExceptSelf(int nums[]){
        int n=nums.length;
        int prod[]=new int[n];
        for(int i=0;i<n;i++){
            int pro=1;
            for(int j=0;j<n;j++){
                if(i==j){
                    continue;
                }
                pro*=nums[j];
            }
            prod[i]=pro;
        }
        return prod;
    }
}
