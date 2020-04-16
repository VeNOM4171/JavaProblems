import java.util.Scanner;
import java.util.Stack;

class VertexDFS {
  public char label;
  public boolean wasVisited;
  
  public VertexDFS(char lab) {
    label = lab;
    wasVisited = false;
  }
}

class GraphDFS {

  private final int MAX_VERTS = 20;
  private VertexDFS vertexList[];
  private int adjMat[][];
  private int nVerts;
  private Stack<Integer> s;
  
  public GraphDFS() {
    vertexList = new VertexDFS[MAX_VERTS];
    adjMat = new int[MAX_VERTS][MAX_VERTS];
    nVerts = 0;
    s = new Stack<Integer>();
  }
  
  public void addVertex(char lab) {
    vertexList[nVerts++] = new VertexDFS(lab);
  }
  
  public void addEdge(int start, int end) {
    adjMat[start][end] = 1;
    adjMat[end][start] = 1;
  }
  
  public void displayVertex(int v) {
    System.out.print(vertexList[v].label + " ");
  }
  
  public int getAdjUnvisitedVertex (int v) {
    for(int j = 0; j < nVerts; j++) {
      if(adjMat[v][j] == 1 && vertexList[j].wasVisited == false) {
        return j;
      }
    }
    return -1;
  }
  
  public void dfs() {
    vertexList[0].wasVisited = true;
    displayVertex(0);
    s.push(0);
    
    while(!s.isEmpty()) {    
      int v = getAdjUnvisitedVertex(s.peek());
      
      if(v == -1) {
        s.pop();
      } else {
        vertexList[v].wasVisited = true;
        displayVertex(v);
        s.push(v);
      }
    }
  }
}

public class DFS {

  public static void main(String[] args) {
  
    GraphDFS graph = new GraphDFS();
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
    graph.dfs();
    System.out.println();
  }

}