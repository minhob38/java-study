/*
package는 class의 묶음입니다. import 키워드를 통해 해당 package의 class를 가져올 수 있습니다.
*/

import app.MyApp;

public class Package {
    public static void main(String[] args) {
        MyApp.print("spring server");
        app.YourApp.print("spring server");

        MyApp myApp = new MyApp();
        System.out.println(myApp.add(1, 5));
    }
}
