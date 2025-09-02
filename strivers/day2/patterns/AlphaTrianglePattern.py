n=int(input())
for i in range(1,n+1):
    pat=""
    for ch in range((ord('A')+(n-i)),ord('A')+n):
        pat+=chr(ch)+" "
    print(pat)