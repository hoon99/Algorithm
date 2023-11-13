n = int(input())
cnt = n

for i in range(n):
  word = input()
  apb = set(word)
  for j in range(len(word)):
    if word[j] not in apb:
      cnt -= 1
      break
    elif j > 0 and word[j-1] != word[j]:
      apb.remove(word[j-1])
    
print(cnt)