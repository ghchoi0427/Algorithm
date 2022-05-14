def solution(dirs):
    answer = 0
    di = {"U":(0,1), "D":(0,-1),"R":(1,0),"L":(-1,0)}
    result = set()
    x=y=0
    for d in dirs:
      if( -5 <= x+di[d][0] <= 5 and -5 <= y+di[d][1] <= 5):
        result.add((x,y,x+di[d][0],y+di[d][1]))
        result.add((x+di[d][0],y+di[d][1],x,y))
        x += di[d][0]
        y += di[d][1]
    return int(len(result)/2)