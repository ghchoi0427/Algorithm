def solution(A,B):
  answer = 0

  A.sort(reverse = True)
  B.sort(reverse = True)
  
  ac = bc = 0

  while(bc < len(B) and ac<len(A)):
    if(A[ac] < B[bc]):
      answer += 1
      bc += 1
      ac += 1
    else:
      ac += 1
  return answer