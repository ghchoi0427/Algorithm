from collections import deque

n,m = map(int, input().split())
value = [[1]*m for _ in range(n)]
graph = [list(map(int,' '.join(input().split()))) for _ in range(n)]
visit = [[False]*m for i in range(n)]
result = 0
dx = [-1,0,1,0]
dy = [0,1,0,-1]
q = deque([(0,0)])

while q:
  x,y = q.popleft()
  for i in range(4):
    nx, ny = x+dx[i], y+dy[i]
    if(0 <= nx < n and 0 <= ny < m):
      if(graph[nx][ny] == 1 and not visit[nx][ny]):
        value[nx][ny] = value[x][y] +1
        visit[nx][ny] = True
        q.append((nx,ny))

print(value[n-1][m-1])