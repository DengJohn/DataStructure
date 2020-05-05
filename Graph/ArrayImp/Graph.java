package Graph.ArrayImp;

public class Graph {
    // 顶点数组
    Vertex[] vexs;
    // 邻接矩阵
    AdjNode[][] arcs;
    // 图的当前顶点数
    int vexNum;
    // 图的当前弧数
    int arcNum;
    // 图的种类标志
    GraphKind kind;

    public Graph() {
        this.vexs = new Vertex[10];
        this.arcs = new AdjNode[10][10];
    }

    public Graph(int num) {
        this.vexs = new Vertex[num];
        this.arcs = new AdjNode[num][num];
    }

    public boolean CreateGraph(GraphKind kind) {
        switch(kind) {
            case DIGRAPH:
                return CreateDigraph();
        }
        return false;
    }

    private boolean CreateDigraph() {
        return false;
    }

    public static void main(String[] args) {
        Graph g = new Graph();
        g.CreateGraph(GraphKind.DIGRAPH);
        System.out.println("aaa");
    }
}
