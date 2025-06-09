package com.entity.model;

import com.entity.KepianxinshangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 客片欣赏
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-12 20:31:07
 */
public class KepianxinshangModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 套餐名称
	 */
	
	private String taocanmingcheng;
		
	/**
	 * 地点
	 */
	
	private String didian;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 摄影师
	 */
	
	private String sheyingshi;
		
	/**
	 * 化妆师
	 */
	
	private String huazhuangshi;
				
	
	/**
	 * 设置：套餐名称
	 */
	 
	public void setTaocanmingcheng(String taocanmingcheng) {
		this.taocanmingcheng = taocanmingcheng;
	}
	
	/**
	 * 获取：套餐名称
	 */
	public String getTaocanmingcheng() {
		return taocanmingcheng;
	}
				
	
	/**
	 * 设置：地点
	 */
	 
	public void setDidian(String didian) {
		this.didian = didian;
	}
	
	/**
	 * 获取：地点
	 */
	public String getDidian() {
		return didian;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：摄影师
	 */
	 
	public void setSheyingshi(String sheyingshi) {
		this.sheyingshi = sheyingshi;
	}
	
	/**
	 * 获取：摄影师
	 */
	public String getSheyingshi() {
		return sheyingshi;
	}
				
	
	/**
	 * 设置：化妆师
	 */
	 
	public void setHuazhuangshi(String huazhuangshi) {
		this.huazhuangshi = huazhuangshi;
	}
	
	/**
	 * 获取：化妆师
	 */
	public String getHuazhuangshi() {
		return huazhuangshi;
	}
			
}
