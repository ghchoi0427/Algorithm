from collections import deque

def solution(progresses, speeds):
    dq = deque(progresses)
    spdq = deque(speeds)
    answer = []
    
    while(dq):
        count = 0
        for i in range(len(spdq)):
            dq[i] += spdq[i]
        while(dq[0]>=100):
            count+=1
            dq.popleft()
            spdq.popleft()
            if(not dq):
              break;
        if(count != 0):
          answer.append(count)
            
    return answer