/*
package는 class의 묶음입니다. package 키워드를 통해 해당 class의 package를 정의하며 package 이름은 directory와 같아야 합니다.
*/

package app;

public class YourApp {
    public static void print(String s) {
        System.out.println("your app" + s);
    }

    public int add(int m, int n) {
        return m + n;
    }

    public static void main(String[] args) {
        System.out.println("your app");
    }
}
