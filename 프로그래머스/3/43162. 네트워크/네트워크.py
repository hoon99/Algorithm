def dfs(v, n, graph, visited):
        if visited[v]:
            return False
        else:
            visited[v] = True
            for i in range(n):
                if i!=v and graph[v][i]==1:
                    dfs(i, n, graph, visited)
            return True;

def solution(n, computers):
    visited = [False]*n
    answer = 0
    
    for i in range(n):
        if(dfs(i, n, computers, visited)):
            answer += 1
    
    return answer