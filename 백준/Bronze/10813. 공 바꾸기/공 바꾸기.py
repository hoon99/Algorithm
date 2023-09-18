N, M = map(int, input().split())
a = [i for i in range(1, N+1)]

for i in range(M):
  x, y = map(int, input().split())
  a[x-1], a[y-1] = a[y-1], a[x-1]
  
print(*a)
