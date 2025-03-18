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


import com.dao.ShequrenyuanDao;
import com.entity.ShequrenyuanEntity;
import com.service.ShequrenyuanService;
import com.entity.vo.ShequrenyuanVO;
import com.entity.view.ShequrenyuanView;

@Service("shequrenyuanService")
public class ShequrenyuanServiceImpl extends ServiceImpl<ShequrenyuanDao, ShequrenyuanEntity> implements ShequrenyuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShequrenyuanEntity> page = this.selectPage(
                new Query<ShequrenyuanEntity>(params).getPage(),
                new EntityWrapper<ShequrenyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShequrenyuanEntity> wrapper) {
		  Page<ShequrenyuanView> page =new Query<ShequrenyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShequrenyuanVO> selectListVO(Wrapper<ShequrenyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShequrenyuanVO selectVO(Wrapper<ShequrenyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShequrenyuanView> selectListView(Wrapper<ShequrenyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShequrenyuanView selectView(Wrapper<ShequrenyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
