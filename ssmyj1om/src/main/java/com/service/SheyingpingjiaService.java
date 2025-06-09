package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SheyingpingjiaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SheyingpingjiaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SheyingpingjiaView;


/**
 * 摄影评价
 *
 * @author 
 * @email 
 * @date 2021-03-12 20:31:07
 */
public interface SheyingpingjiaService extends IService<SheyingpingjiaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SheyingpingjiaVO> selectListVO(Wrapper<SheyingpingjiaEntity> wrapper);
   	
   	SheyingpingjiaVO selectVO(@Param("ew") Wrapper<SheyingpingjiaEntity> wrapper);
   	
   	List<SheyingpingjiaView> selectListView(Wrapper<SheyingpingjiaEntity> wrapper);
   	
   	SheyingpingjiaView selectView(@Param("ew") Wrapper<SheyingpingjiaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SheyingpingjiaEntity> wrapper);
   	
}

