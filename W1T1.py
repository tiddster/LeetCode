import sys


def inputData():
    n = int(input())

    numsList = []

    for i in range(n):
        nums = [int(s) for s in input().split()]
        numsList.append(nums)

    return n, numsList

def getMin(n, numsList):
    diff = sys.maxsize

    idx = [0 for _ in range(n)]

    while outOfRange(numsList, idx):
        tempList = [nums[i] for i, nums in zip(idx, numsList)]

        low = min(tempList)
        high = max(tempList)

        lowIndex = tempList.index(min(tempList))

        if diff > high - low:
            pair = (low, high)
            diff = high - low

        idx[lowIndex] += 1
    return pair

def outOfRange(numsList, idx):
    for i, nums in zip(idx, numsList):
        if i >= len(nums):
            return False
    return True


n, numsList = inputData()
pair = getMin(n, numsList)
print(pair[0], pair[1])

