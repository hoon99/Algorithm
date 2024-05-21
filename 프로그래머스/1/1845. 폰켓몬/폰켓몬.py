def solution(nums):
    typeSet = set(nums);
    return min(len(typeSet), len(nums)/2)