height = [1,8,6,2,5,4,8,3,7]
i = 0
j = len(height) - 1
max = height[i]
min = height[j]
for k in range(1, len(height) - 1):
    if (height[k] > max):
        max = height[k]
for k in range(len(height)-2,-1):
    if (height[k] < min):
        min = height[k]
