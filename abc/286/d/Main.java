import java.util.*;

class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        Map<Integer,Integer> map = new HashMap<>();
        int[] dp = new int[N+1];
        int[] count = new int[N];
        int[] sum = new int[N];
        int deps = 0;
        int min_deps = 0; //現在0枚ではない深さ
        dp[0] = X;
        int[] buf = new int[N];
        for(int i = 0;i < N;i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            map.put(A,B);
            buf[i] = A;
        }
        Arrays.sort(buf);
        int max_value = buf[N-1];
        int max_value_count = map.get(max_value);
        int can_max_count = X / max_value;
        count[N-1] = Math.min(max_value_count, can_max_count);
        sum[0] = max_value * count[N-1];
        deps = 1;
        String ans = "No";
        if(sum[0] == X){
            min_deps = N;
        }
        while(min_deps < N){
            if(count[N-1-min_deps] == 0){
                min_deps++;
                deps = min_deps;
            }
            if(deps == min_deps){
                count[N-1-min_deps] -= 1;
                sum[min_deps] = buf[N-1-min_deps] * count[N-1-min_deps];
                deps = min_deps+1;
            }else if(sum[deps] != 0){
                if(count[N-1-deps] == 0){
                    sum[deps] = 0;
                    deps--;
                }else if(deps == min_deps){
                    count[N-1-min_deps] -= 1;
                    sum[min_deps] = buf[N-1-min_deps] * count[N-1-min_deps];
                    deps = min_deps+1;
                }else{
                    count[N-1-deps] -= 1;
                    sum[deps] = sum[deps-1] + count[N-1-deps] * buf[N-1-deps];
                    deps++;
                }
            }else{
                int deps_max_value = buf[N-1-deps];
                int deps_max_value_count = map.get(deps_max_value);
                int can_deps_max_count = (X - sum[deps - 1]) / deps_max_value;
                count[N-1-deps] = Math.min(deps_max_value_count, can_deps_max_count);
                sum[deps] = sum[deps-1] + deps_max_value * count[N-1-deps];
                if(sum[deps] == X){
                    ans = "Yes";
                    break;
                }else if(deps == N-1){
                    sum[deps] = 0;
                    deps--;
                }else{
                    deps++;
                }
            }
        } 
        System.out.println(ans);
    }
}