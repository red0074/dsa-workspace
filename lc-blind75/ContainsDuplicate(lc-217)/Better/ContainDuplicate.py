def findDuplicate(nums):
    n=len(nums)
    hset=set()
    for i in range(n):
        if nums[i] in hset:
            return True
        hset.add(nums[i])
    return False

n=int(input())
nums=list(map(int,input().split()))
print(findDuplicate(nums))