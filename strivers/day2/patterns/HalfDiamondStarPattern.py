n=int(input())
for i in range(1,n+1):
    pat=""
    for j in range(i):
        pat+="* "
    print(pat)
for i in range(n-1,0,-1):
    pat=""
    for j in range(i):
        pat+="* "
    print(pat)