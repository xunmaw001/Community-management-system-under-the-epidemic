package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YijianlanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YijianlanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YijianlanView;


/**
 * 意见栏
 *
 * @author 
 * @email 
 * @date 2021-01-28 20:39:48
 */
public interface YijianlanService extends IService<YijianlanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YijianlanVO> selectListVO(Wrapper<YijianlanEntity> wrapper);
   	
   	YijianlanVO selectVO(@Param("ew") Wrapper<YijianlanEntity> wrapper);
   	
   	List<YijianlanView> selectListView(Wrapper<YijianlanEntity> wrapper);
   	
   	YijianlanView selectView(@Param("ew") Wrapper<YijianlanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YijianlanEntity> wrapper);
   	
}

