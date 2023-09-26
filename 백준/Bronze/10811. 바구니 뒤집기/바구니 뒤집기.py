N, M = map(int, input().split())
nums = list(range(1,N+1))

for i in range(M):
  a, b = map(int, input().split())
  nums[a-1:b] = list(reversed(nums[a-1:b]))

print(*nums)