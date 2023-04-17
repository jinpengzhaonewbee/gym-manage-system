package com.tyut.mapper;

import com.tyut.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author MiloTnT [milotntspace@gmail.com]
 * @date 2021/8/10
 */

@Mapper
public interface AdminMapper {

    Admin selectByAccountAndPassword(Admin admin);
    List<Admin> findAll();

    Boolean insertAdmin(Admin admin);
    //根据账号修改管理员信息
    boolean updateAdminByAdminAccount(Admin admin);

    List<Admin> selectByAdminAccount(Integer adminAccount);

    boolean deleteByAdminAccount(Integer adminAccount);
}
