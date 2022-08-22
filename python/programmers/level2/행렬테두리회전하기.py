def solution(rows, columns, queries):
    answer = []
    grid = []
    counter = 1
    min = 0

    for r in range(rows):
      row = []
      for c in range(columns):
        row.append(counter)
        counter += 1
      grid.append(row)
     
    for q in queries:
      grid, min = rotate(grid, q)
      answer.append(min)

    return answer

def printgrid(grid):
  for row in grid:
    print(row)

def rotate(grid, query):
  x1 = query[0]-1 
  y1 = query[1]-1 
  x2 = query[2]-1 
  y2 = query[3]-1 

  temp = grid[x1][y1]

  for i in range(x1,x2):
    grid[i][y1] = grid[i+1][y1]
  for i in range(y1,y2):
    grid[x2][i] = grid[x2][i+1]
  for i in range(x2,x1,-1):
    grid[i][y2] = grid[i-1][y2]
  for i in range(y2,y1,-1):
    grid[x1][i] = grid[x1][i-1]
  grid[x1][y1+1] = temp

  min = getmin(grid, x1,y1,x2,y2)
  return grid, min

def getmin(grid, x1,y1,x2,y2):
  li = []
  for i in range(x1,x2+1):
    for j in range(y1,y2+1):
      if (i == x1 or i == x2) or (j == y1 or j == y2) :
        li.append(grid[i][j])
  return min(li)
      