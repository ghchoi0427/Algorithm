n,m = map(int, input().split())
minByRowMax = 0

for i in range(n):
  li = list(map(int, input().split()))
  if(min(li) > minByRowMax):
    minByRowMax =  min(li)

print(minByRowMax)