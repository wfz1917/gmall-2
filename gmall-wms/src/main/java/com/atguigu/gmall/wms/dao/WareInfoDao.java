package com.atguigu.gmall.wms.dao;

import com.atguigu.gmall.wms.entity.WareInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 仓库信息
 * 
 * @author wfz
 * @email wfz@atguigu.com
 * @date 2019-12-03 01:45:46
 */
@Mapper
public interface WareInfoDao extends BaseMapper<WareInfoEntity> {
	
}
