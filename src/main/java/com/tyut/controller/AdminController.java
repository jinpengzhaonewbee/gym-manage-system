package com.tyut.controller;

import com.tyut.pojo.Admin;
import com.tyut.pojo.Employee;
import com.tyut.pojo.Equipment;
import com.tyut.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;



    //查询显示管理人员

    @RequestMapping("/selAdmin")
    public String selectAdmin(Model model) {
        List<Admin> adminList = adminService.findAll();
        model.addAttribute("adminList", adminList);
        return "selectAdmin";
    }
    //跳转新增管理员页面
    @RequestMapping("/toAddAdmin")
    public String toAddAdmin() {
        return "addAdmin";
    }

    //新增管理员
    @RequestMapping("/addAdmin")
    public String addAdmin(Admin admin) {
//        if(adminService.insertAdmin(admin)){
//            return "redirect:selAdmin";
//        }
//        else{
//            return "error";
//        }
        adminService.insertAdmin(admin);
        return "redirect:selAdmin";

    }
    //跳转修改管理员信息页面
    @RequestMapping("/toUpdateAdmin")
    public String toUpdateEquipment(Integer adminAccount, Model model) {
        List<Admin> adminList = adminService.selectByAdminAccount(adminAccount);
        model.addAttribute("adminList", adminList);
        return "updateAdmin";
    }

    //修改管理员
    @RequestMapping("/updateAdmin")
    public String updateAdmin(Admin admin) {
        adminService.updateAdminByAdminAccount(admin);
        return "redirect:selAdmin";
    }



    //删除管理员
    @RequestMapping("/delAdmin")
    public String deleteEmployee(Integer adminAccount) {
        adminService.deleteByAdminAccount(adminAccount);
        return "redirect:selAdmin";

    }
//
//    //跳转员工修改页面
//    @RequestMapping("/toUpdateEmployee")
//    public String toUpdateEmployee(Integer employeeAccount, Model model) {
//        List<Employee> employeeList = employeeService.selectByEmployeeAccount(employeeAccount);
//        model.addAttribute("employeeList", employeeList);
//        return "updateEmployee";
//    }
//
//    //修改员工信息
//    @RequestMapping("/updateEmployee")
//    public String updateEmployee(Employee employee) {
//        employeeService.updateMemberByEmployeeAccount(employee);
//        return "redirect:selEmployee";
//    }



}
