

/*
 * 演示set方法注入属性
 * */

public class Book {

    private String bname;
    private String bauther;
    private String address;


//set方法注入


    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBauther(String bauther) {
        this.bauther = bauther;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void testDemo(){
        System.out.println(bname+"::"+bauther+"::"+address);
    }

}
