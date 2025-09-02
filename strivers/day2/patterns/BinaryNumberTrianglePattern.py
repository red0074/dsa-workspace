n=int(input())
for i in range(1,n+1):
    c=1
    pat=""
    if i%2==0:
        c=0
    for j in range(i):
        pat+=str(c)+" "
        if c==1:
            c-=1
        else:
            c+=1
    print(pat)