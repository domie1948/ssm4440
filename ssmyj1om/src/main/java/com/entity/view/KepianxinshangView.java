package com.entity.view;

import com.entity.KepianxinshangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 客片欣赏
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-12 20:31:07
 */
@TableName("kepianxinshang")
public class KepianxinshangView  extends KepianxinshangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KepianxinshangView(){
	}
 
 	public KepianxinshangView(KepianxinshangEntity kepianxinshangEntity){
 	try {
			BeanUtils.copyProperties(this, kepianxinshangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
