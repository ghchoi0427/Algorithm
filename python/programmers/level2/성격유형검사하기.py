def solution(survey, choices):
    answer = ''
    element = ['R','T','C','F','J','M','A','N']
    score = [0]*8
    
    for i in range(len(survey)):
        if choices[i] > 4:
            score[element.index(survey[i][1])] += choices[i] - 4
        elif choices[i] < 4:
            score[element.index(survey[i][0])] += 4 - choices[i]
    
    for i in range(4):
        if score[2*i] == score[2*i+1]:
            answer += min(element[2*i], element[2*i + 1])
            continue
        temp =  element[2*i] if score[2*i] > score[2*i + 1] else element[2*i + 1]
        answer += temp
    
    return answer