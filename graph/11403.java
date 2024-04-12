package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class _11403 {
  static int [][]graph;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    int N = Integer.parseInt(br.readLine());

    graph = new int[N][N];
    for(int i=0; i<N; i++) {
      st = new StringTokenizer(br.readLine(), " ");
      for(int j=0; j<N; j++) {
        graph[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    // 플로이드-워셜
    for(int k=0; k<N; k++) {
      for(int i=0; i<N; i++) {
        for(int j=0; j<N; j++) {
          if(graph[i][k] == 1 && graph[k][j] == 1) {
            graph[i][j] = 1;
          }
        }
      }
    }

    for(int i=0; i<N; i++) {
      for(int j=0; j<N; j++) {
        System.out.print(graph[i][j] + " ");
      }
      System.out.println();
    }
  }
}