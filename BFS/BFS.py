import collections
def bfs(graph, root):

    visited, queue = set(), collections.deque([root])
    visited.add(root)

    while queue:
        vertex = queue.popleft()
        print(str(vertex) + " ", end="")
        # If not visited, mark it as visited, and enqueue it
        for neighbour in graph[vertex]:
            if neighbour not in visited:
                visited.add(neighbour)
                queue.append(neighbour)

# graph = {0: [1, 2], 1: [2], 2: [3], 3: [1, 2]}
graph= dict();
print("Number of nodes: ",end=" ")
vertices =int(input())

for i in range(vertices):
    print("connected nodes with ",i," node: ",end=" ")
    keep=input()
    keep=keep.split()
    keep=[int(x) for x in keep]
    graph[i]=keep
    
print("Following is Breadth First Traversal: ",end=" ")
bfs(graph, 0)