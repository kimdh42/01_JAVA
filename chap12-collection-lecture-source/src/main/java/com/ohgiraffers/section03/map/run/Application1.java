package com.ohgiraffers.section03.map.run;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {

        /* [ Map 인터페이스 특징 ]
        * Collection 인터페이스와는 다른 저장 방식을 가진다.
        * 키(key)와 값(value)를 하나의 쌍으로 저장하는 방식을 사용한다.
        *
        * 키(key) 란?
        * 값(value)를 찾기 위한 이름 역활을 하는 객체를 의미한다.
        * 1. 요소의 저장 순서를 유지하지 않는다.
        * 2. 키는 중보을 허용하지 않지만, 키가 다르면 중복되는 값(value)은 저장 가능하다.
        *
        *
        * HashMap, HashTable, TreeMap등의 대표적인 클래스가 있다.
        * HashMap이 가장 많이 사용된다.
        * */

        HashMap hmap = new HashMap();

        hmap.put("one", new Date());
        hmap.put(12, "red apple");
        hmap.put(33,123);
        /* autoBoxing처리 됨 : 12 -> new Integer(12) */

        System.out.println("hmap : " + hmap);

        /* 키는 중복 저장 되지 않음(set) : 최근 키로 override됨(덮어씀) */
        hmap.put(12, "yellow banana");
        System.out.println("hmap : " + hmap);

        hmap.put(11, "yellow banana");
        hmap.put(9, "yellow banana");
        System.out.println("hmap : " + hmap);

        System.out.println("키 9에 대한 객체 : " + hmap.get(9));

        hmap.remove(9);
        System.out.println("hmap : " + hmap);

        System.out.println("hmap에 저장된 객체 수 : " + hmap.size());

        HashMap<String, String> hmap2 = new HashMap<>();

        hmap2.put("one", "jana 8");
        hmap2.put("two", "mysql");
        hmap2.put("three", "jdbc");
        hmap2.put("four", "html5");
        hmap2.put("five", "css3");

        Iterator<String> ketIter = hmap2.keySet().iterator();

        while(ketIter.hasNext()) {
            String key = ketIter.next();
            String value = hmap2.get(key);
            System.out.println(key + " = " + value);
        }

        Collection<String> values = hmap2.values();
        Iterator<String> valueIter = values.iterator();

//        Iterator<String> valueIter = hmap2.values().iterator();

        while(valueIter.hasNext()) {
            System.out.println(valueIter.next());
        }
        Object[] valueArr = values.toArray();
        for(int i = 0; i < valueArr.length; i++) {
            System.out.println(i + " : " + valueArr[i]);
        }

        /*[ Entry ] : 키 객체와 값 객체를 쌍으로 묶은 것
        * Entry는 java.util.Map 인터페이스의 내부 인터페이스로, Map안의 키-값 쌍을 나타낸다.
        *
        * [ entrySet() ] : Map에 저장된 모든 키(key)-값(value) 쌍(Entry)를 Set형태로 반환 한다.
        * getKey()와 getValue() 메소드를 제공하여 키와 값을 각각 가져올 수 있다.
        *
        * Map.Entry 객체는 하나의 키와 값에 대한 참조를 제공하며, 이를 통해 특정 Map항목의 키 or 값을 가져오거나 설정할 수 있다.*/
        Iterator<Map.Entry<String, String>> entryIter =  hmap2.entrySet().iterator();

//        Set<Map.Entry<String, String>> set = hmap2.entrySet();
//        Iterator<Map.Entry<String, String>> entryIter = set.iterator();

        while(entryIter.hasNext()) {
            Map.Entry<String, String> entry = entryIter.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
