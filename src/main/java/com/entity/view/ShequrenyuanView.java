package com.entity.view;

import com.entity.ShequrenyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 社区人员
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-28 20:39:48
 */
@TableName("shequrenyuan")
public class ShequrenyuanView  extends ShequrenyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShequrenyuanView(){
	}
 
 	public ShequrenyuanView(ShequrenyuanEntity shequrenyuanEntity){
 	try {
			BeanUtils.copyProperties(this, shequrenyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
