word = input()
idx = []

for i in range(97,123):
  a = word.find(chr(i))
  idx.append(a)

print(*idx)