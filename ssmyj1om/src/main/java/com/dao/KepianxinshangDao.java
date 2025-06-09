package com.dao;

import com.entity.KepianxinshangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KepianxinshangVO;
import com.entity.view.KepianxinshangView;


/**
 * 客片欣赏
 * 
 * @author 
 * @email 
 * @date 2021-03-12 20:31:07
 */
public interface KepianxinshangDao extends BaseMapper<KepianxinshangEntity> {
	
	List<KepianxinshangVO> selectListVO(@Param("ew") Wrapper<KepianxinshangEntity> wrapper);
	
	KepianxinshangVO selectVO(@Param("ew") Wrapper<KepianxinshangEntity> wrapper);
	
	List<KepianxinshangView> selectListView(@Param("ew") Wrapper<KepianxinshangEntity> wrapper);

	List<KepianxinshangView> selectListView(Pagination page,@Param("ew") Wrapper<KepianxinshangEntity> wrapper);
	
	KepianxinshangView selectView(@Param("ew") Wrapper<KepianxinshangEntity> wrapper);
	
}
