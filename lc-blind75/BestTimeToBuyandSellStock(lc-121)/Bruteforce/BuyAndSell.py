def findProfit(prices):
    n=len(prices)
    ls=[]
    for i in range(n):
        for j in range(i+1,n):
            if prices[i]<prices[j]:
                ls.append(prices[j]-prices[i])
    maxi=0
    for k in range(len(ls)):
        if maxi<ls[k]:
            maxi=ls[k]
    return maxi

n=int(input())
prices=list(map(int,input().split()))
print(findProfit(prices))