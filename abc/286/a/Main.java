import java.util.*;

class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int P = sc.nextInt() -1;
        int Q = sc.nextInt() -1;
        int R = sc.nextInt() -1;
        int S = sc.nextInt() -1;
        int[] A = new int[N];
        int sub = Q - P + 1;
        for(int i = 0;i < N;i++){
            A[i] = sc.nextInt();
        }
        for(int i = 0;i < sub;i++){
            int a = A[P + i];
            A[P + i] = A[R + i];
            A[R + i] = a;
        }
        for(int i = 0;i < N;i++){
            System.out.println(A[i]);
        }
    }
}