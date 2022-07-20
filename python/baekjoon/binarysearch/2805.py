n,m = map(int, input().split())
trees = list(map(int, input().split()))

start, end = 0, max(trees)

def bs(trees, m, start, end):
  while(start <= end):
    h = (start+end)//2
    share = 0
    for tree in trees:
      if(tree >= h):
        share += (tree - h)
    if share == m:
      return h
      break
    if share < m:
      end = h -1
    elif share > m:
      start = h + 1
  return end

print(bs(trees, m, start, end))