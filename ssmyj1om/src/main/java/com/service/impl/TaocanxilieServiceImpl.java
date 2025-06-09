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


import com.dao.TaocanxilieDao;
import com.entity.TaocanxilieEntity;
import com.service.TaocanxilieService;
import com.entity.vo.TaocanxilieVO;
import com.entity.view.TaocanxilieView;

@Service("taocanxilieService")
public class TaocanxilieServiceImpl extends ServiceImpl<TaocanxilieDao, TaocanxilieEntity> implements TaocanxilieService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TaocanxilieEntity> page = this.selectPage(
                new Query<TaocanxilieEntity>(params).getPage(),
                new EntityWrapper<TaocanxilieEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TaocanxilieEntity> wrapper) {
		  Page<TaocanxilieView> page =new Query<TaocanxilieView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TaocanxilieVO> selectListVO(Wrapper<TaocanxilieEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TaocanxilieVO selectVO(Wrapper<TaocanxilieEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TaocanxilieView> selectListView(Wrapper<TaocanxilieEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TaocanxilieView selectView(Wrapper<TaocanxilieEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
