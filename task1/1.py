print("input size of array>")
n = int(input())
arr = []
print("input array>")
for i in range(n):
	arr.append(int(input()))
# we need only numbers whish divide by 6
for i in range(n):
	if arr[i] % 6 == 0:
		print(arr[i]), 
