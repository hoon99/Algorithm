def is_palindrome(word):
  n = len(word)-1
  h = int(len(word)/2)
  for i in range(0, h):
    if word[i] != word[n-i]:
      print(0)
      return
  print(1)

word = input()
is_palindrome(word)