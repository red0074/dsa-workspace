def twoSum(nums,target):
    res=[]
    n=len(nums)
    for i in range(n):
        for j in range(i+1,n):
            if nums[i]+nums[j] ==target:
                res.append(i)
                res.append(j)

    return res

n=int(input())
nums=list(map(int,input().split()))
target=int(input())
print(twoSum(nums,target))