n = int(input())
arr = []

for i in range(n):
  st = input()
  if st not in arr:
    arr.append(st)

c = sorted(arr, key=lambda x : (len(x), x))
for a in c:
  print(a)