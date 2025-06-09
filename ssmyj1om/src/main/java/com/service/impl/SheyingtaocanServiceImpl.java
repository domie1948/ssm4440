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


import com.dao.SheyingtaocanDao;
import com.entity.SheyingtaocanEntity;
import com.service.SheyingtaocanService;
import com.entity.vo.SheyingtaocanVO;
import com.entity.view.SheyingtaocanView;

@Service("sheyingtaocanService")
public class SheyingtaocanServiceImpl extends ServiceImpl<SheyingtaocanDao, SheyingtaocanEntity> implements SheyingtaocanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SheyingtaocanEntity> page = this.selectPage(
                new Query<SheyingtaocanEntity>(params).getPage(),
                new EntityWrapper<SheyingtaocanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SheyingtaocanEntity> wrapper) {
		  Page<SheyingtaocanView> page =new Query<SheyingtaocanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SheyingtaocanVO> selectListVO(Wrapper<SheyingtaocanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SheyingtaocanVO selectVO(Wrapper<SheyingtaocanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SheyingtaocanView> selectListView(Wrapper<SheyingtaocanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SheyingtaocanView selectView(Wrapper<SheyingtaocanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
