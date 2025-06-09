package com.entity.model;

import com.entity.SheyingyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 摄影预约
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-12 20:31:06
 */
public class SheyingyuyueModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 套餐编号
	 */
	
	private String taocanbianhao;
		
	/**
	 * 套餐名称
	 */
	
	private String taocanmingcheng;
		
	/**
	 * 套餐金额
	 */
	
	private String taocanjine;
		
	/**
	 * 预约地点
	 */
	
	private String yuyuedidian;
		
	/**
	 * 预约日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date yuyueriqi;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：套餐编号
	 */
	 
	public void setTaocanbianhao(String taocanbianhao) {
		this.taocanbianhao = taocanbianhao;
	}
	
	/**
	 * 获取：套餐编号
	 */
	public String getTaocanbianhao() {
		return taocanbianhao;
	}
				
	
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
	 * 设置：套餐金额
	 */
	 
	public void setTaocanjine(String taocanjine) {
		this.taocanjine = taocanjine;
	}
	
	/**
	 * 获取：套餐金额
	 */
	public String getTaocanjine() {
		return taocanjine;
	}
				
	
	/**
	 * 设置：预约地点
	 */
	 
	public void setYuyuedidian(String yuyuedidian) {
		this.yuyuedidian = yuyuedidian;
	}
	
	/**
	 * 获取：预约地点
	 */
	public String getYuyuedidian() {
		return yuyuedidian;
	}
				
	
	/**
	 * 设置：预约日期
	 */
	 
	public void setYuyueriqi(Date yuyueriqi) {
		this.yuyueriqi = yuyueriqi;
	}
	
	/**
	 * 获取：预约日期
	 */
	public Date getYuyueriqi() {
		return yuyueriqi;
	}
				
	
	/**
	 * 设置：用户名
	 */
	 
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
