def dfs(visited, graph, node):
    if node not in visited:
        print (node,end=" ")
        visited.add(node)       
        for neighbour in graph[node]:
            dfs(visited, graph, neighbour)
            
#graph = {0: [1, 2], 1: [2], 2: [3], 3: [1, 2]}
graph= dict();
print("Number of nodes: ",end=" ")
vertices =int(input())

for i in range(vertices):
    print("connected nodes with ",i," node: ",end=" ")
    keep=input()
    keep=keep.split()
    keep=[int(x) for x in keep]
    graph[i]=keep
    
visited = set()
dfs(visited, graph, 0)

# two possible solution : i) 0 1 2 3  ii)  0 2 3 1
