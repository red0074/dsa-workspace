n=int(input())
for i in range(n,0,-1):
    pat=""
    for ch in range(ord('A'),ord('A')+i):
        pat+=chr(ch)+" "
    print(pat)
