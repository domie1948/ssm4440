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


import com.dao.DiscusskepianxinshangDao;
import com.entity.DiscusskepianxinshangEntity;
import com.service.DiscusskepianxinshangService;
import com.entity.vo.DiscusskepianxinshangVO;
import com.entity.view.DiscusskepianxinshangView;

@Service("discusskepianxinshangService")
public class DiscusskepianxinshangServiceImpl extends ServiceImpl<DiscusskepianxinshangDao, DiscusskepianxinshangEntity> implements DiscusskepianxinshangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusskepianxinshangEntity> page = this.selectPage(
                new Query<DiscusskepianxinshangEntity>(params).getPage(),
                new EntityWrapper<DiscusskepianxinshangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusskepianxinshangEntity> wrapper) {
		  Page<DiscusskepianxinshangView> page =new Query<DiscusskepianxinshangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusskepianxinshangVO> selectListVO(Wrapper<DiscusskepianxinshangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusskepianxinshangVO selectVO(Wrapper<DiscusskepianxinshangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusskepianxinshangView> selectListView(Wrapper<DiscusskepianxinshangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusskepianxinshangView selectView(Wrapper<DiscusskepianxinshangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
