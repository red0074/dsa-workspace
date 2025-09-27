import java.util.*;
public class Solution {
    public static void main(String[] args) {
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
        int res[]=new int [2];
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(target-nums[i])){
                res[0]=map.get(target-nums[i]);
                res[1]=i;
            }
            map.put(nums[i],i);
        }
        return res;
    }    
}
