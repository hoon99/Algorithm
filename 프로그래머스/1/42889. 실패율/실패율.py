def solution(N, stages):
    users = [0] * (N+2)
    rate = [0] * (N+1)
    
    for i in stages:
        users[i] += 1
    
    count = users[N+1]
    
    for i in range(N, 0, -1): 
        if users[i] + count == 0:
            rate[i] = 0
        else :
            rate[i] = users[i] / (users[i] + count)
            count += users[i]
    
    rate = rate[1:]
    sorted_rate = rate[:]
    sorted_rate.sort(reverse=True)
    
    answer = [0] * N
    
    for i in range(N):
        for j in range(N):
            if sorted_rate[i] == rate[j] and j+1 not in answer:
                answer[i] = j+1
                break
                
    return answer