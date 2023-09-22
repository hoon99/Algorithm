s = set(range(1,31))

for i in range(28):
  n = int(input())
  s.remove(n)

li = list(s)
print(min(li))
print(max(li))
