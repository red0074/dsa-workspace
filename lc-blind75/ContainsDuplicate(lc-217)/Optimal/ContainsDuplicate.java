//tc:O(nlogn) sc:O(1)
import java.util.*;
public class ContainsDuplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int [n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(findDuplicate(nums));
        sc.close();
    }
    public static boolean findDuplicate(int nums[]){
        int n=nums.length;
        boolean isDuplicate=false;
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                isDuplicate=true;
                break;
            }
        }
        return isDuplicate;
    }
}
