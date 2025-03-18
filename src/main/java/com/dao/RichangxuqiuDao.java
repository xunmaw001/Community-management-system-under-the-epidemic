package com.dao;

import com.entity.RichangxuqiuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RichangxuqiuVO;
import com.entity.view.RichangxuqiuView;


/**
 * 日常需求
 * 
 * @author 
 * @email 
 * @date 2021-01-28 20:39:48
 */
public interface RichangxuqiuDao extends BaseMapper<RichangxuqiuEntity> {
	
	List<RichangxuqiuVO> selectListVO(@Param("ew") Wrapper<RichangxuqiuEntity> wrapper);
	
	RichangxuqiuVO selectVO(@Param("ew") Wrapper<RichangxuqiuEntity> wrapper);
	
	List<RichangxuqiuView> selectListView(@Param("ew") Wrapper<RichangxuqiuEntity> wrapper);

	List<RichangxuqiuView> selectListView(Pagination page,@Param("ew") Wrapper<RichangxuqiuEntity> wrapper);
	
	RichangxuqiuView selectView(@Param("ew") Wrapper<RichangxuqiuEntity> wrapper);
	
}
