package com.dao;

import com.entity.SheyingdinggouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SheyingdinggouVO;
import com.entity.view.SheyingdinggouView;


/**
 * 摄影订购
 * 
 * @author 
 * @email 
 * @date 2021-03-12 20:31:06
 */
public interface SheyingdinggouDao extends BaseMapper<SheyingdinggouEntity> {
	
	List<SheyingdinggouVO> selectListVO(@Param("ew") Wrapper<SheyingdinggouEntity> wrapper);
	
	SheyingdinggouVO selectVO(@Param("ew") Wrapper<SheyingdinggouEntity> wrapper);
	
	List<SheyingdinggouView> selectListView(@Param("ew") Wrapper<SheyingdinggouEntity> wrapper);

	List<SheyingdinggouView> selectListView(Pagination page,@Param("ew") Wrapper<SheyingdinggouEntity> wrapper);
	
	SheyingdinggouView selectView(@Param("ew") Wrapper<SheyingdinggouEntity> wrapper);
	
}
