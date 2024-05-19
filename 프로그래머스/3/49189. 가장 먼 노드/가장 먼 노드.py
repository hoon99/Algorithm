import heapq

def solution(n, edge):
    
    INF = int(1e9)
    graph = [[] for i in range(n+1)]
    distance = [INF] * (n+1)
    distance[0] = 0
    
    for i in edge:
        graph[i[0]].append((i[1], 1))
        graph[i[1]].append((i[0], 1))
    
    def dijkstra(start):
        q = []
        heapq.heappush(q, (0, start))
        distance[start] = 0
        while q:
            dist, now = heapq.heappop(q)
            if distance[now] < dist:
                continue
            for i in graph[now]:
                cost = dist + i[1]
                if cost < distance[i[0]]:
                    distance[i[0]] = cost
                    heapq.heappush(q, (cost, i[0]))
    
    dijkstra(1)
    
    max_dist = max(distance)
    max_nodes = [i for i in distance if i==max_dist]
    
    return len(max_nodes)