package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.KaoqinbiaoDao;
import com.cl.entity.KaoqinbiaoEntity;
import com.cl.service.KaoqinbiaoService;
import com.cl.entity.view.KaoqinbiaoView;

@Service("kaoqinbiaoService")
public class KaoqinbiaoServiceImpl extends ServiceImpl<KaoqinbiaoDao, KaoqinbiaoEntity> implements KaoqinbiaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KaoqinbiaoEntity> page = this.selectPage(
                new Query<KaoqinbiaoEntity>(params).getPage(),
                new EntityWrapper<KaoqinbiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KaoqinbiaoEntity> wrapper) {
		  Page<KaoqinbiaoView> page =new Query<KaoqinbiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<KaoqinbiaoView> selectListView(Wrapper<KaoqinbiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KaoqinbiaoView selectView(Wrapper<KaoqinbiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<KaoqinbiaoEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<KaoqinbiaoEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<KaoqinbiaoEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
