package dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void reduceMoney() {
        String sql = "update account set money = money-? where username=?";
        jdbcTemplate.update(sql,100,"lucy");
    }

    @Override
    public void addMoney() {
       String sql = "update account set money=money+? where username=?";
       jdbcTemplate.update(sql,100,"mary");
    }
    //创建两个方法，多钱和少钱的方法


}
