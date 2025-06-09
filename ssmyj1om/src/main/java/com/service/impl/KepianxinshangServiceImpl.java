package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.KepianxinshangDao;
import com.entity.KepianxinshangEntity;
import com.service.KepianxinshangService;
import com.entity.vo.KepianxinshangVO;
import com.entity.view.KepianxinshangView;

@Service("kepianxinshangService")
public class KepianxinshangServiceImpl extends ServiceImpl<KepianxinshangDao, KepianxinshangEntity> implements KepianxinshangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KepianxinshangEntity> page = this.selectPage(
                new Query<KepianxinshangEntity>(params).getPage(),
                new EntityWrapper<KepianxinshangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KepianxinshangEntity> wrapper) {
		  Page<KepianxinshangView> page =new Query<KepianxinshangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KepianxinshangVO> selectListVO(Wrapper<KepianxinshangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KepianxinshangVO selectVO(Wrapper<KepianxinshangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KepianxinshangView> selectListView(Wrapper<KepianxinshangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KepianxinshangView selectView(Wrapper<KepianxinshangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
