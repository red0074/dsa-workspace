import java.util.*;
public class ContainDuplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        sc.close();
        System.out.println(findDuplicate(nums));
    }
    public static boolean findDuplicate(int nums[]){
        Set<Integer> set=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}
