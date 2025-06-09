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


import com.dao.DiscusssheyingtaocanDao;
import com.entity.DiscusssheyingtaocanEntity;
import com.service.DiscusssheyingtaocanService;
import com.entity.vo.DiscusssheyingtaocanVO;
import com.entity.view.DiscusssheyingtaocanView;

@Service("discusssheyingtaocanService")
public class DiscusssheyingtaocanServiceImpl extends ServiceImpl<DiscusssheyingtaocanDao, DiscusssheyingtaocanEntity> implements DiscusssheyingtaocanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusssheyingtaocanEntity> page = this.selectPage(
                new Query<DiscusssheyingtaocanEntity>(params).getPage(),
                new EntityWrapper<DiscusssheyingtaocanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusssheyingtaocanEntity> wrapper) {
		  Page<DiscusssheyingtaocanView> page =new Query<DiscusssheyingtaocanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusssheyingtaocanVO> selectListVO(Wrapper<DiscusssheyingtaocanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusssheyingtaocanVO selectVO(Wrapper<DiscusssheyingtaocanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusssheyingtaocanView> selectListView(Wrapper<DiscusssheyingtaocanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusssheyingtaocanView selectView(Wrapper<DiscusssheyingtaocanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
