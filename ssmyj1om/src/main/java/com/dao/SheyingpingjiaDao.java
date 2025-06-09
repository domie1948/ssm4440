package com.dao;

import com.entity.SheyingpingjiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SheyingpingjiaVO;
import com.entity.view.SheyingpingjiaView;


/**
 * 摄影评价
 * 
 * @author 
 * @email 
 * @date 2021-03-12 20:31:07
 */
public interface SheyingpingjiaDao extends BaseMapper<SheyingpingjiaEntity> {
	
	List<SheyingpingjiaVO> selectListVO(@Param("ew") Wrapper<SheyingpingjiaEntity> wrapper);
	
	SheyingpingjiaVO selectVO(@Param("ew") Wrapper<SheyingpingjiaEntity> wrapper);
	
	List<SheyingpingjiaView> selectListView(@Param("ew") Wrapper<SheyingpingjiaEntity> wrapper);

	List<SheyingpingjiaView> selectListView(Pagination page,@Param("ew") Wrapper<SheyingpingjiaEntity> wrapper);
	
	SheyingpingjiaView selectView(@Param("ew") Wrapper<SheyingpingjiaEntity> wrapper);
	
}
