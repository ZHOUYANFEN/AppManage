package com.saas.appmanage.Mapper;

import com.saas.appmanage.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AdminMapper {
    @Select("select * from admin where Account = #{Account}")
    Admin findByAccount(@Param("Account") String Account);

    @Select("select * from admin")
    List<Admin> query();

    @Select("select ID from admin where Account = #{account} and Password = #{account}")
    int findID(@Param("account") String account,
               @Param("password") String password);
}
