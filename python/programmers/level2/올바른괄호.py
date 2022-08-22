from collections import deque

def solution(s):
    answer = True
    q = deque()
    
    for i in range(len(s)):
        if s[i] == '(':
            q.appendleft(1)
        elif s[i] == ')':
            if not q:
                return False
            q.popleft()
    if q:
        return False

    return True