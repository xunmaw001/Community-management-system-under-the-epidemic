package com.dao;

import com.entity.YijianlanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YijianlanVO;
import com.entity.view.YijianlanView;


/**
 * 意见栏
 * 
 * @author 
 * @email 
 * @date 2021-01-28 20:39:48
 */
public interface YijianlanDao extends BaseMapper<YijianlanEntity> {
	
	List<YijianlanVO> selectListVO(@Param("ew") Wrapper<YijianlanEntity> wrapper);
	
	YijianlanVO selectVO(@Param("ew") Wrapper<YijianlanEntity> wrapper);
	
	List<YijianlanView> selectListView(@Param("ew") Wrapper<YijianlanEntity> wrapper);

	List<YijianlanView> selectListView(Pagination page,@Param("ew") Wrapper<YijianlanEntity> wrapper);
	
	YijianlanView selectView(@Param("ew") Wrapper<YijianlanEntity> wrapper);
	
}
