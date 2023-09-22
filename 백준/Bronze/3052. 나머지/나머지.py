s = set()

for i in range(10):
  n = int(input())
  r = n % 42
  s.add(r)

print(len(s))