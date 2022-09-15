n = int(input())
li = [int(input()) for _ in range(n)]

def hop(start, target):
  if start == target:
    temp.append(1)
    return True
  elif start > target:
    return False
  elif start < target:
    hop(start+1, target)
    hop(start+2, target)
    hop(start+3, target)

for i in range(n):
  temp = []
  hop(0,li[i])
  print(len(temp))
