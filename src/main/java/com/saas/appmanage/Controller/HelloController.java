package com.saas.appmanage.Controller;

import com.saas.appmanage.JsonResult;
import com.saas.appmanage.Mapper.AdminMapper;
import com.saas.appmanage.StatusCode;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.logging.Logger;

@Controller
public class HelloController {

    //主页
    @RequestMapping(value = "/index")
    public String index(){
        return "index";
    }

    //管理员登录
    @RequestMapping(value = "/admin/login")
    public String adminLogin(){
        return "admin/adminLogin";
    }

    //管理员管理
    @RequestMapping(value = "/admin/manage")
    public String companyManage(){
        return "admin/adminManage";
    }

    //开发商登录
    @RequestMapping(value = "/company/login")
    public String companyLogin(){
        return "company/companyLogin";
    }

    //开发商注册
    @RequestMapping(value = "/company/register")
    public String companyRegister(){
        return "company/companyRegister";
    }

    @RequestMapping(value = "/company/registerapp")
    public String companyRegisterApp(){
        return "company/RegisterApp";
    }

    //应用列表
    @RequestMapping(value = "/apps")
    public String showApps(){
        return "app/appCatagory";
    }

    //开发商管理
    @RequestMapping(value = "/company/manage")
    public String companyManage(Model model, @RequestParam("cpy_id") int cpyid){
        model.addAttribute("cpy_id",cpyid);
        return "company/RegisterApp";
    }

    //搜索应用
    @RequestMapping(value = "/appsearch")
    public String searchApp(Model model,@RequestParam("qw") String qw){
        model.addAttribute("queryword",qw);
        return "app/appCatagory";
    }

    //应用详情
    @RequestMapping(value = "/app")
    public String application(Model model,@RequestParam(value = "app_id",defaultValue = "0") int appid){
        model.addAttribute("app_id",appid);
        return "app/application";
    }
}
