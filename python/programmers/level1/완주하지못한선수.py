def solution(participant, completion):
    count = dict()
    
    for p in participant:
        if(p in count.keys()):
            count[p] = count[p]+1
        else:
            count[p] = 1

    for c in completion:
        count[c] -= 1
    
    for k,v in count.items():
     if(v!=0):
      return k