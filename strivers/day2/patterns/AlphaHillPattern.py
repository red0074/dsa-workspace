n=int(input())
ch=ord('A')
for i in range(1,n+1):
    space="  "*(n-i)
    pat=""
    for j in range(i):
        pat+=chr(ch)+" "
        ch+=1
    ch-=1
    for k in range(i-1,0,-1):
        ch-=1
        pat+=chr(ch)+" "
    print(space+pat)