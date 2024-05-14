from collections import deque

def comparator(s1, s2):
    diff = 0
    for i in range(len(s1)):
        if(s1[i]!=s2[i]):
            diff += 1
    return diff


def solution(begin, target, words):
    queue = deque()
    queue.append((begin, 0))
    
    while queue:
        temp, count = queue.popleft()
        
        for i in words:
            if(comparator(temp, i) == 1):
                queue.append((i, count+1))
                words.remove(i)
        
        if temp == target:
            return count
        
    return 0


