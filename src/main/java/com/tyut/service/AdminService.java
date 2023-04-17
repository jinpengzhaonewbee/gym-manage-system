package com.tyut.service;

import com.tyut.pojo.Admin;
import com.tyut.pojo.Equipment;

import java.util.List;

/**
 * @author MiloTnT [milotntspace@gmail.com]
 * @date 2021/8/11
 */

public interface AdminService {

    //管理员登录
    Admin adminLogin(Admin admin);
    List<Admin> findAll();
    //添加管理员
    Boolean insertAdmin(Admin admin);

    boolean updateAdminByAdminAccount(Admin admin);

    List<Admin> selectByAdminAccount(Integer adminAccount);

    boolean deleteByAdminAccount(Integer adminAccount);
}
