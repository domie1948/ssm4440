package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusssheyingtaocanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusssheyingtaocanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusssheyingtaocanView;


/**
 * 摄影套餐评论表
 *
 * @author 
 * @email 
 * @date 2021-03-12 20:31:07
 */
public interface DiscusssheyingtaocanService extends IService<DiscusssheyingtaocanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusssheyingtaocanVO> selectListVO(Wrapper<DiscusssheyingtaocanEntity> wrapper);
   	
   	DiscusssheyingtaocanVO selectVO(@Param("ew") Wrapper<DiscusssheyingtaocanEntity> wrapper);
   	
   	List<DiscusssheyingtaocanView> selectListView(Wrapper<DiscusssheyingtaocanEntity> wrapper);
   	
   	DiscusssheyingtaocanView selectView(@Param("ew") Wrapper<DiscusssheyingtaocanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusssheyingtaocanEntity> wrapper);
   	
}

