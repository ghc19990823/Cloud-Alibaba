package com.example.cloudalibabaseata2001.dao;

import com.example.cloudalibabaseata2001.domain.Order;
import org.apache.ibatis.annotations.*;
import org.mybatis.spring.annotation.MapperScan;

@Mapper
public interface OrderDao {

    /**
     * 1.新建订单
     * */
/*    @Insert("insert  into t_order(id,user_id,product_id,count,money,status) values (null,#{user_id},#{product_id},#{count},#{money},0)")
    void create(Order order);*/
    void create(Order order);


    /**
     * 2.修改订单状态
     * */
   /* @Update("update t_order set satus = 1 where user_id = #{userId} and status = #{status}")
    void update(@Param("userId") Long userId,@Param("status") Integer status);*/
    void update(@Param("userId") Long userId,@Param("status") Integer status);
}
