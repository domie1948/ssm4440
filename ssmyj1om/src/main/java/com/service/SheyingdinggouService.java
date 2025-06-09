package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SheyingdinggouEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SheyingdinggouVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SheyingdinggouView;


/**
 * 摄影订购
 *
 * @author 
 * @email 
 * @date 2021-03-12 20:31:06
 */
public interface SheyingdinggouService extends IService<SheyingdinggouEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SheyingdinggouVO> selectListVO(Wrapper<SheyingdinggouEntity> wrapper);
   	
   	SheyingdinggouVO selectVO(@Param("ew") Wrapper<SheyingdinggouEntity> wrapper);
   	
   	List<SheyingdinggouView> selectListView(Wrapper<SheyingdinggouEntity> wrapper);
   	
   	SheyingdinggouView selectView(@Param("ew") Wrapper<SheyingdinggouEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SheyingdinggouEntity> wrapper);
   	
}

