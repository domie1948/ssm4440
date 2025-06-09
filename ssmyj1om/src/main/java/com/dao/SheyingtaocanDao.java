package com.dao;

import com.entity.SheyingtaocanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SheyingtaocanVO;
import com.entity.view.SheyingtaocanView;


/**
 * 摄影套餐
 * 
 * @author 
 * @email 
 * @date 2021-03-12 20:31:06
 */
public interface SheyingtaocanDao extends BaseMapper<SheyingtaocanEntity> {
	
	List<SheyingtaocanVO> selectListVO(@Param("ew") Wrapper<SheyingtaocanEntity> wrapper);
	
	SheyingtaocanVO selectVO(@Param("ew") Wrapper<SheyingtaocanEntity> wrapper);
	
	List<SheyingtaocanView> selectListView(@Param("ew") Wrapper<SheyingtaocanEntity> wrapper);

	List<SheyingtaocanView> selectListView(Pagination page,@Param("ew") Wrapper<SheyingtaocanEntity> wrapper);
	
	SheyingtaocanView selectView(@Param("ew") Wrapper<SheyingtaocanEntity> wrapper);
	
}
