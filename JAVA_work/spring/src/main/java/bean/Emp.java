package bean;
//员工类进行创建
public class Emp {
    private String ename;
    private String gender;
//员工属于某一个部门，使用对象的形式表示
    private Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void add(){
        System.out.println(ename+"::"+gender+"::"+dept);
    }
}
