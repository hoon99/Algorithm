def solution(array, commands):
    
    n = len(commands)
    answer = []
    
    for i in range(n):
        start = commands[i][0] - 1
        end = commands[i][1]
        index = commands[i][2] -1
        temp = array[start:end]
        temp.sort()
        answer.append(temp[index])
    
    return answer