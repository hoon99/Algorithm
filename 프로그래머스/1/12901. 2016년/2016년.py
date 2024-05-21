def solution(a, b):
    last_day = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
    yoil = ['THU', 'FRI', 'SAT', 'SUN', 'MON', 'TUE', 'WED']
    
    return yoil[(sum(last_day[:a-1]) + b) % 7]
