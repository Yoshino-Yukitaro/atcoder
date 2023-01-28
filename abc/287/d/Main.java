import java.util.*;

class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        char[] TC = T.toCharArray();
        int len = T.length();
        int sLen = S.length();
        int N = len+1;
        for(int i = 0;i < N;i++){
            String buf = S.substring(0, i);
            char[] cbuf = buf.toCharArray();
            int buf2 = sLen - len + i;
            String buf3 = "";
            if(buf2 < sLen){
                buf3 = S.substring(buf2);
            }
            char[] cbuf3 = buf3.toCharArray(); 
            boolean flg = true;
            if(i == 0){
                for(int j =0;j < len;j++){
                    if(TC[j] != cbuf3[j] && TC[j] != '?' && cbuf3[j] != '?') flg = false;
                }
            }else{
                int buf4 = cbuf.length;
                for(int j = 0;j < len;j++){
                    if(j < buf4){
                        if(TC[j] != cbuf[j] && TC[j] != '?' && cbuf[j] != '?') flg = false;
                    }else{
                        if(TC[j] != cbuf3[j-buf4] && TC[j] != '?' && cbuf3[j-buf4] != '?') flg = false;
                    }
                }
            }
            String ans = (flg) ? "Yes" : "No";
            System.out.println(ans);
        }
    }
}