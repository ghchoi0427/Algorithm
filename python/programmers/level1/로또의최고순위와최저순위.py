def solution(lottos, win_nums):
    answer = []
    match = 0
    zero = 0
    
    for i in lottos:
        if(i in win_nums):
            match += 1
        if(i == 0):
            zero += 1
            
    answer.append(7-match-zero if 7-match-zero != 7 else 6)
    answer.append(7-match if 7-match != 7 else 6)
    
    
    return answer