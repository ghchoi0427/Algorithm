n,m,k = map(int, input().split())
d = [0 * i for i in range(n)]
li = list(map(int, input().split()))
for i in range(len(li)):
  d[i]=li[i]
secondindex = 0
maxindex = 0
result = 0
for i in range(len(d)):
  if(d[i] == max(d)):
    maxindex = i
    break

secondmax = -1
for i in range(len(d)):
  if(i != maxindex):
    if(secondmax < d[i]):
      secondmax = d[i]
      secondindex = i

count = k

while(True):
  for i in range(k):
    result += d[maxindex]
    m -= 1
    if(m<=0):
      break
  if(m<=0):
    break
  result += d[secondindex]
  m -= 1
  if(m<=0):
    break
  
print(result)