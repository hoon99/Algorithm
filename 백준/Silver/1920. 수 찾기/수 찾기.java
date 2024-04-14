import java.util.*;

public class Main {

    static int A[];

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int N = sc.nextInt();
      A = new int[N];
      for(int i=0; i<N; i++) {
        A[i] = sc.nextInt();
      }
      Arrays.sort(A);

      int M = sc.nextInt();

      for(int i=0; i<M; i++) {
        BinarySearch(0, N-1, sc.nextInt());
      }
    }

    static void BinarySearch(int start, int end, int target) {
      int mid = (start + end)/2;
      if(target == A[mid]) {
        System.out.println(1);
        return;
      }
      else if(target > A[mid] && target <= A[end]) BinarySearch(mid+1, end, target);
      else if(target < A[mid] && target >= A[start]) BinarySearch(start, mid-1, target);
      else {
        System.out.println(0);
        return;
      }
    }
}