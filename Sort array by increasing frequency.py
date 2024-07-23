nums = [1,1,2,2,2,3]
L=[]
A={}
B=[]
a = len(nums)
for i in range(1,a+1):
   L.append(nums.count(nums[i-1]))
for i , j in enumerate(L):
   A[nums[i]] = j
nums.sort(key=lambda x: (A[x], -x))
print(nums)