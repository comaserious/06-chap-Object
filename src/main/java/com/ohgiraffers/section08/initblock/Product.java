package com.ohgiraffers.section08.initblock;

public class Product {

    /*목차 1. 필드를 초기화하지 않으면 JVM이 정한 기본값으로 객체가 생성된다*/

//    private String productName;
//    private int price;
//    private static String brand;


    /*목차 2. 명시적 초기화*/
    private String productName = "갤럭시";
    private int price = 250000;
    private static String brand ="삼성";

    /*목차 3. 인스턴스 초기화 블럭*/
    {
        productName = "아이폰";
        price = 500000;
        brand = "애플";
        System.out.println("인스턴스 초기화 블럭 동작함...");
    }

    static {
        /*필기.
        *  static 초기화 블럭에서는 non-static 필드를 초기화 하지 못한다
        *  정적 초기화 블럭은 프로그램이 시작시 동작하기 때문에
        *  정적 초기화 블럭 동작 시점에서 인스턴스는 존재할 수 없기 때문이다
        *  존재하지 않는 인스턴스 변수에 초기화하는 것은 불가능하다*/
//        name = "아이뿅";
//        price = 2000;
        brand ="헬지";
        System.out.println("정적 초기화 블럭 동작함...");
    }

    public Product (){
        System.out.println("기본 생성자 작동함....");
    }
    /*목차 4. 매개변수 있는 생성자*/
    /*필기.
    *  매개변수 있는 생성자
    *  위에서 초기화 된 값을 다 무시하고 생성자에 작성한 초기화 내용으로 인스턴스를 초기화 한다*/

    public Product(String productName , int price , String brand){
        this.productName = productName;
        this.price=price;
        Product.brand = brand;
        System.out.println("매개변수 있는 생성자 호출됨 ....");
    }




    public String getInfo(){
        return "product [ name = "+this.productName +" price = "+this.price+" brand = "+Product.brand+"]";
    }



}
