
package com.work.mall.dao;

import com.work.mall.entity.MallShoppingCartItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MallShoppingCartItemMapper {
    int deleteByPrimaryKey(Long cartItemId);

    int insert(MallShoppingCartItem record);

    int insertSelective(MallShoppingCartItem record);

    MallShoppingCartItem selectByPrimaryKey(Long cartItemId);

    MallShoppingCartItem selectByUserIdAndGoodsId(@Param("mallUserId") Long MallUserId, @Param("goodsId") Long goodsId);

    List<MallShoppingCartItem> selectByUserId(@Param("mallUserId") Long MallUserId, @Param("number") int number);

    int selectCountByUserId(Long mallUserId);

    int updateByPrimaryKeySelective(MallShoppingCartItem record);

    int updateByPrimaryKey(MallShoppingCartItem record);

    int deleteBatch(List<Long> ids);
}