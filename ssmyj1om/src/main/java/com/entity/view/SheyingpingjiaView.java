package com.entity.view;

import com.entity.SheyingpingjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 摄影评价
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-12 20:31:07
 */
@TableName("sheyingpingjia")
public class SheyingpingjiaView  extends SheyingpingjiaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public SheyingpingjiaView(){
	}
 
 	public SheyingpingjiaView(SheyingpingjiaEntity sheyingpingjiaEntity){
 	try {
			BeanUtils.copyProperties(this, sheyingpingjiaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
