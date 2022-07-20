input()
money = list(map(int, input().split()))
goal = int(input())

start,end = 0, max(money)

while(start <= end):
  limit = (start + end)//2
  sum = 0
  for i in money:
    if i >= limit:
      sum += limit
    else:
      sum += i
  if sum <= goal:
    start = limit + 1
  elif sum > goal:
    end = limit - 1
print(end)


