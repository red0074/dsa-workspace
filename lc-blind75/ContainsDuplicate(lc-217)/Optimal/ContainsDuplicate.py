#tc:O(nlogn) sc:O(1)
def findDuplicate(nums):
    n=len(nums)
    isDuplicate=False
    nums.sort()
    for i in range(n-1):
        if nums[i]==nums[i+1]:
            isDuplicate=True
            break
    return isDuplicate

n=int(input())
nums=list(map(int,input().split()))
print(findDuplicate(nums))