package com.dao;

import com.entity.DiscusssheyingtaocanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusssheyingtaocanVO;
import com.entity.view.DiscusssheyingtaocanView;


/**
 * 摄影套餐评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-12 20:31:07
 */
public interface DiscusssheyingtaocanDao extends BaseMapper<DiscusssheyingtaocanEntity> {
	
	List<DiscusssheyingtaocanVO> selectListVO(@Param("ew") Wrapper<DiscusssheyingtaocanEntity> wrapper);
	
	DiscusssheyingtaocanVO selectVO(@Param("ew") Wrapper<DiscusssheyingtaocanEntity> wrapper);
	
	List<DiscusssheyingtaocanView> selectListView(@Param("ew") Wrapper<DiscusssheyingtaocanEntity> wrapper);

	List<DiscusssheyingtaocanView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusssheyingtaocanEntity> wrapper);
	
	DiscusssheyingtaocanView selectView(@Param("ew") Wrapper<DiscusssheyingtaocanEntity> wrapper);
	
}
