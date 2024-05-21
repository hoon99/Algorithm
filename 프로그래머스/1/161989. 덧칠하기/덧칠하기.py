def solution(n, m, section):
    count = 1
    left = section[0]
    
    for i in section[:]:
        if i >= left + m:
            left = i
            count += 1
        
    return count