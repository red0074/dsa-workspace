n=int(input())
c=1
for i in range(1,n+1):
    pat=""
    for j in range(i):
        pat+=str(c)+" "
        c+=1
    print(pat)