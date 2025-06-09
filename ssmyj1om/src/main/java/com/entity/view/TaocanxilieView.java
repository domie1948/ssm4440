package com.entity.view;

import com.entity.TaocanxilieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 套餐系列
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-12 20:31:06
 */
@TableName("taocanxilie")
public class TaocanxilieView  extends TaocanxilieEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TaocanxilieView(){
	}
 
 	public TaocanxilieView(TaocanxilieEntity taocanxilieEntity){
 	try {
			BeanUtils.copyProperties(this, taocanxilieEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
