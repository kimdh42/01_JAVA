package com.ohgiraffers.section04.constructor;

public class User {

    private String id;
    private String pwd;
    private String name;
    private java.util.Date enrollDate;

    /* 생성자의 사용 목적
    * 1. 인스턴스 생성 시점에 수행할 명령이 있는 경우 사용한다.
    * 2. 매개변수 있는 생성자의 경우 매개변수로 전달받은 값으로 필드를 초기화하며, 인스턴스를 생성할 목적으로 주로 사용
    * 3. 작성한 생성자 외에는 인스턴스를 생성하는 방법을 제공하지 않는다는 의미를 가진다.
    *    따라서, 인스턴스를 생성하는 방법을 제한하기 위한 용도로 사용할 수 도 있다.(초기값 전달 강제화.)
    *
    *
    *  [생성자 표현식]
    *   접근제한다 클래스명(매개변수) {
    *       인스턴스 생성 시점에 수행할 명령 기술(주로 필드 초기화)
    *       this.필드명 = 매개변수;    //설정자(setter)여러 개의 기능을 한번의 호출로 수행 가능
    * }
    *
    *
    * 생성자 작성 시 주의할 점
    * 1. 생성자 메소드는 반드시 클래스의 이름과 동일해야 한다.(대/소문자까지 같아야 함)
    * 2. 생성자 메소드는 반환형을 작성하지 않는다. (작성하는 경우 생성자가 아닌 메소드로 인식한다.)
    *
    * [생성자의 종류]
    * 1. 기본생성자(매개변수 없는 생성자)
    * 2. 매개변수 있는 생성자
    *    기본생성자는 자바 Compiler가 자동으로 추가해주는 구문이지만 명시적으로 작성할 수도 있다.
    *    매개변수 있는 생성자가 한개라도 존재하는 경우 기본생성자를 자동으로 추가해주지 않기 때문에
    *    기본생성자가 필요한 경우에는 반드시 명시적으로 작성해 주어야 한다.
    * */

    public User() {
        System.out.println(" User 클래스의 기본 생성자 호출함" );
    }

    /*동일한 이름의 생성자 혹은 메소드를 한 클래스 안에서 작성하는 것은 불가능하다.(Compile Error*/
//    public User() {}

    public User(String id, String pwd, String name) {
        this.id = id;           //this는 인스턴스 생성 시점에 발생한 주소가 저장된다.
        this.pwd = pwd;
        this.name = name;

        System.out.println("User 클래스의 id, pwd, name을 초기화하는 생성자 호출함");
    }

    public User(String id, String pwd, String name, java.util.Date enrollDate) {
//        this.id = id;
//        this.pwd = pwd;
//        this.name = name;
//        this.enrollDate = enrollDate;

        /* this() 사용하기
        * this()는 동일 클래스 내에 작성한 다른 생성자 메소드를 호출하는 구문이다.
        * 괄호 안에 매개변수의 타입, 갯수, 순서에 맞는 생성자를 호출하고 복귀한다. (메소드와 동일)
        * this()는 가장 첫 줄에 선언해야 하며, 그렇지 않은 경우 Compile Error가 발생한다.
        * */
        this(id, pwd, name);        //미리 작성한 세개의 필드를 초기화하는 생성자로 매개변수로 받은 값을 전달
        this.enrollDate = enrollDate;

        System.out.println("User 클래스의 모든 필드를 초기화하는 생성자 호출함");
    }

    public String getInfomation() {
        return "User [id =" + this.id + ", pwd = " + this.pwd + ", name = " + this.name + ", enrollDate = " + this.enrollDate + "]";
                }

}
