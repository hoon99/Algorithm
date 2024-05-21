def solution(n, arr1, arr2):
    answer = ["" for i in range(n)]
    
    for i in range(n):
        for j in range(n):
            if decode(arr1[i], n)[j] == '0' and decode(arr2[i], n)[j] == '0':
                answer[i] = answer[i] + ' '
            else:
                answer[i] = answer[i] + '#'
    
    return answer

def decode(decimal, n):
    result = ""
    for i in range(n):
        if(decimal > 0):
            result = str(decimal % 2) + result
            decimal = decimal // 2
        else:
            result = '0' + result
    return result
            
    