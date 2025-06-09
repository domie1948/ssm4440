package com.dao;

import com.entity.DiscusskepianxinshangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusskepianxinshangVO;
import com.entity.view.DiscusskepianxinshangView;


/**
 * 客片欣赏评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-12 20:31:07
 */
public interface DiscusskepianxinshangDao extends BaseMapper<DiscusskepianxinshangEntity> {
	
	List<DiscusskepianxinshangVO> selectListVO(@Param("ew") Wrapper<DiscusskepianxinshangEntity> wrapper);
	
	DiscusskepianxinshangVO selectVO(@Param("ew") Wrapper<DiscusskepianxinshangEntity> wrapper);
	
	List<DiscusskepianxinshangView> selectListView(@Param("ew") Wrapper<DiscusskepianxinshangEntity> wrapper);

	List<DiscusskepianxinshangView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusskepianxinshangEntity> wrapper);
	
	DiscusskepianxinshangView selectView(@Param("ew") Wrapper<DiscusskepianxinshangEntity> wrapper);
	
}
