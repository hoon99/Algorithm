def solution(k, m, score):
    answer = 0
    
    score.sort()
    new_score = score[len(score)%m:]
    
    for i in range(len(new_score)//m):
        answer += m*new_score[m*i]
    
    return answer