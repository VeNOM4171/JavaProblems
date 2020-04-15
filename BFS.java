
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Vertex {
  public char label;
  public boolean wasVisited;
  
  public Vertex(char lab) {
    label = lab;
    wasVisited = false;
  }
}

class Graph {

  private final int MAX_VERTS = 20;
  private Vertex vertexList[];
  private int adjMat[][];
  private int nVerts;
  private Queue<Integer> q;
  
  public Graph() {
    vertexList = new Vertex[MAX_VERTS];
    adjMat = new int[MAX_VERTS][MAX_VERTS];
    nVerts = 0;
    q = new LinkedList<Integer>();
  }
  
  public void addVertex(char lab) {
    vertexList[nVerts++] = new Vertex(lab);
   
  }
  
  public void addEdge(int start, int end) {
    adjMat[start][end] = 1;
    adjMat[end][start] = 1;
  }
  
  public void displayVertex(int v) {
    System.out.print(vertexList[v].label+" ");
  }
  
  public int getAdjUnvisitedVertex (int v) {
    for(int j=0; j<nVerts; j++) {
      if(adjMat[v][j]==1 && vertexList[j].wasVisited==false) {
        return j;
      }
    }
    return -1;
  }
  
  public void bfs() {
    vertexList[0].wasVisited = true;
    displayVertex(0);
    q.add(0);
    int v2;
    
    while(!q.isEmpty()) { 
      //will return head of queue.   
      int v1 = q.remove();
      while((v2=getAdjUnvisitedVertex(v1))!=-1) {  
        vertexList[v2].wasVisited = true;
        displayVertex(v2);
        q.add(v2);  
      }
    }
  }
}

public class BFS {

  public static void main(String[] args) {
  
    Graph graph = new Graph();
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Number of Nodes(Max:20): ");
    int n = input.nextInt();
    
    for(int i=0;i<n;i++){
      System.out.println("Enter the Charater("+(i+1)+"): ");
      char c = input.next(".").charAt(0);
      graph.addVertex(c);

    }
    System.out.println("Enter which Nodes Are Connected in coordinate Form(x,y) index of node starts From 0");
    System.out.println("eg. Character(1)-0, Character(2)-1.......");
    for(int i=0;i<n-1;i++){
      System.out.println("Enter x("+(i+1)+"): ");
      int x = input.nextInt();
      System.out.println("Enter y("+(i+1)+"): ");
      int y = input.nextInt();
      graph.addEdge(x, y);
                             
  
    }
     input.close();      
    System.out.println("BFS Output: ");
    graph.bfs();
    System.out.println();
  }

}