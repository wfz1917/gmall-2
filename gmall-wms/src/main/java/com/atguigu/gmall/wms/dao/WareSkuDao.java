package com.atguigu.gmall.wms.dao;

import com.atguigu.gmall.wms.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author wfz
 * @email wfz@atguigu.com
 * @date 2019-12-03 01:45:46
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
