/*
try-catch를 통해 예외처리를 합니다.
- try: 정상적으로 동작하는 코드 block 입니다.
- catch: try에서 예외가 발생하면 처리하는 코드 block 입니다.
*/

class MyException extends Exception {
    MyException(String message) {
        super(message);
    }
}

public class ExceptionHandling {
    public static void main(String[] args) {
        /* try-catch
        - try에서 예외발생 시, 해당 예외에 맞는 catch를 순서대로 찾아 실행합니다.
        - Exception은 모든 예외를 처리할 수 있습니다.
        */
        System.out.println("\n=== try-catch ===");
        int arr [] = { 1, 2, 3, 4, 5} ;

        try {
            System.out.println("try 시작");
            System.out.println(5/0);
            System.out.println(arr[5]);
            System.out.println("try 종료");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException 예외");
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException 예외");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Exception 예외");
            System.out.println(e);
        }

        /* 예외정보 보기
        - printStackTrace: 해당 예외의 정보와 메세지를 출력합니다.
        - getMessage: 해당 예외의 메세지를 반환합니다.
        */
        System.out.println("\n=== 예외정보 보기 ===");
        try {
            System.out.println("try 시작");
            System.out.println(5/0);
            System.out.println(arr[5]);
            System.out.println("try 종료");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException 예외");
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException 예외");
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception 예외");
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        /* 예외 합치기
        - | 키워드를 통해, 하나의 catch에서 여러 예외를 처리하도록 합니다.
        */
        System.out.println("\n=== 예외 합치기 ===");
        try {
            System.out.println("try 시작");
            System.out.println(5/0);
            System.out.println(arr[5]);
            System.out.println("try 종료");
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("ArrayIndexOutOfBoundsException 또는 ArithmeticException 예외");
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception 예외");
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        /* 예외 발생시키기
        - throw 키워드를 통해, 예외를 발생시킬 수 있습니다.
        */
        System.out.println("\n=== 예외 발생시키기 ===");
        try {
            System.out.println("throw 시작");
            throw new ArithmeticException("exception : (");
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("ArrayIndexOutOfBoundsException 또는 ArithmeticException 예외");
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception 예외");
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("throw 시작");
            throw new Exception("exception : (");
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("ArrayIndexOutOfBoundsException 또는 ArithmeticException 예외");
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception 예외");
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        /* finally
        - try, catch와 관계없이 실행되는 코드 block 입니다.
        */
        System.out.println("\n=== finally ===");
        try {
            System.out.println("throw 시작");
            throw new ArithmeticException("exception : (");
        } catch (Exception e) {
            System.out.println("Exception 예외");
            e.printStackTrace();
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally 실행");
        }

        /* 예외 만들기
        Exception class를 상속받아, 새로운 예외를 만들 수 있습니다.
        */
        System.out.println("\n=== 예외 발생시키기 ===");
        try {
            System.out.println("throw 시작");
            throw new MyException("exception : (");
        } catch (MyException e) {
            System.out.println("MyException 예외");
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
