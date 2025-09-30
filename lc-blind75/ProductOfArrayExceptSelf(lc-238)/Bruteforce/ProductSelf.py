def productExceptSelf(nums):
    n=len(nums)
    res=[]
    for i in range(n):
        pro=1
        for j in range(n):
            if i==j:
                continue
            pro*=nums[j]
        res.append(pro)
    return res

n=int(input())
nums=list(map(int,input().split()))
res=productExceptSelf(nums)
print(res)