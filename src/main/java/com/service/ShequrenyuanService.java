package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShequrenyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShequrenyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShequrenyuanView;


/**
 * 社区人员
 *
 * @author 
 * @email 
 * @date 2021-01-28 20:39:48
 */
public interface ShequrenyuanService extends IService<ShequrenyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShequrenyuanVO> selectListVO(Wrapper<ShequrenyuanEntity> wrapper);
   	
   	ShequrenyuanVO selectVO(@Param("ew") Wrapper<ShequrenyuanEntity> wrapper);
   	
   	List<ShequrenyuanView> selectListView(Wrapper<ShequrenyuanEntity> wrapper);
   	
   	ShequrenyuanView selectView(@Param("ew") Wrapper<ShequrenyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShequrenyuanEntity> wrapper);
   	
}

