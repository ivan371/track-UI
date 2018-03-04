import random
arr = []
for i in range(7):
	arr.append(2 * 2 * random.randint(-1000, 1000))
for i in range(1, 7, 2):
	arr[i] = arr[i] * arr[i - 1]
print(arr)
