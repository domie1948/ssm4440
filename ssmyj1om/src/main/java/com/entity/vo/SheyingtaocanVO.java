package com.entity.vo;

import com.entity.SheyingtaocanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 摄影套餐
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-12 20:31:06
 */
public class SheyingtaocanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 套餐名称
	 */
	
	private String taocanmingcheng;
		
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 系列
	 */
	
	private String xilie;
		
	/**
	 * 标签
	 */
	
	private String biaoqian;
		
	/**
	 * 套餐金额
	 */
	
	private Integer taocanjine;
		
	/**
	 * 拍摄地点
	 */
	
	private String paishedidian;
		
	/**
	 * 套餐详情
	 */
	
	private String taocanxiangqing;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
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
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：系列
	 */
	 
	public void setXilie(String xilie) {
		this.xilie = xilie;
	}
	
	/**
	 * 获取：系列
	 */
	public String getXilie() {
		return xilie;
	}
				
	
	/**
	 * 设置：标签
	 */
	 
	public void setBiaoqian(String biaoqian) {
		this.biaoqian = biaoqian;
	}
	
	/**
	 * 获取：标签
	 */
	public String getBiaoqian() {
		return biaoqian;
	}
				
	
	/**
	 * 设置：套餐金额
	 */
	 
	public void setTaocanjine(Integer taocanjine) {
		this.taocanjine = taocanjine;
	}
	
	/**
	 * 获取：套餐金额
	 */
	public Integer getTaocanjine() {
		return taocanjine;
	}
				
	
	/**
	 * 设置：拍摄地点
	 */
	 
	public void setPaishedidian(String paishedidian) {
		this.paishedidian = paishedidian;
	}
	
	/**
	 * 获取：拍摄地点
	 */
	public String getPaishedidian() {
		return paishedidian;
	}
				
	
	/**
	 * 设置：套餐详情
	 */
	 
	public void setTaocanxiangqing(String taocanxiangqing) {
		this.taocanxiangqing = taocanxiangqing;
	}
	
	/**
	 * 获取：套餐详情
	 */
	public String getTaocanxiangqing() {
		return taocanxiangqing;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
