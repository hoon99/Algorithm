def solution(k, score):
    record = []
    answer = []
    lowest = 0
    
    for i in score:
        if len(record) < k:
            record.append(i)
            lowest = min(record)

        elif i > lowest:
            record.remove(lowest)
            record.append(i)
            lowest = min(record)
            
        answer.append(lowest)
    
    return answer