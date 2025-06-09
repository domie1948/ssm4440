package com.dao;

import com.entity.TaocanxilieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TaocanxilieVO;
import com.entity.view.TaocanxilieView;


/**
 * 套餐系列
 * 
 * @author 
 * @email 
 * @date 2021-03-12 20:31:06
 */
public interface TaocanxilieDao extends BaseMapper<TaocanxilieEntity> {
	
	List<TaocanxilieVO> selectListVO(@Param("ew") Wrapper<TaocanxilieEntity> wrapper);
	
	TaocanxilieVO selectVO(@Param("ew") Wrapper<TaocanxilieEntity> wrapper);
	
	List<TaocanxilieView> selectListView(@Param("ew") Wrapper<TaocanxilieEntity> wrapper);

	List<TaocanxilieView> selectListView(Pagination page,@Param("ew") Wrapper<TaocanxilieEntity> wrapper);
	
	TaocanxilieView selectView(@Param("ew") Wrapper<TaocanxilieEntity> wrapper);
	
}
