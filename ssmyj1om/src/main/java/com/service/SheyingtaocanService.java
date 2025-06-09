package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SheyingtaocanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SheyingtaocanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SheyingtaocanView;


/**
 * 摄影套餐
 *
 * @author 
 * @email 
 * @date 2021-03-12 20:31:06
 */
public interface SheyingtaocanService extends IService<SheyingtaocanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SheyingtaocanVO> selectListVO(Wrapper<SheyingtaocanEntity> wrapper);
   	
   	SheyingtaocanVO selectVO(@Param("ew") Wrapper<SheyingtaocanEntity> wrapper);
   	
   	List<SheyingtaocanView> selectListView(Wrapper<SheyingtaocanEntity> wrapper);
   	
   	SheyingtaocanView selectView(@Param("ew") Wrapper<SheyingtaocanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SheyingtaocanEntity> wrapper);
   	
}

