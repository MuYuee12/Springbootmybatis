//package com.hwadee.springbootmybatis.test;
//
//import com.hwadee.springbootmybatis.entity.User;
//import com.hwadee.springbootmybatis.service.UserService;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.List;
//
//@SpringBootTest
//public class MybatisTest {
//    @Autowired
//    private UserService userService;
//
//    @Test
//    public void test01(){
//        List<User> userList = userService.findAllUser();
//        System.out.println("查询到的所有用户为"+userList.size()+"条");
//    }
//    @Test
//    public void test02(){
//        User user = new User();
//        user.setUnickname("TheShy");
//        user.setUpassword("sysroot");
//        userService.addUser(user);
//    }
//    @Test
//    public void test03(){
//        User user = new User();
//        user.setUid(4);
//        user.setUnickname("Ning");
//        user.setUpassword("sysroot");
//        userService.updateUser(user);
//    }
//    @Test
//    public void test04(){
//        User user = new User();
//        user.setUid(6);
//        userService.deleteUser(user);
//    }
//}
