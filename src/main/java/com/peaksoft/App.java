package com.peaksoft;


import com.peaksoft.dao.UserDaoJdbcImpl;

public class App
{
    public static void main( String[] args )
    {
        // реализуйте алгоритм здесь
        UserDaoJdbcImpl userDao = new UserDaoJdbcImpl();
        userDao.createUsersTable();
        userDao.saveUser("Aza","Muratbekov", (byte) 27);
        userDao.saveUser("Aidai","Mamatbekova", (byte) 21);
        userDao.saveUser("Анара","Алмазова",(byte) 19);
        userDao.saveUser("Курманбек","Мамбетомуров",(byte) 32);
        System.out.println(userDao.getAllUsers());
        userDao.cleanUsersTable();
        userDao.dropUsersTable();
    }
}
