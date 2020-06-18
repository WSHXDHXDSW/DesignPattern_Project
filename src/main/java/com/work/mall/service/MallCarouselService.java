
package com.work.mall.service;

import com.work.mall.entity.Carousel;
import com.work.mall.util.PageQueryUtil;
import com.work.mall.util.PageResult;
import com.work.mall.controller.vo.MallIndexCarouselVO;

import java.util.List;

public interface MallCarouselService {
    /**
     * 后台分页
     *
     * @param pageUtil
     * @return
     */
    PageResult getCarouselPage(PageQueryUtil pageUtil);

    String saveCarousel(Carousel carousel);

    String updateCarousel(Carousel carousel);

    Carousel getCarouselById(Integer id);

    Boolean deleteBatch(Integer[] ids);

    /**
     * 返回固定数量的轮播图对象(首页调用)
     *
     * @param number
     * @return
     */
    List<MallIndexCarouselVO> getCarouselsForIndex(int number);
}
