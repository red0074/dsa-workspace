//tc:O(n^2) sc:O(1)
import java.util.*;
public class FindDuplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int [n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(duplicate(nums));
        sc.close();
    }
    public static boolean duplicate(int nums[]){
        int n=nums.length;
        boolean isDuplicate=false;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    isDuplicate=true;
                    break;
                }
            }
        }
        return isDuplicate;
    }
}
