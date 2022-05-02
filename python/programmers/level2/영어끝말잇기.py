def solution(n, words):
    answer = [0,0]
    used = [words[0]]
    
    for i in range(1,len(words)):
        if(words[i] in used or words[i][0] != words[i-1][-1]):
            break
        used.append(words[i])

    if(len(used) != len(words)):
        answer[0] = (i % n)+1
        answer[1] = int(i/n) + 1

    return answer