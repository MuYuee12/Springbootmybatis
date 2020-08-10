package com.hwadee.springbootmybatis.mapper;

import com.hwadee.springbootmybatis.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserMapper {

    //查询
    @Select("select * from user")
    List<User> findAllUser();
    //插入
    @Insert("insert into user(unickname,upassword) value(#{unickname},#{upassword})")
    @Options(useGeneratedKeys= true,keyProperty = "uid")
    int addUser(User user);
    //更新
    @Update("update user set unickname=#{unickname},upassword=#{upassword} where uid = #{uid}")
    int updateUser(User user);
    //删除
    @Delete("delete from user where uid = #{uid}")
    int deleteUser(User user);
}
