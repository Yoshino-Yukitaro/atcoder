import java.util.*;

class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String ans = "Yes";
        Hoge[] hoge = new Hoge[N];
        boolean[] buf = new boolean[N];
        for(int i = 0;i < N;i++){
            String S = sc.next();
            String T = sc.next();
            hoge[i] = new Hoge(S, T, i);
        }
        for(int i = 0;i < N;i++){
            if(buf[i]) continue;
            buf[i] = true;
            int j = i;
            while()
        }
    }
}
class Hoge {
    String S;
    String T;
    int index;
    public Hoge(String S,String T, int index){
        this.S = S;
        this.T = T;
        this.index = index;
    }
}