import java.util.*;

class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long A = sc.nextLong();
        long B = sc.nextLong();
        String S = sc.next();
        long ans = 1000000000000000000L;
        S += S;
        for(int i = 0;i < N;i++){
            long buf = i * A;
            for(int j = 0;j < N/2;j++){
                if(S.charAt(i+j) != S.charAt(N-1+i-j)) buf += B;
            }
            ans = Math.min(ans, buf);
        }
        System.out.println(ans);
    }
}