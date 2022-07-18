input()
card = list(map(int, input().split()))
input()
target = list(map(int, input().split()))

card.sort()

def bs(card, target, start, end):
  while(start <= end):
    mid = (start + end)//2
    if card[mid] == target:
      return 1
    if card[mid] < target:
      start = mid + 1
    if card[mid] > target:
      end = mid -1
  return 0

for i in target:
  print(bs(card, i, 0, len(card)-1),end=' ')