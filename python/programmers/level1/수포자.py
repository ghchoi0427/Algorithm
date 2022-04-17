from collections import deque

def solution(answers):
    answer = []
    
    a = deque([1,2,3,4,5])
    b = deque([2,1,2,3,2,4,2,5])
    c = deque([3,3,1,1,2,2,4,4,5,5])
    
    scores = [0,0,0]
    
    for i in range(len(answers)):
        if(answers[i] == a[0]):
            scores[0] +=1
        if(answers[i] == b[0]):
            scores[1] +=1
        if(answers[i] == c[0]):
            scores[2] +=1
        
        a.rotate(-1)
        b.rotate(-1)
        c.rotate(-1)
    
    max_ = max(scores)
    if(scores[0] == max_):
        answer.append(1)
    if(scores[1] == max_):
        answer.append(2)
    if(scores[2] == max_):
        answer.append(3)
    
    
    return answer