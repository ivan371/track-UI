# simple recurstion problem:)
def num_sum(num, sum):
	if num / 10 == 0:
		print(sum + num % 10)
	else:
		num_sum(num / 10, sum + num % 10)

n = int(input())
num_sum(n, 0)
