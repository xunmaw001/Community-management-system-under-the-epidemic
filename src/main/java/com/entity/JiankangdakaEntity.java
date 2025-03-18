package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 健康打卡
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-01-28 20:39:48
 */
@TableName("jiankangdaka")
public class JiankangdakaEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiankangdakaEntity() {
		
	}
	
	public JiankangdakaEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 用户账号
	 */
					
	private String yonghuzhanghao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：用户账号
	 */
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
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
