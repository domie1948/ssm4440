package com.entity.view;

import com.entity.DiscusskepianxinshangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 客片欣赏评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-12 20:31:07
 */
@TableName("discusskepianxinshang")
public class DiscusskepianxinshangView  extends DiscusskepianxinshangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusskepianxinshangView(){
	}
 
 	public DiscusskepianxinshangView(DiscusskepianxinshangEntity discusskepianxinshangEntity){
 	try {
			BeanUtils.copyProperties(this, discusskepianxinshangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
