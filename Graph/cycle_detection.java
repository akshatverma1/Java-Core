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
        // graph[0].add(new Edges(0,2,1));
        graph[0].add(new Edges(0,3,1));

        //vertes = 1

        graph[1].add(new Edges(1,0,1));
        graph[1].add(new Edges(1,2,1));

        //vertes = 2

        // graph[2].add(new Edges(2, 0, 1));
        graph[2].add(new Edges(2, 1, 1));

        //vertes = 3

        graph[3].add(new Edges(3, 0, 1));
        graph[3].add(new Edges(3, 4, 1));

        //vertex = 4

        graph[4].add(new Edges(4, 3, 1));

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

    public static boolean cycle_detection_dfs_util(ArrayList <Edges> Graph[],int current,int parent,boolean visited[]){
        System.out.println(current);
        visited[current] = true;

        for(int i=0;i<Graph[current].size();i++){
            Edges e = Graph[current].get(i);

            //case = 3
            if(visited[e.Destition] == false){
                if(cycle_detection_dfs_util(Graph, e.Destition, current, visited)){
                    return true;
                }
            }

            //case =2
            //do Nothing


            //case = 1

            else if(visited[e.Destition]){
                if(e.Destition != parent){
                    return true;
                }
            }
        }

        return false;
    }
    public static boolean cycle_detection_dfs(ArrayList<Edges> Graph[],int current){
        boolean visited[] = new boolean[Graph.length];
        for(int i=0;i<Graph.length;i++){
            if(visited[i]==false){
                if(cycle_detection_dfs_util(Graph,current,-1,visited)) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String main[]){
        int v=5;
        ArrayList <Edges> Graph[] = new ArrayList[v];
        creating_graph(Graph);
        // dfs(Graph, 0);
        
        System.out.println(cycle_detection_dfs(Graph, 0));
    }
}