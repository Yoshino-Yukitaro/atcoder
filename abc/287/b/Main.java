import java.util.*;

class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        String[] S = new String[N];
        String[] T = new String[M];
        int ans = 0;
        for(int i = 0;i < N;i++){
            S[i] = sc.next();
        }
        for(int i = 0;i < M;i++){
            T[i] = sc.next();
        }
        for(int i = 0;i < N;i++){
            boolean flg = false;
            for(int j = 0;j < M;j++){
                if(S[i].substring(3, 6).equals(T[j]) && !flg){
                    ans++;
                    flg = true;
                }
            }
        }
        System.out.println(ans);
    }
}