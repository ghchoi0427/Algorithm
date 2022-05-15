def solution(n):
    st = ""
    answer = 0

    while(n>0):
        st += str(n%3)
        n = (int)(n/3)
    
    for i in reversed(range(len(st))):
      answer += (pow(3,len(st)-i-1) * (int)(st[i]))

    return answer