nums = [3,2,2,3]
val =3
L = []
C = 0
for i in nums:
    if (i != val):
        L.append(i)
    else:
        continue
print(L)