/*
stream은 data source(Collection(List/Set), array)를 다룰 수 있는 data의 흐름입니다.
*/

import java.util.*;
import java.util.stream.*;
import java.util.stream.Collectors;

public class StreamHandling {
    public static void main(String[] args) {
        /*
        [stream 만들기]
        - Collection에 stream 함수가 만들어져 있어 List, Set은 해당 stream 함수를 통해 stream을 만듭니다.
        - Stream, Arrays에 stream 함수가 만들어져 있어 Arrays는 해당 stream 함수를 통해 stream을 만듭니다.
        - collect method로 만든 stream을 다시 모읍니다.
        */
        System.out.println("\n=== stream 만들기 ===");
        String [] strArr = { "java", "python", "javascript" };
        List strList = Arrays.asList(strArr);

        Stream strArrStreamA = Arrays.stream(strArr);
        Stream strListStreamA = strList.stream();
        Stream strArrStreamB = Arrays.stream(strArr);
        Stream strListStreamB = strList.stream();

        strArrStreamA.forEach(System.out::println);
        strListStreamA.forEach(System.out::println);

        List strListA = (List)strArrStreamB.map(item -> item + " " + "language").collect(Collectors.toList());
        Object strListB = strListStreamB.map(item -> item + " " + "language").collect(Collectors.toSet());
        System.out.println(strListA);
        System.out.println(strListB);

        /*
        [Optional]
        Optional을 통해 null을 편리하게 다룰 수 있습니다.
        */
        System.out.println("\n=== Optional ===");
        /* Optional 저장하기 */
        Optional<String> optionalA = Optional.empty();
        Optional<String> optionalB = Optional.of("java");
        Optional<String> optionalC = Optional.ofNullable(null);

        /* Optional 가져오기 */
        String strA = optionalC.orElse("null :(");
        String strB = optionalB.get();
        String strC = optionalC.orElse("null :(");
        System.out.println("strA는 " + strA);
        System.out.println("strB는 " + strB);
        System.out.println("strB는 " + strC);

        /* Optional null 검사 */
        Boolean isNullA = optionalA.isPresent();
        Boolean isNullB = optionalB.isPresent();
        System.out.println("isNullA는 " + !isNullA);
        System.out.println("isNullB는 " + !isNullB);
    }
}
