import java.util.*;
import java.io.*;
import java.util.Collections;

public class Main {
    static ArrayList<Integer>[] A;
    static boolean visited[];
    static Queue<Integer> q;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());

        A = new ArrayList[n+1];
        q = new LinkedList<>();

        for (int i=1; i<n+1; i++) {
            A[i] = new ArrayList<Integer>();
        }

        for (int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            A[s].add(e);
            A[e].add(s);
        }

        for (int i=1; i<n+1; i++){
          Collections.sort(A[i]);
        }

        visited = new boolean[n+1];
        DFS(start);
        System.out.println();
        visited = new boolean[n+1];
        BFS(start);

    }

    static void DFS(int v) {
        System.out.print(v+" ");
        visited[v] = true;
        for(int i=0; i<A[v].size(); i++){
          if(!visited[A[v].get(i)]) DFS(A[v].get(i));
        }
    }
    
    static void BFS(int v) {
      q.add(v);
      visited[v] = true;
      while(!q.isEmpty()){
        int current = q.poll();
        System.out.print(current + " ");
        for(int i=0; i<A[current].size(); i++){
          if(!visited[A[current].get(i)]) {
            q.add(A[current].get(i));
            visited[A[current].get(i)] = true;
          }
        }
      }
    }
}
