import java.util.*;
public class basic {
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
    public static void main(String arr[]){
        int v = 5;
        ArrayList<Edges> [] graph = new ArrayList[v];
        
        for(int i=0;i<v;i++){
            graph[i] = new ArrayList<>();
        }


        //vertex = 0
        graph[0].add(new Edges(0, 1, 5));

        //vertex = 1;
        graph[1].add(new Edges(1, 0, 5));
        graph[1].add(new Edges(1, 2, 1));
        graph[1].add(new Edges(1, 3, 3));

        //vertex =2;

        graph[2].add(new Edges(2,1, 1));
        graph[2].add(new Edges(2, 3, 1));
        graph[2].add(new Edges(2, 4, 4));

        //vertex = 3
        graph[3].add(new Edges(3, 1, 3));
        graph[3].add(new Edges(3, 2, 1));

        //vertex ==4

        graph[4].add(new Edges(4, 2, 2));


        for(int k=0;k<graph[2].size();k++){
            Edges e = graph[2].get(k);
            System.out.print("Destition = "+e.desititation);
            System.out.print(" weight = "+e.weight);
            System.out.println();
        }
        
    }
}