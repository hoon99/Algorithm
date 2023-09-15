N, X = map(int, input().split())
numbers = list(map(int, input().split()))
Ans = []

for i in range(N):
  if numbers[i]<X:
    Ans.append(numbers[i])

print(*Ans)