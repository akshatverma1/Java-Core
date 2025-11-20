import java.util.*;
class Topological_Sorting {
    public static class Edges{
        int source;
        int desititation;
        int weight;
        
        Edges(int s,int d, int w){
            this.source = s;
            this.desititation = d;
            this.weight = w;
        }
    }


    public static void creating_graph(ArrayList<Edges> Graph[]){
        for(int i=0;i<Graph.length;i++){
            Graph[i] = new ArrayList<>();
        }


        //vertex =2;
        Graph[2].add(new Edges(2, 3, 1));

        //vertex = 3
        Graph[3].add(new Edges(3,1,1));

        //vertex = 4;
        Graph[4].add(new Edges(4, 0, 1));
        Graph[4].add(new Edges(4,1,1));
        //vertex = 5;
        Graph[5].add(new Edges(5, 0, 1));
        Graph[5].add(new Edges(5,2,1));

    }

    public static void dfs(ArrayList<Edges> Graph[]){
        boolean visited[] = new boolean[Graph.length];
        Stack <Integer> s = new Stack<>();
        for(int i=0;i<Graph.length;i++){
            if(visited[i] == false){
                dfs_util(Graph,i,visited,s);
            }
        }


        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }

    public static void dfs_util(ArrayList<Edges> Graph[],int current,boolean visited[],Stack s){
        // System.out.println(current);
        visited[current] = true;
        for(int i=0;i<Graph[current].size();i++){
            Edges e = Graph[current].get(i);
            if(visited[e.desititation] == false){
                dfs_util(Graph, e.desititation, visited, s);
            }
        }

        s.add(current);
    }
    public static void main(String arr[]){
        ArrayList <Edges> Graph[] = new ArrayList[6];
        creating_graph(Graph);
        dfs(Graph);
    }
}