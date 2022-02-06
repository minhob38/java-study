/*
stream은 data source(Collection(List/Set), array)를 다룰 수 있는 data의 흐름입니다.
*/

import java.util.*;
import java.util.stream.*;

public class StreamHandling {
    public static void main(String[] args) {
        /*
        [stream 만들기]
        - Collection에 stream 함수가 만들어져 있어 List, Set은 해당 stream 함수를 통해 stream을 만듭니다.
        - Stream, Arrays에 stream 함수가 만들어져 있어 Arrays는 해당 stream 함수를 통해 stream을 만듭니다.
        */
        System.out.println("\n=== stream 만들기 ===");
        String [] strArr = { "java", "python", "javascript" };
        List strList = Arrays.asList(strArr);

        Stream strArrStream = Arrays.stream(strArr);
        Stream strListStream = strList.stream();

        strArrStream.forEach(System.out::println);
        strListStream.forEach(System.out::println);

        /*
        [Optional]
        Optional을 통해 null을 편리하게 다룰 수 있습니다.
        */
        System.out.println("\n=== Optional ===");
        /* Optional 저장하기 */
        Optional<String> optionalA = Optional.of("java");
        Optional<String> optionalB = Optional.ofNullable(null);

        /* Optional 가져오기 */
        String strA = optionalA.get();
        String strB = optionalB.orElse("null :(");
        System.out.println("strA는 " + strA);
        System.out.println("strB는 " + strB);

        /* Optional null 검사 */
        Boolean isNullA = optionalA.isPresent();
        Boolean isNullB = optionalB.isPresent();
        System.out.println("isNullA는 " + !isNullA);
        System.out.println("isNullB는 " + !isNullB);
    }
}