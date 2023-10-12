word = input()
letters = {}

for a in word:
  if a.lower() not in letters.keys():
    letters[a.lower()] = 1
  else: letters[a.lower()] += 1

val = list(letters.values())

if val.count(max(val)) > 1:
  print("?")
else:
  for k in letters.keys():
    if letters[k] == max(val):
      print(k.upper())