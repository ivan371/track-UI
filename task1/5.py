# array and sort order in input 
# sotred array and number of iterations in output
def sort(arr, order):
	it = 0
	for i in range(1, len(arr)):
		for j in range(len(arr) - i):
			if arr[j] > arr[j + 1] and order or arr[j] < arr[j + 1] and not order:
				arr[j + 1], arr[j] = arr[j], arr[j + 1]
				it += 1
	return (arr, it)

# input height and width of matrix
n = int(input())
m = int(input())
it = 0
t_it = 0
# input array elems after enter
arr = [[int(raw_input()) for i in xrange(n)] for j in xrange(m)]
for i in range(m):
	(arr[i], t_it) = sort(arr[i], i % 2)
	it += t_it
print(arr, t_it)		
