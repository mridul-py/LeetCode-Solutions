names = ["Mary","John","Emma"]
heights = [180,165,170]
d={}
for i,v in enumerate(names):
    d[heights[i]]=v
print(d)
heights.sort(reverse=True)
print(heights)
for i in heights:
    print(d[i])