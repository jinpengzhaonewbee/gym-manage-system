package com.tyut.service.impl;

import com.tyut.mapper.AdminMapper;
import com.tyut.pojo.Admin;
import com.tyut.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Admin adminLogin(Admin admin) {
        return adminMapper.selectByAccountAndPassword(admin);
    }

    @Override
    public List<Admin> findAll() {
        return adminMapper.findAll();
    }

    @Override
    public Boolean insertAdmin(Admin admin){
        return adminMapper.insertAdmin(admin);
    }
    @Override
    public List<Admin> selectByAdminAccount(Integer adminAccount){
        return adminMapper.selectByAdminAccount(adminAccount);
    };
    @Override
    public boolean updateAdminByAdminAccount(Admin admin){
        return adminMapper.updateAdminByAdminAccount(admin);
    }

    @Override
    public boolean deleteByAdminAccount(Integer adminAccount){
        return adminMapper.deleteByAdminAccount(adminAccount);
    }
}
