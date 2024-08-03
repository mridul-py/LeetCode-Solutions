s = "abcabcbb"
mx = 0
k = ""
i = 0

while i < len(s):
    if s[i] not in k:
        k += s[i]
        mx = max(mx, len(k))
    else:
        print(k)
        # remove characters from the beginning until s[i] is not in k
        k = k[k.index(s[i]) + 1:] + s[i]
    i += 1

print(mx)
