
package com.work.mall.service;

import com.work.mall.controller.vo.MallOrderItemVO;
import com.work.mall.entity.MallOrder;
import com.work.mall.util.PageQueryUtil;
import com.work.mall.util.PageResult;
import com.work.mall.controller.vo.MallOrderDetailVO;
import com.work.mall.controller.vo.MallShoppingCartItemVO;
import com.work.mall.controller.vo.MallUserVO;

import java.util.List;

public interface MallOrderService {
    /**
     * 后台分页
     *
     * @param pageUtil
     * @return
     */
    PageResult getMallOrdersPage(PageQueryUtil pageUtil);

    /**
     * 订单信息修改
     *
     * @param mallOrder
     * @return
     */
    String updateOrderInfo(MallOrder mallOrder);

    /**
     * 配货
     *
     * @param ids
     * @return
     */
    String checkDone(Long[] ids);

    /**
     * 出库
     *
     * @param ids
     * @return
     */
    String checkOut(Long[] ids);

    /**
     * 关闭订单
     *
     * @param ids
     * @return
     */
    String closeOrder(Long[] ids);

    /**
     * 保存订单
     *
     * @param user
     * @param myShoppingCartItems
     * @return
     */
    String saveOrder(MallUserVO user, List<MallShoppingCartItemVO> myShoppingCartItems);

    /**
     * 获取订单详情
     *
     * @param orderNo
     * @param userId
     * @return
     */
    MallOrderDetailVO getOrderDetailByOrderNo(String orderNo, Long userId);

    /**
     * 获取订单详情
     *
     * @param orderNo
     * @return
     */
    MallOrder getMallOrderByOrderNo(String orderNo);

    /**
     * 我的订单列表
     *
     * @param pageUtil
     * @return
     */
    PageResult getMyOrders(PageQueryUtil pageUtil);

    /**
     * 手动取消订单
     *
     * @param orderNo
     * @param userId
     * @return
     */
    String cancelOrder(String orderNo, Long userId);

    /**
     * 确认收货
     *
     * @param orderNo
     * @param userId
     * @return
     */
    String finishOrder(String orderNo, Long userId);

    String paySuccess(String orderNo, int payType);

    List<MallOrderItemVO> getOrderItems(Long id);
}
