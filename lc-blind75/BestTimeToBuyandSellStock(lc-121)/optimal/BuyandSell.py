def maxProfit(prices):
    n=len(prices)
    l,r=0,1
    maxp=0
    while r<n:
        if prices[l]<prices[r]:
            profit=prices[r]-prices[l]
            maxp=max(profit,maxp)
        else:
            l=r
        r+=1
    return maxp

n=int(input())
prices=list(map(int,input().split()))
print(maxProfit(prices))