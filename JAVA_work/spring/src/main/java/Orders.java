
/*
* 使用有参构造的注入
* */


public class Orders {
    //属性
    private String name;
    private String address;
   //有参构造
    public Orders(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public void ordersTest(){
        System.out.println(name+"::"+address);

    }
}
