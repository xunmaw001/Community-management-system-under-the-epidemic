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


import com.dao.RichangxuqiuDao;
import com.entity.RichangxuqiuEntity;
import com.service.RichangxuqiuService;
import com.entity.vo.RichangxuqiuVO;
import com.entity.view.RichangxuqiuView;

@Service("richangxuqiuService")
public class RichangxuqiuServiceImpl extends ServiceImpl<RichangxuqiuDao, RichangxuqiuEntity> implements RichangxuqiuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RichangxuqiuEntity> page = this.selectPage(
                new Query<RichangxuqiuEntity>(params).getPage(),
                new EntityWrapper<RichangxuqiuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RichangxuqiuEntity> wrapper) {
		  Page<RichangxuqiuView> page =new Query<RichangxuqiuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RichangxuqiuVO> selectListVO(Wrapper<RichangxuqiuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RichangxuqiuVO selectVO(Wrapper<RichangxuqiuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RichangxuqiuView> selectListView(Wrapper<RichangxuqiuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RichangxuqiuView selectView(Wrapper<RichangxuqiuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
