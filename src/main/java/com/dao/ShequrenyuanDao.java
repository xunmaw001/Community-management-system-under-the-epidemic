package com.dao;

import com.entity.ShequrenyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShequrenyuanVO;
import com.entity.view.ShequrenyuanView;


/**
 * 社区人员
 * 
 * @author 
 * @email 
 * @date 2021-01-28 20:39:48
 */
public interface ShequrenyuanDao extends BaseMapper<ShequrenyuanEntity> {
	
	List<ShequrenyuanVO> selectListVO(@Param("ew") Wrapper<ShequrenyuanEntity> wrapper);
	
	ShequrenyuanVO selectVO(@Param("ew") Wrapper<ShequrenyuanEntity> wrapper);
	
	List<ShequrenyuanView> selectListView(@Param("ew") Wrapper<ShequrenyuanEntity> wrapper);

	List<ShequrenyuanView> selectListView(Pagination page,@Param("ew") Wrapper<ShequrenyuanEntity> wrapper);
	
	ShequrenyuanView selectView(@Param("ew") Wrapper<ShequrenyuanEntity> wrapper);
	
}
