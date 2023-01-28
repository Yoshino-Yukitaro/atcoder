import java.util.*;

class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int buf = 0;
        int N = sc.nextInt();
        for(int i = 0;i < N;i++){
            String b = sc.next();
            if(b.equals("For")) buf++;
        }
        String ans = (buf > N/2) ? "Yes" : "No";
        System.out.println(ans);
    }
}