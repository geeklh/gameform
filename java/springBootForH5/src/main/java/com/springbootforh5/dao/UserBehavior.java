package com.springbootforh5.dao;

import com.springbootforh5.model.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserBehavior {
//    userlist
//    增
//    添加用户信息
    @Insert(value = "insert into userlist(username, age, pass, reward) values(#{username}, #{age}, #{pass}, #{reward})")
    @Options(useGeneratedKeys = true, keyProperty = "username", keyColumn = "username")
    void addUser(User user);
//    删
//    删除用户
    @Delete(value = "delete from userlist where id = #{id}")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    void deleteUser(User user);
//    改
//    更新用户的通关记录和获取的奖励
    @Update(value = "update `userlist` set `pass` = #{pass}, `reward` = #{reward} where `id` = #{id}")
    void updateUserPassAndreward(User user);

//    更新用户的通关记录
    @Update(value = "update `userlist` set `pass` = #{pass} where `id` = #{id}")
    void updateUserPass(User user);

//    更新用户获取的奖励
    @Update(value = "update `userlist` set `reward` = #{reward} where `id` = #{id}")
    void updateReward(User user);

//    查
//    查询用户的信息
    @Select(value = "select * from uselist where id = #{id}")
    @Results({@Result(property = "id", column = "id")})
    User findUserinfo(User user);

//    查询用户姓名
    @Select(value = "select username from userlist where id = #{id}")
    @Results({@Result(property = "id", column = "id")})
    User findUserName(@Param("id") int id);

//    查询用户的通关信息和获取的奖励
    @Select(value = "select pass reward from userlist where id = #{id}")
    @Results({@Result(property = "id", column = "id")})
    User findUserPassAndreward(@Param("id") int id);

//    查询用户的通关信息
    @Select(value = "select pass from userlist where id = #{id}")
    @Results({@Result(property = "id", column = "id")})
    User findUserPass(@Param("id") int id);

//    查询用户获取的奖励
    @Select(value = "select reward from userlist where id = #{id}")
    @Results({@Result(property = "id", column = "id")})
    User findUserReward(@Param("id") int id);
}
