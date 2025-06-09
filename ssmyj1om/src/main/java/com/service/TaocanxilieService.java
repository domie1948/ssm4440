package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TaocanxilieEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TaocanxilieVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TaocanxilieView;


/**
 * 套餐系列
 *
 * @author 
 * @email 
 * @date 2021-03-12 20:31:06
 */
public interface TaocanxilieService extends IService<TaocanxilieEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TaocanxilieVO> selectListVO(Wrapper<TaocanxilieEntity> wrapper);
   	
   	TaocanxilieVO selectVO(@Param("ew") Wrapper<TaocanxilieEntity> wrapper);
   	
   	List<TaocanxilieView> selectListView(Wrapper<TaocanxilieEntity> wrapper);
   	
   	TaocanxilieView selectView(@Param("ew") Wrapper<TaocanxilieEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TaocanxilieEntity> wrapper);
   	
}

