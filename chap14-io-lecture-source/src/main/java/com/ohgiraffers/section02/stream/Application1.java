package com.ohgiraffers.section02.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Application1 {
    public static void main(String[] args) {

        /*
        * [ Stream ]
        * 외부 데이터를 대상으로 작업할 때, 가장 먼저 해야할 일은 자바 프로그램과
        * 외부 데이터를 연결하는 것이다. (외부데이터란 프로그램 외부에 존재하는 모든 데이터를 의미한다.)
        * 프로그램과 외부 데이터가 연결된 길을 스트림(stream)이라고 한다.
        * 스트림은 단방향이기 때문에 데이터를 읽어오기 위한 길은 입력 스트림,
        * 데이터를 출력하기 위한 길을 출력스트림 이라고 부른다.
        *
        * [ java.io ]
        * 입출력과 관련된 API 패키지이다.
        *
        * inputStream 과 Reader 는 데이터를 읽어오는 입력스트림이고,
        * OutputStream 과 Writer 는 데이터를 내보내는 출력스트림이다.
        * InputStream 과 OutputStream 은 1byte 단위로 입/출력을 하고,
        * Reader 와 Writer 는 문자(2byte or 3byte) 단위로 작업을 한다.
        *
        * 자바 프로그램과 연결되는 외부 데이터의 타입이 무엇인지는 클래스의 이름을 보고 유추가 가능하다.
        * InputStream / OutputStream / Reader / Writer 를 빼고 남는 단어가 바로 외부 데이터의 타입이다.
        * */

        FileInputStream fin = null;

        try {
            fin = new FileInputStream("src/main/java/com/ohgiraffers/section02/stream/testInputStream.txt");
            int value;
//            while((value = fin.read()) != -1) {
//                System.out.println(value);
//                System.out.println((char) value);
//            }
            System.out.println("파일의 길이 : " + new File("src/main/java/com/ohgiraffers/section02/stream/testInputStream.txt").length());

            int fileSize = (int) new File("src/main/java/com/ohgiraffers/section02/stream/testInputStream.txt").length();
                        //파일의 길이는 보통 long 으로 형변환을 한다.
            byte[] bar = new byte[fileSize];

            fin.read(bar);
            for(int i = 0; i < bar.length; i++) {
                System.out.print((char) bar[i]);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fin != null) {
                try {
                    fin.close();
                    /* 자원 반납을 해야하는 이유
                    *   1. 장기간 실행중인 프로그램에서 스트림을 닫지 않는 경우 다양한 리소스에서 누수(leak) 방생.
                    *   2. 뒤에서 배우는 버퍼를 이용하는 경우 마지막에 flush()로 버퍼에 있는 데이터를 강제로 전송해야한다.
                    *      만약 잔류 데이터가 남은 상황에서 추가로 스트림을 사용하면 데드락(deadlock)상태가 된다.
                    *      이런 상황을 판단하기 어렵고 의도치 않은 상황에서 이런 현상이 발생할 수 있으므로 마지막에는
                    *      flush() 를 해주는 것이 좋다.
                    *      close() 메소드는 자원을 반납하면서 flush()까지 해주므로 close()만 제대로 해줘도 된다.
                    *      => 따라서 colse() 메소드는 외부 자우너을 사용한 경우 마지막에 반드시 호출해야 한다.
                    * */
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
