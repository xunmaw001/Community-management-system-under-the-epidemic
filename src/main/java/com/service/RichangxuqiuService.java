package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RichangxuqiuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RichangxuqiuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RichangxuqiuView;


/**
 * 日常需求
 *
 * @author 
 * @email 
 * @date 2021-01-28 20:39:48
 */
public interface RichangxuqiuService extends IService<RichangxuqiuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RichangxuqiuVO> selectListVO(Wrapper<RichangxuqiuEntity> wrapper);
   	
   	RichangxuqiuVO selectVO(@Param("ew") Wrapper<RichangxuqiuEntity> wrapper);
   	
   	List<RichangxuqiuView> selectListView(Wrapper<RichangxuqiuEntity> wrapper);
   	
   	RichangxuqiuView selectView(@Param("ew") Wrapper<RichangxuqiuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RichangxuqiuEntity> wrapper);
   	
}

