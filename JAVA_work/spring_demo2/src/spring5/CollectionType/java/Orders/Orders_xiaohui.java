package Orders;


public class Orders_xiaohui {

    public Orders_xiaohui() {
        System.out.println("执行第一步 创建bean实例对象");
    }

    private String oname;

    public void setOname(String oname) {
        this.oname = oname;
        System.out.println("第二步 调用set方法设置属性值");
    }
    public void initMethod(){
        System.out.println("第三步 执行初始化方法");
    }

    public void destoryMethod(){
        System.out.println("第五步 执行销毁的方法");
    }

}
