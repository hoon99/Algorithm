def solution(babbling):
    bab = ["aya", "ye", "woo", "ma"]
    
    def checker(word, n):
        if word == "":
            return True
        for i in range(4):
            if word.startswith(bab[i]) and i!=n:
                if checker(word[len(bab[i]):], i):
                    return True
        return False
    
    answer = 0
    
    for word in babbling:
        if(checker(word, 5)):
            answer += 1
    
    return answer
    