def solution(food):
    
    answer =  '0'
    
    for i in range(len(food)-1, 0, -1):
        answer = (food[i]//2)*str(i) + answer + (food[i]//2)*str(i)
    
    return answer