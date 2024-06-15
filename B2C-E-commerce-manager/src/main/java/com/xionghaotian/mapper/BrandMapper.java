package com.xionghaotian.mapper;

import com.xionghaotian.entity.product.Brand;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName BrandMapper
 * @Description 管理员端-商品管理-品牌管理-mapper接口
 * @Author XiongHaoTian
 * @Date 2024年06月14日 9:33
 * @Version 1.0
 */
@Mapper
public interface BrandMapper {
    public abstract List<Brand> findByPage();

    public abstract void saveBrand(Brand brand);

    public abstract void updateById(Brand brand);

    public abstract void deleteById(Long id);

    //分类品牌管理-查询所有品牌
    public abstract List<Brand> findAll();
}
