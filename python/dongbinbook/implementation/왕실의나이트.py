s = input()
ix = ['-','a','b','c','d','e','f','g','h']
x = (ix.index(s[0]))
y = int(s[1])
dx = [-1,1,2,2,1,-1,-2,-2]
dy = [-2,-2,-1,1,2,2,1,-1]
result = 0

for i in range(8):
  if(0< x+dx[i]<=8 and 0< y+dy[i] <= 8):
    result += 1

print(result)
