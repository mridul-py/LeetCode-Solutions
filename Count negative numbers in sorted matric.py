grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
c=0
for i in grid:
    l=0
    r=len(i)-1
    while l<r:
        mid=(l+r)//2
        if(i[mid]>0):
            l=mid+1
        else:
            r=mid
    c+=len(i)-l
print(c)