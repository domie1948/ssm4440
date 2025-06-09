package com.entity.view;

import com.entity.SheyingtaocanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 摄影套餐
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-12 20:31:06
 */
@TableName("sheyingtaocan")
public class SheyingtaocanView  extends SheyingtaocanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public SheyingtaocanView(){
	}
 
 	public SheyingtaocanView(SheyingtaocanEntity sheyingtaocanEntity){
 	try {
			BeanUtils.copyProperties(this, sheyingtaocanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
