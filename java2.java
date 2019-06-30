import java.util.Scanner;
class java2 {


    public int[] icecreamparlour(int m, int[] cost) {
        int n = cost.length;
        int x, y;
        int answer[] = {0, 0};
        for (int i = 0; i < n; i++) {
            x = cost[i];
            for (int j = 0; j < n - 1; j++) {
                y = cost[j];
                if ((x + y) == m) {
                    answer[0] = x;
                    answer[1] = y;
                    return answer;
                }
            }

        }
        return answer;


    }

    public static void main(String[] args) {
        Scanner s = new Scanner((System.in));
        int t = s.nextInt();
        int[][] answer = new int[t][2];
        java2 obj = new java2();
        for (int i = 0; i < t; i++) {
            int m = s.nextInt();
            int n = s.nextInt();
            int[] cost = new int[n];
            for (int j = 0; j < n; j++) {
                cost[j] = s.nextInt();
            }
            answer[i] = obj.icecreamparlour(m, cost);
        }
        for (int o = 0; o < t; o++) {
            for (int p = 0; p < 2; p++) {
                System.out.println(answer[o][p]);
            }
        }


    }
}