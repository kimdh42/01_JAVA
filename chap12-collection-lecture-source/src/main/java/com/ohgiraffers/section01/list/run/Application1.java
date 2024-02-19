package com.ohgiraffers.section01.list.run;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {

        /* [컬렉션 프레일워크(Collection Framework]
        *  여러개의 다양한 데이터들을 쉽고 효과적으로 처리할 수 있도록
        *  표준화된 방법을 제공하는 클래스들의 집합을 의미한다.
        *  즉, 데이터를 효율적으로 저장하는 자료구조와 데이터를 처리하는 알고리즘을 미리 구현해놓은 클래스를 말한다.
        *
        *
        *
        * Collection Framework는 크게 3가지 인터페이스중 한 가지를 상속받아 구현해 놓았다.
        * 1. List 인터페이스
        * 2. Set 인터페이스
        * 3. Map 인터페이스
        *
        * List 인터페이스와 Set 인터페이스의 공통 부분을 Collection 인터페이스에서 정의하고 있다.
        * 하지만 Map은 구조상의 차이로 Collection 인터페이스에서 정의하고 있지 않다.
        *
        *
        * [ List 인터페이스 ]
        *  - 순서 있는 데이터 집합으로 데이터의 중복저장을 허용한다.
        *  - Vector, ArrayList, LinkedList, Stack, Queue 등이 있다.
        *
        * [ Set 인터페이스 ]
        *  - 순서가 없는 데이터의 집합으로 데이터의 중복 저장을 허용하지 않는다.
        *  - HashSet, TreeSet 등이 있다.
        *
        * [ Map 인터페이스 ]
        *  - 키와 값 한 쌍으로 이루어지는 데이터 집합이다.
        *  - key를 Set 방식으로 관리하기 때문에 데이터의 순서를 관리하지 않고 중복된 key를 허용하지 않는다.
        *  - value는 중복된 값을 저장할 수 있다.
        *  - HashMap, TreeMap, HashTable, Properties등이 있다.*/

        /* [ ArrayList ]
        * 배열의 단점을 보완하기 위해 만들어졌다.
        * 배열은 크기를 변경할 수 없고, 요소의 추가, 삭제, 정렬 등이 복잡하다는 단점을 가지고 있다.
        * ArrayList는 저러한 배열의 단점을 보완하고자 크기변경(새로운 더 큰 배열 만들고 옮기기)
        * 요소의 추가, 삭제, 정렬 기능들을 미리 메소드로 구현해서 제공하고 있다.
        * 자동적으로 수행되는 것이지 속도가 빨라지는 것은 아니다.
        * */

        /* ArrayList는 인스턴스를 생성하게 되면 내부적으로 10칸짜리 배열을 생성해서 관리한다. */
        ArrayList alist = new ArrayList();

        List list = new ArrayList();

        Collection clist = new ArrayList();

        alist.add("apple");
        alist.add(123);
        alist.add(45.67);
        alist.add(new Date());

        System.out.println("alist : " + alist);

        System.out.println("alist의 size : " + alist.size());

        for(int i = 0; i < alist.size(); i++) {
            System.out.println(i + " : " + alist.get(i));
        }

        alist.add("apple");
        System.out.println("alist : " + alist);

        alist.add(1, "banana");
        System.out.println("alist : " + alist);

        alist.remove(2);                     //지정된 위치의 값 삭제
        System.out.println("alist : " + alist);

        alist.set(1, Boolean.valueOf(true));    //지정된 위치의 값 수정
                                                   //valueOf : boolean <-> Boolean 변환
//        alist.set(1, true);                      //api 래퍼클래스 참고(오토박싱)
        System.out.println("alist : " + alist);

        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        /* 제네릭 타입을 지정하면 지정한 타입 외의 인스턴스는 저장하지 못한다. */
//        stringList.add(123);      //정수타입이라 에러 발생
        stringList.add("banana");
        stringList.add("mango");
        stringList.add("grape");
        System.out.println("stringList : " + stringList);

        Collections.sort(stringList);           //오름차순으로 정리 Collections.sort();
        System.out.println("stringListSort : " + stringList);

        stringList = new LinkedList<>(stringList);

        /* [ Iterator ]
        * Collection 인터페이스의 iterator() 메소드를 이용해서 인스턴스를 생성할 수 있다.
        * 반복자 라고 불리우며, 반복문을 이용해서 목록을 하나씩 꺼내는 방식으로 사용하기 위함이다.
        * 인덱스로 관리되는 컬렉션이 아닌 경우에는 반복문을 사용해서 요소에 하나씩 접근할 수 없기 때문에
        * 인덱스를 사용하지 않고도 반복문을 사용하기 위한 목록을 만들어주는 역할이라고 보면된다.
        * hasNext() : 다음 요소를 가지고 있는 경우 true, 더 이상 요소가 없는경우 false를 반환
        * next() : 다음 요소를 반환
        * */

        Iterator<String> dIter = ((LinkedList<String>)stringList).descendingIterator();

        List<String> descList = new ArrayList<>();

        while(dIter.hasNext()) {
            descList.add(dIter.next());
        }
        System.out.println("descList : " + descList);
    }
}
