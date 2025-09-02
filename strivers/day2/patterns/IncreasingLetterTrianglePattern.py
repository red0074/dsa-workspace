n=int(input())
for i in range(1,n+1):
    pat=""
    for j in range(ord('A'),ord('A')+i):
        pat+=chr(j)+" "
    print(pat)