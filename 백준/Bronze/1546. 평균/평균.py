N = int(input())
arr = list(map(int,input().split()))
M = max(arr)

mean = sum(arr)/len(arr)/M*100
print(mean)