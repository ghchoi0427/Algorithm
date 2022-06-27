n,m,k = map(int, input().split())
li = list(map(int, input().split()))
result = 0

li.sort()
maxnum = li[-1]
secondmax = li[-2]

while(True):
  for i in range(k):
    result += maxnum
    m -= 1
    if(m<=0):
      break
  if(m<=0):
    break
  result += secondmax
  m -= 1
  if(m<=0):
    break
  
print(result)