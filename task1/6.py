import re

print("input the innitial string")
pal = str(input())
# is equal to reverse string
pal = re.sub(r'\W', '', pal).lower()
if pal == pal[::-1]:
	print("palindrome")
else:
	print("not palindrome")
