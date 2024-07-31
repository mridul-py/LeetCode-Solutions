def Binary(b):
    l=0
    r=len(start)-1
    c=-1
    while l<=r:
        mid=(l+r)//2
        if(start[mid][0]>=b[1]):
            c=start[mid][1]
            r=mid-1
        else:
            l=mid+1
    return c
intervals = [[4,4]]
start= []
end=[]
a=0
# Since the intervals innvolve lets seperate it first
for i in intervals:
    start.append([i[0],a])
    a+=1
start.sort()
print(start)
L=[]
for i in intervals:
    L.append(Binary(i))
    print(L)
