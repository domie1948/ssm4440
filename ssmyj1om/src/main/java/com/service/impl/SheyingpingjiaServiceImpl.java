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


import com.dao.SheyingpingjiaDao;
import com.entity.SheyingpingjiaEntity;
import com.service.SheyingpingjiaService;
import com.entity.vo.SheyingpingjiaVO;
import com.entity.view.SheyingpingjiaView;

@Service("sheyingpingjiaService")
public class SheyingpingjiaServiceImpl extends ServiceImpl<SheyingpingjiaDao, SheyingpingjiaEntity> implements SheyingpingjiaService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SheyingpingjiaEntity> page = this.selectPage(
                new Query<SheyingpingjiaEntity>(params).getPage(),
                new EntityWrapper<SheyingpingjiaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SheyingpingjiaEntity> wrapper) {
		  Page<SheyingpingjiaView> page =new Query<SheyingpingjiaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SheyingpingjiaVO> selectListVO(Wrapper<SheyingpingjiaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SheyingpingjiaVO selectVO(Wrapper<SheyingpingjiaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SheyingpingjiaView> selectListView(Wrapper<SheyingpingjiaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SheyingpingjiaView selectView(Wrapper<SheyingpingjiaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
