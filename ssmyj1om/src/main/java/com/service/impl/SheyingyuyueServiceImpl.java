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


import com.dao.SheyingyuyueDao;
import com.entity.SheyingyuyueEntity;
import com.service.SheyingyuyueService;
import com.entity.vo.SheyingyuyueVO;
import com.entity.view.SheyingyuyueView;

@Service("sheyingyuyueService")
public class SheyingyuyueServiceImpl extends ServiceImpl<SheyingyuyueDao, SheyingyuyueEntity> implements SheyingyuyueService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SheyingyuyueEntity> page = this.selectPage(
                new Query<SheyingyuyueEntity>(params).getPage(),
                new EntityWrapper<SheyingyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SheyingyuyueEntity> wrapper) {
		  Page<SheyingyuyueView> page =new Query<SheyingyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SheyingyuyueVO> selectListVO(Wrapper<SheyingyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SheyingyuyueVO selectVO(Wrapper<SheyingyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SheyingyuyueView> selectListView(Wrapper<SheyingyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SheyingyuyueView selectView(Wrapper<SheyingyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
