def solution(answers):
    answer = []
    pat = [[1,2,3,4,5],[2,1,2,3,2,4,2,5], [3,3,1,1,2,2,4,4,5,5]]
    scores = [0] * 3
    
    for i in range(len(answers)):
        for j in range(len(pat)):
            if pat[j][i%(len(pat[j]))] == answers[i]:
                scores[j] += 1
    
    for i in range(len(scores)):
        if max(scores) == scores[i]:
            answer.append(i+1)
        
    return answer