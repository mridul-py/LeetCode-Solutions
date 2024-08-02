details = ["7868190130M7522","5303914400F9211","9273338290F4010"]
L = []
for i in details:
    if ('M' in i):

        L.append(int(i[11:13]))
    else:

        L.append(int(i[11:13]))
C = 0
for i in L:
    if i > 60:
        C += 1
print(L)