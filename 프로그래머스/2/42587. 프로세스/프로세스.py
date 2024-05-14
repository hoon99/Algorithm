from collections import deque

def solution(priorities, location):
    
    sequence = deque([i for i in range(len(priorities))])
    queue = deque(priorities)
    result = []
    
    while queue:
        process = queue.popleft()
        for i in queue:
            if i > process:
                queue.append(process)
                sequence.append(sequence.popleft())
                break
        else:
            result.append(sequence.popleft())
        
    return result.index(location) + 1