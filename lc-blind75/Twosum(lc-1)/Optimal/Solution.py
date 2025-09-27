def twoSum(nums,target):
    map={}
    for i in range(len(nums)):
        if target-nums[i] in map:
            return [map[target-nums[i]],i]
        map[nums[i]]=i

n=int(input())
nums=list(map(int,input().split()))
target=int(input())
print(twoSum(nums,target))