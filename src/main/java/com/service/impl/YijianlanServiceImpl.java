package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YijianlanDao;
import com.entity.YijianlanEntity;
import com.service.YijianlanService;
import com.entity.vo.YijianlanVO;
import com.entity.view.YijianlanView;

@Service("yijianlanService")
public class YijianlanServiceImpl extends ServiceImpl<YijianlanDao, YijianlanEntity> implements YijianlanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YijianlanEntity> page = this.selectPage(
                new Query<YijianlanEntity>(params).getPage(),
                new EntityWrapper<YijianlanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YijianlanEntity> wrapper) {
		  Page<YijianlanView> page =new Query<YijianlanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YijianlanVO> selectListVO(Wrapper<YijianlanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YijianlanVO selectVO(Wrapper<YijianlanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YijianlanView> selectListView(Wrapper<YijianlanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YijianlanView selectView(Wrapper<YijianlanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
