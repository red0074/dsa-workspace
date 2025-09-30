def productExceptSelf(nums):
    n=len(nums)
    res=[]
    pre=1
    for i in range(n):
        res.append(pre)
        pre*=nums[i]
    post=1
    for j in range(n-1,-1,-1):
        res[j]*=post
        post*=nums[j]
    return res


n=int(input())
nums=list(map(int,input().split()))
print(productExceptSelf(nums))