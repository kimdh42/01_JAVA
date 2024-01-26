package com.ohgiraffers.section05.typecasting;

public class Application2 {
    public static void main(String[] args) {

        /*필기.
        * 강제형변환
        * 바꾸려는 자료형으로 캐스트 연산자를 이용하여 형변환한다.
        * 예) (바꿀자료형) 값;
        * */

        /*필기.
        * 자동형변환 규칙의 반대 상황에서 강제 형변환이 필요하다.
        * 1. 강제 형변환 규칙
        *  1-1. 큰 자료형에서 작은 자료형으로 변경 시 강제 형변환이 필요하다.
        *  1-2. 실수를 정수로 변경 시 강제 형변환이 필요하다.
        *  1-3. 문자형을 int미만 크기의 변수에 저장할 때 강제 형변환이 필요하다.
        *  1-4. 논리형은 강제 형변환 규칙에서도 제외된다.
        * */

        long lnum = 8;
//        int inum = lnum;        //데이터 손실 가능성을 컴파일러가 알려준다. (에러남)
        int inum = (int) lnum;     //변경하려는 자료형을 명시하여 강제 형변환을 해야 함

        short snum = (short) inum;
        byte bnum = (byte) snum;

        double dnum = 8.0;
//        float fnum = dnum;       //데이터 손실 가능성을 컴파일러가 알려준다. (에러남)
        float fnum = (float) dnum;
        System.out.println(fnum);

        float fnum2 = 4.0f;
//        long lnum2 = fnum2;      //float는 4byte, long은 8byte임에도 자동 형변환이 불가능(소수점 이하 데이터 손실 가능성)
        long lnum2 = (long)fnum2;

        System.out.println(fnum2);
        System.out.println(lnum2);

        char ch = 'a';
        byte bnum2 = (byte)ch;      //당연히 char 자료형보다 작은 크기이니 강제형변환을 해야 한다.
        short snum2 = (short)ch;    //같은 2byte지만 부호비트(sign bit)로 인한 값의 범위가 다르기 때문이다.

        boolean isTrue = true;
//        int i = isTrue;
//        char c = isTrue;
//        double d = isTrue;

    }
}



