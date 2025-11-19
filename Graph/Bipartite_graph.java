import java.util.*;
public class Bipartite_graph {
    public static class Edges{
        int source;
        int desititation;
        int weight;

        Edges(int s, int d,int w){
            this.source = s;
            this.desititation = d;
            this.weight = w;
        }
    }

    public static void creating_graph(ArrayList<Edges> Graph[],int current){
        for(int i =0 ;i<Graph.length;i++){
            Graph[i] = new ArrayList<>();
        }
        //vertex = 0;
        Graph[0].add(new Edges(0,2,1));
        Graph[0].add(new Edges(0,1,1));

        //vertex = 1
        Graph[1].add(new Edges(1,0,1));
        Graph[1].add(new Edges(1,3,1));

        //vertex = 2
        Graph[2].add(new Edges(2,0,4));
        Graph[2].add(new Edges(2,4,1));

        //vertex = 3

        Graph[3].add(new Edges(3,1,1));
        // Graph[3].add(new Edges(3,4,1));

        //vertex = 4
        Graph[4].add(new Edges(4,2,1));
        // Graph[4].add(new Edges(4,3,1));

    }

    public static boolean bipartite(ArrayList<Edges> Graph[]){
        int col[] = new int[Graph.length];
        for(int i= 0;i<col.length;i++){
            col[i] = -1;
        } 
        Queue <Integer> q = new LinkedList<>();

        for(int i=0;i<Graph.length;i++){
            if(col[i]==-1){
                q.add(i);
                col[i]=0;
                while(!q.isEmpty()){
                    int curr = q.remove();
                    for(int j=0;j<Graph[curr].size();j++){
                        Edges e = Graph[curr].get(j);
                        if(col[e.desititation]==-1){
                            int value = col[curr] == 0 ? 1 :0;
                            col[e.desititation] = value;
                            q.add(e.desititation);
                        } else if(col[curr] == col[e.desititation]){
                            return false; // not bipartite
                        }
                    }
                }
            }
        }
        return true;
    }


    public static void main(String arr[]){
        int v=7;
        ArrayList <Edges> Graph[] = new ArrayList[v];
        creating_graph(Graph, 0);
        System.out.println(bipartite(Graph));
    }
}
