import java.util.*;
public class Solution {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int [n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int res[]=twoSum(nums,target);
        for(int i=0;i<2;i++){
            System.out.println(res[i]);
        }
        sc.close();
    }
    public static int[] twoSum(int nums[],int target){
        int n=nums.length;
        int res[]=new int [2];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    res[0]=i;
                    res[1]=j;
                }
            }
        }
        return res;
    }
}
