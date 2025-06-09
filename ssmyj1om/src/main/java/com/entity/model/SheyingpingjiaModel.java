package com.entity.model;

import com.entity.SheyingpingjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 摄影评价
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-12 20:31:07
 */
public class SheyingpingjiaModel  implements Serializable {
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
	 * 服务评分
	 */
	
	private String fuwupingfen;
		
	/**
	 * 技术评分
	 */
	
	private String jishupingfen;
		
	/**
	 * 晒图
	 */
	
	private String shaitu;
		
	/**
	 * 整体评价
	 */
	
	private String zhengtipingjia;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
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
	 * 设置：服务评分
	 */
	 
	public void setFuwupingfen(String fuwupingfen) {
		this.fuwupingfen = fuwupingfen;
	}
	
	/**
	 * 获取：服务评分
	 */
	public String getFuwupingfen() {
		return fuwupingfen;
	}
				
	
	/**
	 * 设置：技术评分
	 */
	 
	public void setJishupingfen(String jishupingfen) {
		this.jishupingfen = jishupingfen;
	}
	
	/**
	 * 获取：技术评分
	 */
	public String getJishupingfen() {
		return jishupingfen;
	}
				
	
	/**
	 * 设置：晒图
	 */
	 
	public void setShaitu(String shaitu) {
		this.shaitu = shaitu;
	}
	
	/**
	 * 获取：晒图
	 */
	public String getShaitu() {
		return shaitu;
	}
				
	
	/**
	 * 设置：整体评价
	 */
	 
	public void setZhengtipingjia(String zhengtipingjia) {
		this.zhengtipingjia = zhengtipingjia;
	}
	
	/**
	 * 获取：整体评价
	 */
	public String getZhengtipingjia() {
		return zhengtipingjia;
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
