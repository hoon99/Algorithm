def solution(nums):
    count = 0
    
    for i in range(len(nums)):
        for j in range(i+1, len(nums)):
            for k in range(j+1, len(nums)):
                if isPrime(nums[i]+nums[j]+nums[k]):
                    count += 1
    return count

def isPrime(num):
    for i in range(2, int(num**0.5)+1):
        if num % i == 0:
            return False
    return True