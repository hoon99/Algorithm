def solution(number, limit, power):
    answer = 0
    knights = [countDivisor(i) for i in range(1, number+1)]
    
    for i in range(len(knights)):
        if knights[i] > limit:
            knights[i] = power
        answer += knights[i]
        
    return answer

def countDivisor(num):
    count = 0
    for i in range(1, int(num**0.5)+1):
        if num % i == 0:
            count += 1
            if i**2 != num:
                count += 1
    return count