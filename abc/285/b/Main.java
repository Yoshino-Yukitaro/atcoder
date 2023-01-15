import java.util.*;

class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        char[] C = S.toCharArray();
        for(int i = 1;i < N;i++){
            int buf = N - i;
            int ans = 0;
            for(int j = 0;j < buf;j++){
                if(C[j] == C[j+i]){
                    break;
                }
                ans++;
            }
            System.out.println(ans);
        }
    }
}