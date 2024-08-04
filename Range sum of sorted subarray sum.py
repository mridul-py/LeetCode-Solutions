nums = [1,2,3,4]
n = 4
left = 1
right = 5
L=[]
for window in range(1,n):
    Sum=0
    i=0
    j=0
    while(j<n):
        Sum=Sum+nums[j]
        print(Sum)
        if(j-i+1==window):
            L.append(Sum)
            Sum-=nums[i]
            j=j+1
            i=i+1
        elif(j-i+1<window):
            j=j+1
print(L)
L.append(sum(nums))
print(L)
S=0
modulus = 10**9 + 7
for i in range(left,right+1):
    S+=L[i-1]
print(S%modulus)