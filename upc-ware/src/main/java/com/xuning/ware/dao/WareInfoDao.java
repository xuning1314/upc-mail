package com.xuning.ware.dao;

import com.xuning.ware.entity.WareInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 仓库信息
 * 
 * @author xuning
 * @email xuning@gmail.com
 * @date 2021-12-31 09:59:40
 */
@Mapper
public interface WareInfoDao extends BaseMapper<WareInfoEntity> {
	
}
