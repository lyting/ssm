package com.jiangcheng.mapper;

import com.jiangcheng.bean.Orders;
import com.jiangcheng.bean.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 类名称：OrdersMapper<br>
 * 类描述：<br>
 * 创建时间：2018年08月30日<br>
 *
 * @author jiangcheng
 * @version 1.0.0
 */
@Repository
public interface OrdersMapper {




    /**
     * 方式一：嵌套结果
     * select * from orders o,user u where o.user_id=u.id and o.id=#{id}
     * @param orderId
     * @return
     */
    //根据订单ID查询订单和用户信息
    public Orders selectOrderAndUserByOrderID(int orderId);



    /**
     * 方式二：嵌套查询
     * select * from order WHERE id=1;//得到user_id
     * select * from user WHERE id=1   //1 是上一个查询得到的user_id的值
     * @param userID
     * @return
     */
    //根据用户ID查询用户信息
    public User getUserByUserId(int userID);

    //得到订单信息(包含user_id)
    public List<Orders> getOrderByOrderId();

}
