/*
[Collection]
- Collection은 표준화된 자료구조(형태)를 의미합니다.
- 크게 Collection, List, Set, Map interface로 만들어져 있습니다.
*/

import java.util.*;

public class Collection {
    public static void main(String[] args) {
        /*
        [ArrayList]
        data의 저장 순서가 유지되며, 중복으로 저장이됩니다. (정적할당)
        */
        System.out.println("\n=== ArrayList ===");
        ArrayList arraylist = new ArrayList(5);

        /*
        [LinkedList]
        data의 저장 순서가 유지되며, 중복으로 저장이됩니다. (동적할당)
        */
        System.out.println("\n=== LinkedList ===");
        LinkedList linkedList = new LinkedList();

        /*
        [Stack]
        LIFO(Last In First Out)로 저장됩니다.
        */
        System.out.println("\n=== Stack ===");
        Stack stack = new Stack();

        /*
        [Queue]
        FIFO(First In First Out)로 저장됩니다.
        - Queue
        - Priority Queue (Heap)
        - Dequeue
        */
        System.out.println("\n=== Queue ===");

        /*
        [Hash Set]
        중복이 없는 Hash 입니다.
        */
        System.out.println("\n=== HashSet ===");
        Set hashSet = new HashSet();

        /*
        [Hash Map]
        key-value로 저장하는 table 입니다.
        */
        /* HashMap 만들기 */
        System.out.println("\n=== HashMap ===");
        HashMap hashMap = new HashMap();

        /* data 저장하기 */
        hashMap.put("java", "spring");
        hashMap.put("javascript", "express");
        hashMap.put("python", "django");
        hashMap.put("python", "flask"); // 같은 key 이름이라면 덮어씌워집니다.
        System.out.println("hashMap은" + hashMap);

        /* data 가져오기 */
        System.out.println("hashMap.get(\"java\")은 " + hashMap.get("java"));
        System.out.println("hashMap.entrySet()은 " + hashMap.entrySet());
        System.out.println("hashMap.keySet()은 " + hashMap.keySet());
        System.out.println("hashMap.values()는 " + hashMap.values());

        /* data 지우기 */
        hashMap.remove("python");
        System.out.println("hashMap은 " + hashMap);
        hashMap.clear();
        System.out.println("hashMap은 " + hashMap);
    }

    public static class EnumType {
    }
}
