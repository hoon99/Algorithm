from collections import deque

def solution(maps):
    
    dx = [-1, 1, 0, 0]
    dy = [0, 0, -1, 1]

    N = len(maps)
    M = len(maps[0])
    
    queue = deque()
    queue.append((0, 0))
    
    
    while queue:
        x, y = queue.popleft()
        
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            
            if 0<=nx<N and 0<=ny<M and maps[nx][ny]==1:
                maps[nx][ny] = maps[x][y] + 1
                queue.append((nx, ny))
            
        if x==N-1 and y==M-1:
            return maps[x][y]
    
    return -1
    
    
    