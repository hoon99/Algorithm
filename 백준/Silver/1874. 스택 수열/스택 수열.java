import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        
        for(int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }
        
        Stack<Integer> stack = new Stack<>();
        StringBuffer bf = new StringBuffer();
        int num = 1;
        boolean result = true;
        
        for(int i=0; i<N; i++) {
            if(A[i] >= num) {
                while(A[i] >= num){
                    stack.push(num++);
                    bf.append("+\n");
                }
                stack.pop();
                bf.append("-\n");
            } 
            else {
                if(stack.pop() > A[i]) {
                    System.out.println("NO");
                    result = false;
                    break;
                }
                bf.append("-\n");
            }
            }
        if (result) System.out.println(bf.toString());
        }
}
