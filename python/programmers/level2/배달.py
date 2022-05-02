import heapq  # 우선순위 큐 구현을 위함

def solution(N, road, K):
    answer = 0
    graph = dict()
    
    for i in range(N):
      graph[str(i+1)]={}
      roads = dict()
      for r in road:
        if(r[0]==i+1):
          if(str(r[1]) in roads):
            roads[str(r[1])]= min(roads[str(r[1])],r[2])
          else:
            roads[str(r[1])]=r[2]
          graph[str(i+1)]=roads
        if(r[1]==i+1):
          if(str(r[0]) in roads):
            roads[str(r[0])]= min(roads[str(r[0])],r[2])
          else:
            roads[str(r[0])]=r[2]
          graph[str(i+1)]=roads
    print(graph)

    for i in dijkstra(graph, '1').values():
      if i <= K:
        answer += 1

    return answer



def dijkstra(graph, start):
  distances = {node: float('inf') for node in graph} 
  distances[start] = 0  
  queue = []
  heapq.heappush(queue, [distances[start], start]) 

  while queue:  
    current_distance, current_destination = heapq.heappop(queue) 

    if distances[current_destination] < current_distance: 
      continue
    
    for new_destination, new_distance in graph[current_destination].items():
      distance = current_distance + new_distance
      if distance < distances[new_destination]: 
        distances[new_destination] = distance
        heapq.heappush(queue, [distance, new_destination]) 
    
  return distances