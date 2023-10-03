n = int(input())

for i in range(n):
  R, S = input().split()
  R = int(R)
  for x in S:
    print(x*R, end='')
  print()