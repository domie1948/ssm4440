package com.dao;

import com.entity.SheyingyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SheyingyuyueVO;
import com.entity.view.SheyingyuyueView;


/**
 * 摄影预约
 * 
 * @author 
 * @email 
 * @date 2021-03-12 20:31:06
 */
public interface SheyingyuyueDao extends BaseMapper<SheyingyuyueEntity> {
	
	List<SheyingyuyueVO> selectListVO(@Param("ew") Wrapper<SheyingyuyueEntity> wrapper);
	
	SheyingyuyueVO selectVO(@Param("ew") Wrapper<SheyingyuyueEntity> wrapper);
	
	List<SheyingyuyueView> selectListView(@Param("ew") Wrapper<SheyingyuyueEntity> wrapper);

	List<SheyingyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<SheyingyuyueEntity> wrapper);
	
	SheyingyuyueView selectView(@Param("ew") Wrapper<SheyingyuyueEntity> wrapper);
	
}
