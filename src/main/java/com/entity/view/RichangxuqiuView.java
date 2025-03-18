package com.entity.view;

import com.entity.RichangxuqiuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 日常需求
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-28 20:39:48
 */
@TableName("richangxuqiu")
public class RichangxuqiuView  extends RichangxuqiuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public RichangxuqiuView(){
	}
 
 	public RichangxuqiuView(RichangxuqiuEntity richangxuqiuEntity){
 	try {
			BeanUtils.copyProperties(this, richangxuqiuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
