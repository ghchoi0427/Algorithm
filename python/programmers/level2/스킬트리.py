def solution(skill, skill_trees):
    answer = 0
    
    for st in skill_trees:
      legit = True
      for i in range(len(skill)-1,0,-1):
        after = skill[i]
        #print(after)
        #print(st)
        if(after in st):
          idx = st.index(after)
          if(not skill[i-1] in st[:idx]):
            legit = False
      if(legit):
         answer += 1

    
    return answer