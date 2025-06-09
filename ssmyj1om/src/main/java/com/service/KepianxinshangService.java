package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KepianxinshangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KepianxinshangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KepianxinshangView;


/**
 * 客片欣赏
 *
 * @author 
 * @email 
 * @date 2021-03-12 20:31:07
 */
public interface KepianxinshangService extends IService<KepianxinshangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KepianxinshangVO> selectListVO(Wrapper<KepianxinshangEntity> wrapper);
   	
   	KepianxinshangVO selectVO(@Param("ew") Wrapper<KepianxinshangEntity> wrapper);
   	
   	List<KepianxinshangView> selectListView(Wrapper<KepianxinshangEntity> wrapper);
   	
   	KepianxinshangView selectView(@Param("ew") Wrapper<KepianxinshangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KepianxinshangEntity> wrapper);
   	
}

