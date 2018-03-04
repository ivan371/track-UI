n = int(input())
arr = []
for i in range(n):
	arr.append(int(input()))
for i in range(n):
	if arr[i] % 6 == 0:
		print(arr[i]), 
