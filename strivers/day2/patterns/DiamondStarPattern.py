n=int(input())
for i in range(1,n+1):
    space="  "*(n-i+1)
    pat="* "*(2*i-1)
    print(space+pat)
for i in range(n,0,-1):
    space="  "*(n-i+1)
    pat="* "*(2*i-1)
    print(space+pat)