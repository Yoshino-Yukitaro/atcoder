import java.util.*;

class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt()-1;
        int X = sc.nextInt();
        int[] A = new int[N+1];
        int[] B = new int[N+1];
        boolean[][] dp = new boolean[N+2][10001]; //A_i円硬貨をB_i枚まで用いた時、ピッタリのj円になり得るならtrue
        for(int i = 0;i < N+1;i++){
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
        }
        dp[0][0] = true;
        for(int i = 0;i < N+1;i++){ //A_iとB_iについて
            for(int j = 0;j < X+1;j++){ //全ての金額についてdp[i][j]を求めたい
                for(int k = 0;k < B[i]+1;k++){ //0<=k<=B_iで、利用可能な硬貨の枚数を全探索
                    if(j>=A[i]*k){  //A_i円硬貨がk枚の時と比較したい金額jを比較する。jの方が小さいならcontinue
                        if(dp[i][j-A[i]*k]) dp[i+1][j] = true; // A_i円硬貨がB_i枚以内でj-A[i]*k円になるなら、それ以上硬貨を出さなくても以降はtrue
                    } 
                }
            }
        }
        String ans = dp[N+1][X] ? "Yes" : "No";
        System.out.println(ans);
    }
}