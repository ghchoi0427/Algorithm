input()
li = list(map(int, input().split()))
li.sort()
input()
target = list(map(int, input().split()))

def search(arr, target, start, end):
  while(start <= end):
    mid = (start+end)//2
    if(arr[mid] == target):
      return 1
    elif arr[mid] > target:
      end = mid-1
    elif arr[mid] < target:
      start = mid + 1
  return 0

for i in target:
  print(search(li, i, 0, len(li)-1))