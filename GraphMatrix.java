import java.util.*;
public class GraphMatrix{
    public static void main(String args[]){
    int vertices=4;
    int adjmatrix[][]=new int[vertices][vertices];
    adjmatrix[0][1]=1;
    adjmatrix[1][0]=1;
    adjmatrix[0][2]=1;
    adjmatrix[2][0]=1;
    adjmatrix[2][3]=1;
    adjmatrix[3][2]=1;
    adjmatrix[3][1]=1;
    adjmatrix[1][3]=1;
    System.out.print("adjacency matrix:");
    {
    for(int i=0;i<vertices;i++)
    {
        for(int j=0;j<vertices;j++)
        {
        System.out.print(adjmatrix[i][j]+" ");
    }
    System.out.println("");
}
}
}
}

