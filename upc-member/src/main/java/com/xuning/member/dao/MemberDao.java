package com.xuning.member.dao;

import com.xuning.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author xuning
 * @email xuning@gmail.com
 * @date 2021-12-31 09:47:05
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
