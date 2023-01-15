import java.util.*;

class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        char[] C = S.toCharArray();
        String alp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] alpha = alp.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0;i < 26;i++){
            map.put(alpha[i], i+1);
        }
        int len = C.length;
        long ans = 0;
        for(int i = len;i > 0;i--){
            int buf = map.get(C[len-i]);
            long num =1;
            for(int j = 0;j < i-1;j++){
                num *= 26;
            }
            ans += buf * num;
        }
        System.out.println(ans);
    }
}
