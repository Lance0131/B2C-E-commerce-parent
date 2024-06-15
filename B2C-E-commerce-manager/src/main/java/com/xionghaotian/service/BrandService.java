package com.xionghaotian.service;

import com.github.pagehelper.PageInfo;
import com.xionghaotian.entity.product.Brand;

import java.util.List;

/**
 * @ClassName BrandService
 * @Description 管理员端-商品管理-品牌管理-服务层接口
 * @Author XiongHaoTian
 * @Date 2024年06月14日 9:30
 * @Version 1.0
 */
public interface BrandService {
    public abstract PageInfo<Brand> findByPage(Integer pageNum, Integer pageSize);

    public abstract void saveBrand(Brand brand);

    public abstract void updateById(Brand brand);

    public abstract void deleteById(Long id);

    //分类品牌管理-查询所有品牌
    public abstract List<Brand> findAll();
}
