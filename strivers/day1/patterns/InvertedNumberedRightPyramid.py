n=int(input())
for i in range(n,0,-1):
    count=1
    pat=""
    for j in range(i):
        pat=pat+str(count)+" "
        count+=1
    print(pat)