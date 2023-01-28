import java.util.*;

class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        String ans = "Yes";
        int[] buf = new int[N];
        boolean[] hoge = new boolean[N];
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0;i < N;i++){
            List<Integer> list = new ArrayList<>();
            map.put(i, list);
        }
        for(int i = 0;i < M;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            buf[u-1]++;
            buf[v-1]++;
            List<Integer> list1 = map.get(u-1);
            list1.add(v-1);
            map.put(u-1,list1);
            List<Integer> list2 = map.get(v-1);
            list2.add(u-1);
            map.put(v-1,list2);
        }
        int buf2 = 0;
        int buf3 = 0;
        int fst = -1;
        if(N - 1 == M){
            for(int i = 0;i < N;i++){
                if(buf[i] == 0) ans = "No";
                else if(buf[i] == 1){
                    buf2++;
                    fst = i;
                }
                else if(buf[i] == 2) buf3++;
            }
        }else{
            ans = "No";
        }
        if(buf2 != 2 || buf3 != N-2) ans = "No";
        if(fst == -1){
            ans = "No";
        }else{
            hoge[fst] = true;
            while(true){
                List<Integer> list = map.get(fst);
                boolean flg2 = false;
                for(int num: list){
                    if(!hoge[num]){
                        hoge[num] = true;
                        fst = num;
                        flg2 = true;
                    }
                }
                if(!flg2) break;
            }
            if(buf[fst] != 1) ans = "No";
        }
        for(int i = 0;i < N;i++){
            if(!hoge[i]) ans = "No";
        }
        System.out.println(ans);
    }
}