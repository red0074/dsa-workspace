n=int(input())
ch=ord('A')
for i in range(1,n+1):
    pat=""
    for j in range(i):
        pat+=chr(ch)+" "
    ch+=1
    print(pat)