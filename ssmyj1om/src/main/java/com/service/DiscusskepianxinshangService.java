package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusskepianxinshangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusskepianxinshangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusskepianxinshangView;


/**
 * 客片欣赏评论表
 *
 * @author 
 * @email 
 * @date 2021-03-12 20:31:07
 */
public interface DiscusskepianxinshangService extends IService<DiscusskepianxinshangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusskepianxinshangVO> selectListVO(Wrapper<DiscusskepianxinshangEntity> wrapper);
   	
   	DiscusskepianxinshangVO selectVO(@Param("ew") Wrapper<DiscusskepianxinshangEntity> wrapper);
   	
   	List<DiscusskepianxinshangView> selectListView(Wrapper<DiscusskepianxinshangEntity> wrapper);
   	
   	DiscusskepianxinshangView selectView(@Param("ew") Wrapper<DiscusskepianxinshangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusskepianxinshangEntity> wrapper);
   	
}

