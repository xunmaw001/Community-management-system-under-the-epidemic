package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.YijianlanEntity;
import com.entity.view.YijianlanView;

import com.service.YijianlanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 意见栏
 * 后端接口
 * @author 
 * @email 
 * @date 2021-01-28 20:39:48
 */
@RestController
@RequestMapping("/yijianlan")
public class YijianlanController {
    @Autowired
    private YijianlanService yijianlanService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YijianlanEntity yijianlan, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			yijianlan.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<YijianlanEntity> ew = new EntityWrapper<YijianlanEntity>();
		PageUtils page = yijianlanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yijianlan), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YijianlanEntity yijianlan, HttpServletRequest request){
        EntityWrapper<YijianlanEntity> ew = new EntityWrapper<YijianlanEntity>();
		PageUtils page = yijianlanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yijianlan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YijianlanEntity yijianlan){
       	EntityWrapper<YijianlanEntity> ew = new EntityWrapper<YijianlanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yijianlan, "yijianlan")); 
        return R.ok().put("data", yijianlanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YijianlanEntity yijianlan){
        EntityWrapper< YijianlanEntity> ew = new EntityWrapper< YijianlanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yijianlan, "yijianlan")); 
		YijianlanView yijianlanView =  yijianlanService.selectView(ew);
		return R.ok("查询意见栏成功").put("data", yijianlanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YijianlanEntity yijianlan = yijianlanService.selectById(id);
        return R.ok().put("data", yijianlan);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YijianlanEntity yijianlan = yijianlanService.selectById(id);
        return R.ok().put("data", yijianlan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YijianlanEntity yijianlan, HttpServletRequest request){
    	yijianlan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yijianlan);

        yijianlanService.insert(yijianlan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YijianlanEntity yijianlan, HttpServletRequest request){
    	yijianlan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yijianlan);

        yijianlanService.insert(yijianlan);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody YijianlanEntity yijianlan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yijianlan);
        yijianlanService.updateById(yijianlan);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yijianlanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<YijianlanEntity> wrapper = new EntityWrapper<YijianlanEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = yijianlanService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
