import java.util.Scanner;

public class ProductSelf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int [n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int res[]=productExceptSelf(nums);
        for(int x:res){
            System.out.println(x);
        }
        sc.close();
    }
    public static int[] productExceptSelf(int nums[]){
        int n=nums.length;
        int res[]=new int [n];
        int pre=1;
        for(int i=0;i<n;i++){
            res[i]=pre;
            pre*=nums[i];
        }
        int post=1;
        for(int j=n-1;j>=0;j--){
            res[j]*=post;
            post*=nums[j];
        }
        return res;
    }
}