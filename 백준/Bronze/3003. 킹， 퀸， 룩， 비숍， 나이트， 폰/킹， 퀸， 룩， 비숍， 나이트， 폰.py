a = list(map(int, input().split()))
b = [1, 1, 2, 2, 2, 8]
sub = [b[i]-a[i] for i in range(6)]
print(*sub)