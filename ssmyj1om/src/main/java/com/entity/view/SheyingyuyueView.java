package com.entity.view;

import com.entity.SheyingyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 摄影预约
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-12 20:31:06
 */
@TableName("sheyingyuyue")
public class SheyingyuyueView  extends SheyingyuyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public SheyingyuyueView(){
	}
 
 	public SheyingyuyueView(SheyingyuyueEntity sheyingyuyueEntity){
 	try {
			BeanUtils.copyProperties(this, sheyingyuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
