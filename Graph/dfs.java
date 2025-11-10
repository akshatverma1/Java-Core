import java.util.*;
public class dfs {
    public static class Edges {
        int source;
        int Destition;
        int weight;

        Edges (int s, int d, int w){
            this.source = s;
            this.Destition = d;
            this.weight = w;
        }
    }
    public static void Creating(ArrayList<Edges> graph[]){
        for (int i =0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        //vertex = 0
        graph[0].add(new Edges(0, 1, 1));
        graph[0].add(new Edges(0, 2, 1));

        //vertex = 1

        graph[1].add(new Edges(1, 0, 1));
        graph[1].add(new Edges(1,3,1));

        //vertex = 2

        graph[2].add(new Edges(2, 0, 1));
        graph[2].add(new Edges(2, 4, 1));

        //vertex = 3 

        graph[3].add(new Edges(3, 1, 1));
        graph[3].add(new Edges(3, 4, 1));
        graph[3].add(new Edges(3, 5, 1));


        //vertex = 4

        graph[4].add(new Edges(4, 2, 1));
        graph[4].add(new Edges(4, 3, 1));
        graph[4].add(new Edges(4, 5, 1));

        //vertex = 5

        graph[5].add(new Edges(5, 3, 1));
        graph[5].add(new Edges(5, 4, 1));
        graph[5].add(new Edges(5, 6, 1));


        //vertex = 6
        graph[6].add(new Edges(6, 5, 1));
    }

    public static void BFS(ArrayList<Edges> graph[]){
        Queue<Integer> q = new LinkedList<>();
        boolean visit[] = new boolean[graph.length];
        q.add(0);

        while(!q.isEmpty()){
            int current = q.remove();
            if(!visit[current]){
                System.out.println(current);
                visit[current] = true;
                for(int i = 0;i<graph[current].size();i++){
                    Edges e = graph[current].get(i); 
                    q.add(e.Destition);
                }
            }
        }
    }

    public static void DFS(ArrayList<Edges> graph[], boolean visted[],int current){
        System.out.print(current+" ");
        visted[current] = true;
        for(int i=0;i<graph[current].size();i++){
            Edges e = graph[current].get(i);
            if(visted[e.Destition]==false){
                DFS(graph, visted, e.Destition);
            }
        }
    }
    public static void main(String arr[]){
        int V=7;
        ArrayList<Edges> graph[] = new ArrayList[V];
        Creating(graph);
        DFS(graph,new boolean[V] , 0);
    }
}
