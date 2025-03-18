package com.entity.vo;

import com.entity.JiankangdakaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 健康打卡
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-01-28 20:39:48
 */
public class JiankangdakaVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 体温
	 */
	
	private String tiwen;
		
	/**
	 * 身体是否不适
	 */
	
	private String shentishifoubushi;
		
	/**
	 * 体温是否正常
	 */
	
	private String tiwenshifouzhengchang;
		
	/**
	 * 家人中是否有人确诊新冠肺炎
	 */
	
	private String jiarenzhongshifouyourenquezhenxinguanfeiyan;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 登记时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjishijian;
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
				
	
	/**
	 * 设置：体温
	 */
	 
	public void setTiwen(String tiwen) {
		this.tiwen = tiwen;
	}
	
	/**
	 * 获取：体温
	 */
	public String getTiwen() {
		return tiwen;
	}
				
	
	/**
	 * 设置：身体是否不适
	 */
	 
	public void setShentishifoubushi(String shentishifoubushi) {
		this.shentishifoubushi = shentishifoubushi;
	}
	
	/**
	 * 获取：身体是否不适
	 */
	public String getShentishifoubushi() {
		return shentishifoubushi;
	}
				
	
	/**
	 * 设置：体温是否正常
	 */
	 
	public void setTiwenshifouzhengchang(String tiwenshifouzhengchang) {
		this.tiwenshifouzhengchang = tiwenshifouzhengchang;
	}
	
	/**
	 * 获取：体温是否正常
	 */
	public String getTiwenshifouzhengchang() {
		return tiwenshifouzhengchang;
	}
				
	
	/**
	 * 设置：家人中是否有人确诊新冠肺炎
	 */
	 
	public void setJiarenzhongshifouyourenquezhenxinguanfeiyan(String jiarenzhongshifouyourenquezhenxinguanfeiyan) {
		this.jiarenzhongshifouyourenquezhenxinguanfeiyan = jiarenzhongshifouyourenquezhenxinguanfeiyan;
	}
	
	/**
	 * 获取：家人中是否有人确诊新冠肺炎
	 */
	public String getJiarenzhongshifouyourenquezhenxinguanfeiyan() {
		return jiarenzhongshifouyourenquezhenxinguanfeiyan;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
				
	
	/**
	 * 设置：登记时间
	 */
	 
	public void setDengjishijian(Date dengjishijian) {
		this.dengjishijian = dengjishijian;
	}
	
	/**
	 * 获取：登记时间
	 */
	public Date getDengjishijian() {
		return dengjishijian;
	}
			
}
