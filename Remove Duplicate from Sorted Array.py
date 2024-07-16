def removeDuplicates(arr):
    tail=0
    if len(arr) == 0:
        return 0
    slow = 0
    for fast in range(1, len(arr)):
        if arr[slow] != arr[fast]:
            slow += 1
            arr[slow] = arr[fast]
            tail += 1
    return tail+1


nums = [0, 0, 1, 1, 1, 2, 2, 3, 3, 4]
print(removeDuplicates(nums))
