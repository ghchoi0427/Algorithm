m,n = map(int, input().split())
s = [input() for _ in range(m)]
target = [input() for _ in range(n)]
result = 0
for t in target:
  if t in s:
    result += 1

print(result)