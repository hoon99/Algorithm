def solution(citations):
    citations.sort(reverse=True)
    
    for i in range(citations[0], -1, -1):
        cnt = 0
        for j in citations:
            if j >= i:
                cnt += 1
        if cnt >= i:
            return i