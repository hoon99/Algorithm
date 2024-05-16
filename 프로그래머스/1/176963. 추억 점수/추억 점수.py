def solution(name, yearning, photo):
    answer = []
    
    # 반복 => 사진별로 점수 뽑기
    for pt in photo:
        ysum = 0
        count = 0
        
        # 사진별로 그리움 점수가 있는지 확인 => 있으면 그 점수, 없으면 나머지 애들 점수
        for i in pt:
            # 있는 애들 찾아서 점수 부여, 없는애들 수 카운트 => 없는 애 수 * 나머지 점수 합 더해줌
            if i in name:
                ysum += yearning[name.index(i)]\
        
        # 배열에 추가
        answer.append(ysum)
        
    return answer