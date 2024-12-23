import java.util.Scanner;

public class Main {
    static int N;
    static Point[] points;
    static boolean[] selected;
    static double minLength;

    static class Point {
        int x, y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 수

        for (int t = 0; t < T; t++) {
            N = sc.nextInt();
            points = new Point[N];
            selected = new boolean[N];
            minLength = Double.MAX_VALUE;

            for (int i = 0; i < N; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                points[i] = new Point(x, y);
            }

            // 시작 재귀 호출
            combination(0, 0);
            System.out.printf("%.6f%n", minLength);
        }
        sc.close();
    }

    // 조합을 만들어 재귀적으로 탐색
    static void combination(int idx, int count) {
        if (count == N / 2) {
            calculateVectorSum();
            return;
        }

        if (idx >= N) return;

        // 현재 점을 선택
        selected[idx] = true;
        combination(idx + 1, count + 1);

        // 현재 점을 선택하지 않음
        selected[idx] = false;
        combination(idx + 1, count);
    }

    // 벡터 합의 길이 계산
    static void calculateVectorSum() {
        long sumX = 0, sumY = 0;

        for (int i = 0; i < N; i++) {
            if (selected[i]) {
                sumX += points[i].x;
                sumY += points[i].y;
            } else {
                sumX -= points[i].x;
                sumY -= points[i].y;
            }
        }

        double length = Math.sqrt(sumX * sumX + sumY * sumY);
        minLength = Math.min(minLength, length);
    }
}
