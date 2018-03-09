import random
print("This is the array, consists of 7 random numbers:")
arr = []
# we generate ramdom array
for i in range(7):
	arr.append(2 * 2 * random.randint(-1000, 1000))
print(arr),
for i in range(1, 7, 2):
	arr[i] = arr[i] * arr[i - 1]
print("This is array, consists of 7 reformat numvers:")
print(arr)
