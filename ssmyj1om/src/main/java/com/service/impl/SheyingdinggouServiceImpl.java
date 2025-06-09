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


import com.dao.SheyingdinggouDao;
import com.entity.SheyingdinggouEntity;
import com.service.SheyingdinggouService;
import com.entity.vo.SheyingdinggouVO;
import com.entity.view.SheyingdinggouView;

@Service("sheyingdinggouService")
public class SheyingdinggouServiceImpl extends ServiceImpl<SheyingdinggouDao, SheyingdinggouEntity> implements SheyingdinggouService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SheyingdinggouEntity> page = this.selectPage(
                new Query<SheyingdinggouEntity>(params).getPage(),
                new EntityWrapper<SheyingdinggouEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SheyingdinggouEntity> wrapper) {
		  Page<SheyingdinggouView> page =new Query<SheyingdinggouView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SheyingdinggouVO> selectListVO(Wrapper<SheyingdinggouEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SheyingdinggouVO selectVO(Wrapper<SheyingdinggouEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SheyingdinggouView> selectListView(Wrapper<SheyingdinggouEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SheyingdinggouView selectView(Wrapper<SheyingdinggouEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
