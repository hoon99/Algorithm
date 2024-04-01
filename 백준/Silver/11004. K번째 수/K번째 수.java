import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] A = new int[N+1];
        for (int i=1; i<=N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        quickSort(A, 1, N, K);
        System.out.println(A[K]);
    }

    public static void quickSort(int[] A, int start, int end, int K) {
        if (start < end) {
            int pivot = findPivot(A, start, end);
            if (pivot == K) {
                return;
            } else if (pivot < K) {
                quickSort(A, pivot+1, end, K);
            } else { // pivot > K
                quickSort(A, start, pivot-1, K);
            }
        }
    }

    public static int findPivot(int[] A, int start, int end) {
        if (start+1==end) {
            if (A[start]>A[end]) swap(A, start, end);
            return end;
        }

        int middle = (start+end)/2;
        swap(A, start, middle);
        int pivotValue = A[start];
        int i = start + 1;
        int j = end;

        while (i<=j) {
            while (A[j]>pivotValue && j>=start+1) {
                j--;
            }
            while (A[i]<pivotValue && i<=end) {
                i++;
            }
            if (i<=j) {
                swap(A, i++, j--);
            }
        }

        A[start] = A[j];
        A[j] = pivotValue;
        return j;
    }

    public static void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
