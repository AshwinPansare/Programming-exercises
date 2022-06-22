import java.util.*;

class BFS
{

  static LinkedList<Integer> adj[];
  static int v;
  BFS(int v)
  {
    this.v=v;
    adj = new LinkedList[v];
    for(int i=0;i<v;i++)
    adj[i]=new LinkedList<Integer>();
  }
  static void addEdge(int v1, int v2)
  {
    adj[v1].add(v2);
  }
  static void bfs(int s, int e)
  {
    boolean visited[] = new boolean[v];
    int pre[] = new int[v];
    for(int i=0;i<v;i++)pre[i]=-1;
    LinkedList<Integer> q = new LinkedList();
    visited[s]=true;
    q.add(s);
    while(q.size()!=0)
    {
      s = q.poll();
      for(int i=0;i<adj[s].size();i++)
      {
        int a = adj[s].get(i);
        if(!visited[a])
        q.add(a);
        visited[a]=true;
        pre[a]=s;
        if(a==e)
        {
          LinkedList<Integer> path = new LinkedList<Integer>();
          int vx = e;
          path.add(vx);
          while (pre[vx] != -1) {
              path.add(pre[vx]);
              vx = pre[vx];
          }
          System.out.println("Shortest path length is: " + path.size()-1);

          System.out.println("Path is ::");
          for (int j = path.size() - 1; j >= 0; j--) {
              System.out.print(path.get(j) + " ");
          }
          return;
        }
      }

    }
  }
  public static void main(String args[])
  {
    BFS g = new BFS(8);
    g.addEdge(0, 1);
    g.addEdge(0, 3);
    g.addEdge(1, 2);
    g.addEdge(3, 4);
    g.addEdge(3, 7);
    g.addEdge(4, 5);
    g.addEdge(4, 6);
    g.addEdge(4, 7);
    g.addEdge(5, 6);
    g.addEdge(6, 7);
    g.bfs(0,7);
  }
}
