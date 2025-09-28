# tc:O(n^2) sc:O(1)
def containsDuplicate(nums):
    isDuplicate=False
    n=len(nums)
    for i in range(n):
        for j in range(i+1,n):
            if nums[i]==nums[j]:
                isDuplicate=True
                break
    return isDuplicate

n=int(input())
nums=list(map(int,input().split()))
print(containsDuplicate(nums))