n,m,k = map(int, input().split())
d = [0 * i for i in range(n)]
li = list(map(int, input().split()))
for i in range(len(li)):
  d[i]=li[i]
result = 0

d.sort()
maxnum = d[-1]
secondmax = d[-2]

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