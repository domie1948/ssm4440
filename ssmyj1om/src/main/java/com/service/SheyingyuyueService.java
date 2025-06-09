package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SheyingyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SheyingyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SheyingyuyueView;


/**
 * 摄影预约
 *
 * @author 
 * @email 
 * @date 2021-03-12 20:31:06
 */
public interface SheyingyuyueService extends IService<SheyingyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SheyingyuyueVO> selectListVO(Wrapper<SheyingyuyueEntity> wrapper);
   	
   	SheyingyuyueVO selectVO(@Param("ew") Wrapper<SheyingyuyueEntity> wrapper);
   	
   	List<SheyingyuyueView> selectListView(Wrapper<SheyingyuyueEntity> wrapper);
   	
   	SheyingyuyueView selectView(@Param("ew") Wrapper<SheyingyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SheyingyuyueEntity> wrapper);
   	
}

