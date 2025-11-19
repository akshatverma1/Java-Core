import java.util.*;
class connected_componets{
    public static class Edges{
        int source;
        int Destition;
        int weight;

        Edges(int s,int d,int w){
            this.source = s;
            this.Destition = d;
            this.weight = w;
        }
    }
    public static void bfs_util(ArrayList<Edges> graph[],boolean visited[]){
        Queue <Integer> q = new LinkedList<>();
        q.add(0);
        while(!q.isEmpty()){
            int current = q.remove();
            
            if(visited[current]==false){
                System.out.println(current);
                visited[current] = true;
                for(int i = 0;i<graph[current].size();i++){
                    Edges e = graph[current].get(i);
                    q.add(e.Destition);
                }
            }
        }
    }
    public static void bfs(ArrayList<Edges> graph[]){
        boolean visited[] = new boolean[graph.length];
        for(int i = 0;i<graph.length;i++){
            if(visited[i]==false){
                bfs_util(graph,visited);
            }
        }
    }

    public static void dfs_util(ArrayList<Edges> graph[],int current,boolean visited[]){
        System.out.println(current);
        visited[current] = true;
        for(int i=0;i<graph[current].size();i++){
            Edges e = graph[current].get(i);
            if(visited[e.Destition] == false){
                dfs_util(graph, e.Destition, visited);
            }
        }
    }
    public static void dfs(ArrayList<Edges> graph[],int current){
        boolean visited[] = new boolean[graph.length];
        for(int i =0 ;i<graph.length;i++){
            if(visited[i]==false){
                dfs_util(graph, current, visited);
            }
        }
    }
    public static void creating_graph(ArrayList<Edges> graph[]){
        for(int i = 0;i<graph.length;i++){
            graph[i]= new ArrayList<>();
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
    public static void main(String arr[]){
        int v=7;
        ArrayList <Edges> Graph [] = new ArrayList[v];
        creating_graph(Graph);
        // bfs(Graph);
        dfs(Graph, 0);
    }
}