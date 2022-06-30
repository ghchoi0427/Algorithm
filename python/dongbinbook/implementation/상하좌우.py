n = int(input())
ins = input().split()
#URDL
man = {'U':2,'R':1,'D':0,'L':3}
dx = [1,0,-1,0]
dy = [0,1,0,-1]
x = y = 1

for i in ins:
  if(0 < x + dx[man[i]] <= n):
    x += dx[man[i]]
  if(0 < y + dy[man[i]] <= n):
    y += dy[man[i]]

print(x,y)