package com.ohgiraffers.section02.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application2 {
    public static void main(String[] args) {


        /*
        * [ FileReader ]
        * FileInputStream 과 사용하는 방법이 거의동일하다.
        * 단, byte 단위가 아닌 character 단위로 읽어들이는 부분이 차이점이다.
        * 따라서 2바이트던 3바이트던 글자 단위로 읽어오기 때문에 한글을 정상적으로 읽어올 수 있다.
        * */

        FileReader fr = null;
        try {
            fr = new FileReader("src/main/java/com/ohgiraffers/section02/stream/testReader.txt");
            int value;
//            while((value = fr.read()) != -1) {
//                System.out.print((char) value);
//            }

            char[] carr = new char[(int) new File("src/main/java/com/ohgiraffers/section02/stream/testReader.txt").length()];
            fr.read(carr);

            for(int i = 0; i < carr.length; i ++) {
                System.out.print(carr[i]);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
