sum = 0
alphabet = ['ABC', 'DEF', 'GHI', 'JKL', 'MNO', 'PQRS', 'TUV', 'WXYZ']
word = input()

for a in word:
  for i in range(8):
    if a in alphabet[i]:
      sum += i+3

print(sum)