n=int(input())
for i in range(1,n+1):
    pat=""
    for j in range(1,i+1):
        pat+=str(j)+" "
    for k in range(0,2*(n-i)):
        pat+="  "
    for l in range(i,0,-1):
        pat+=str(l)+" "
    print(pat)