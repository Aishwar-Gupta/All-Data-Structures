import java.util.Scanner;
import java.util.ArrayList;

class Node
{
        int data;

        Node(int data)
        {
            this.data = data;
        }
}

public class graphs {

    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Node: ");
        int input = sc.nextInt();
        ArrayList<Node> array = new ArrayList<>();
        for(int i = 0; i < input; i++)
        {
            System.out.println("Enter the names of the Nodes at " + i + " : ");
            array.add(new Node(sc.nextInt()));
        }

        int edges[][] = new int[input][input];

        for(int i = 0; i < input; i++)
        {
            System.out.println("Enter the Edges: ");
            int starting_vertex = sc.nextInt();
            int ending_vertex = sc.nextInt();
            edges[starting_vertex -1][ending_vertex -1] = 1;
            edges[ending_vertex -1][starting_vertex -1] = 1;
        }
        
        for(int i = 0; i < edges.length; i++)
        {
            for(int j = 0; j < edges[i].length; j++)
            {
                System.out.println(edges[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        
    }
    
}
