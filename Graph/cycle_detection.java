import java.util.*;
class cycle_detection{

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

    public static void creating_graph(ArrayList<Edges> graph[]){
        for(int i = 0;i<graph.length;i++){
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

    public static void dfs_util(ArrayList<Edges> Graph[],int current,boolean visited[]){
        System.out.println(current);
        visited[current] = true;
        for(int i = 0;i<Graph[current].size();i++){
            Edges e = Graph[current].get(i);
            if(visited[e.Destition] == false){
                dfs_util(Graph, e.Destition, visited);
            }
        }
    }
    public static void dfs(ArrayList<Edges> Graph[],int current){
        boolean visited[] = new boolean[Graph.length];
        for(int i=0;i<Graph.length;i++){
            if(visited[i]==false){
                dfs_util(Graph, current, visited);
            }
        }
    }
    public static void main(String main[]){
        int v=7;
        ArrayList <Edges> Graph[] = new ArrayList[v];
        creating_graph(Graph);
        dfs(Graph, 0);
    }
}