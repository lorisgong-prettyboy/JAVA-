package service;
import dao.UserDao;

public class UserService {
    //创建UerDao类型属性，生成对应的set方法
    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
       System.out.println("service add....");
       userDao.update();

   }

}
