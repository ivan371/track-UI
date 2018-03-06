n = int(input())
arr = []
for i in range(n):
	arr.append(int(input()))
# we need only numbers whish divide by 6
for i in range(n):
	if arr[i] % 6 == 0:
		print(arr[i]), 
