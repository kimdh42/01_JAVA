package com.ohgiraffers.arrayTest;

import java.util.Random;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*실습문제1
        * 1. 길이가 5인 String 배열 선언
        * 2. "딸기", "바나나", "복숭아", "키위", "사과" 로 초기화
        * 3. 스캐너로 0부터 4까지의 정수를 입력받아
        * 4. 해당 정수의 인덱스에 있는 과일을 출력
        * 단, 배열의 인덱스 범위를 벗어나는 경우 "준비된 과일이 없습니다."를 출력하세요.*/
//
//        String[] fruits = {"딸기", "바나나", "복숭아", "키위", "사과"};
//
//        System.out.print("0부터 4까지 정수를 입력하세요 : ");
//        int num = sc.nextInt();
//
//        if(num >= 0 && num < fruits.length) {
//            System.out.println(fruits[num]);
//        } else {
//            System.out.println("준비된 과일이 없습니다.");
//        }

        /*실습문제2
        * 주민등록번호를 스캐너로 입력 받고 문자 배열로 저장한 뒤,
        * 성별 자리 이후부터 *로 가려서 출력하세요
        *
        * 예) 990101 - 1******
        *
        * Hint 1. 입력받은 문자열을 charAt()을 이용하여 배열 인덱스 값에 넣어주자
        * Hint 2. toCharArray() 메소드 활용
        *       예시) char arr[] = number.toCharArray(); <- 문자열을 문자형 배열로 바꿔줌*/

        /* toCharArray() 메소드 이용 */
//        System.out.print("주민등록번호를 입력하세요 : ");
//        String input = sc.nextLine();
//
//       char[] jumin = input.toCharArray();
//
//        for(int i = 8; i < jumin.length; i++) {
//            jumin[i] = '*';
//        }
//        System.out.println(jumin);

        /* charAt() 이용 */
//        System.out.print("주민등록번호를 입력하세요 : ");
//        String input = sc.nextLine();
//
//        char jumin[] = new char[input.length()];
//
//        for(int i = 0; i < jumin.length; i++) {
//            if(i >7 && i <14) {
//                jumin[i] = '*';
//            } else {
//                jumin[i] = input.charAt(i);
//            }
//        }
//        System.out.println(jumin);


        /*실습문제 3
        * [로또번호 생성기]
        * 6칸 짜리 정수 배열을 하나 생성하고
        * 1부터 45까지의 중복되지 않는 난수를 발생시켜 각 인덱스에 대입한 뒤
        * 오름차순 정렬하여 출력하세요
        * */

        int lotto[] = new int[5];
        Random random = new Random();

        for(int i = 1; i <lotto.length; i++) {
            int randomNum;
            while(true) {
                randomNum = random.nextInt(45) + 1;
                for (int j = 0; j < i; j++) {
                    if(lotto[j] == randomNum) {
                        break;
                    } else {
                        break;
                    }
                }
            }
//            lotto[i] = randomNum;
        }
    }
}

