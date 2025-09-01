n=int(input())
for i in range(n+1):
    space="  "*(n-i+1)
    pat="* "*(2*i-1)
    print(space+pat)