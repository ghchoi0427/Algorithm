def solution(record):
    answer = []
    
    logs = []
    names = dict()
    messages = ["님이 들어왔습니다.","님이 나갔습니다."]
    
    for r in record:
        if(r.split()[0]=="Enter"):
            logs.append(r.split()[1]+":"+messages[0])
            names[r.split()[1]] = r.split()[2]
        if(r.split()[0]=="Leave"):
            logs.append(r.split()[1]+":"+messages[1])
        if(r.split()[0] == "Change"):
            names[r.split()[1]] = r.split()[2]
    
    for l in logs:
        answer.append(l.replace(l.split(":")[0],names[l.split(":")[0]]).replace(":",""))
  
    return answer