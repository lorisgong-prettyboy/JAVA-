package service;

import dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    //注入DAO
    @Autowired
    private UserDao userDao;

    public void accountMoney(){

        userDao.reduceMoney();

        userDao.addMoney();
    }
}
