matrix = [[3, 7, 8], [9, 11, 13], [15, 16, 17]]
L = []
A = []
c = 0
# find min in row and max in column store those in list for each column and row
for i in matrix:
    a = min(i)
    c += 1
    L.append(a)
d = len(matrix[0])
for i in range(d):
    b = matrix[0][i]
    for j in range(c):
        if matrix[j][i] > b:
            b = matrix[j][i]
    A.append(b)
print(L)
print(A)
for i in L:
    if (i in A):
        print(i)
