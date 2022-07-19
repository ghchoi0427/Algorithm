k,n = map(int, input().split())
arr = [int(input()) for _ in range(k)]

arr.sort()

start = 1
end = arr[-1]

while(start <= end):
  mid = (start + end)//2
  cnt = 0
  for i in range(k):
    cnt += arr[i] // mid
  if cnt >= n:
    start = mid + 1
  else:
    end = mid -1
print(end)
