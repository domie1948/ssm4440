package com.entity.view;

import com.entity.SheyingdinggouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 摄影订购
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-12 20:31:06
 */
@TableName("sheyingdinggou")
public class SheyingdinggouView  extends SheyingdinggouEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public SheyingdinggouView(){
	}
 
 	public SheyingdinggouView(SheyingdinggouEntity sheyingdinggouEntity){
 	try {
			BeanUtils.copyProperties(this, sheyingdinggouEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
