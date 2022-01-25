/*
배열이란 같은 자료형들을 모아놓은 자료형입니다.
*/

public class Array {
    public static void main(String[] args) {
        System.out.println("\n=== 배열 선언 ===");
        int [] a = new int[5];
        System.out.println(a);
        System.out.println(a.length);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        System.out.println("\n=== 배열 선언 및 초기화 ===");
        int [] b = new int[]{ 1, 2, 3, 4, 5 }; // 선언과 초기화를 같이하면, new 자료형[]은 생략될 수 있습니다.
        System.out.println(b);
        System.out.println(b.length);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

        System.out.println("\n=== 배열 복사===");
        // for문을 통한 복사
        int [] c = { 1, 2, 3, 4, 5 };
        int [] d = new int[c.length * 2];
        for (int i = 0; i < c.length; i++) {
            d[i] = c[i];
        }
        c = d;
        for (int i = 0; i < c.length; i++) {
            System.out.println("c는 " + c[i]);
        }

        // System.arraycopy를 통한 복사
        int [] e = { 1, 2, 3, 4, 5 };
        int [] f = new int[e.length * 2];
        System.arraycopy(e, 0, f, 0, e.length);
        for (int i = 0; i < f.length; i++) {
            System.out.println("f는 " + f[i]);
        }

        System.out.println("\n=== 다차원 배열 ===");
        int [][] g = {
            { 1, 2, 3, 4, 5 },
            { 11, 12, 13 },
            { 21, 22, 23, 24, 25 }
        };
        System.out.println(g);
        System.out.println(g.length);
        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < g[i].length; j++) {
                System.out.println(g[i][j]);
            }
        }
    }
}
