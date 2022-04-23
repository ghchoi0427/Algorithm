def solution(n, words):
    answer = [0,0]
    temp = []
    
    for i in range(len(words)):
        if(words[i] in temp):
            answer = [i%n+1,int(i/n)+1]
            break
        if(temp):
              if(temp[-1].strip()[-1] != words[i].strip()[0]):
                answer = [i%n+1,int(i/n)+1]
                break
        temp.append(words[i])
        

    return answer