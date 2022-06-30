t = (int(input())+1)*3600
result = 0

for i in range(0,t):
  h = i // 3600
  m = (i % 3600) // 60
  s = i % 60
  if('3' in (str(h)+str(m)+str(s))):
    result += 1

print(result)