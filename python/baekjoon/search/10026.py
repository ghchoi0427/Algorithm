from collections import deque

num = int(input())
map = [input() for _ in range(n)]
visit = [[False] * n for _ in range(num)]

dir = [(1,0),(-1,0),(0,1),(0,-1)]
q = deque()
rgb = ['R','G','B']
rg = ['RG','B']


def bfs(map, visit, start,q, color):
  q.append(start)
  visit[start[0]][start[1]] = True

  while(q):
    n = q.popleft()
    for d in dir:
      x,y = n
      dx,dy = d[0],d[1]
      nx,ny = x+dx,y+dy
      if (0 <= nx < num) and (0 <= ny < num):
        if not visit[nx][ny] and map[nx][ny] in color:
          q.append((nx,ny))
          visit[nx][ny] = True

results = []
result = 0

for color in rgb:
  visit = [[False] * n for _ in range(num)]
  for i in range(num):
    for j in range(num):
      if(not visit[i][j] and map[i][j] == color):
        result += 1
        bfs(map, visit, (i,j),q, color)

results.append(result)
result = 0

for color in rg:
  visit = [[False] * n for _ in range(num)]
  for i in range(num):
    for j in range(num):
      if(not visit[i][j] and map[i][j] in color):
        result += 1
        bfs(map, visit, (i,j),q, color)
results.append(result)

for i in results:
  print(i,end=' ')