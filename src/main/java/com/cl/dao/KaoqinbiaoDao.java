package com.cl.dao;

import com.cl.entity.KaoqinbiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.KaoqinbiaoView;


/**
 * 考勤表
 * 
 * @author 
 * @email 
 * @date 2024-03-10 16:38:22
 */
public interface KaoqinbiaoDao extends BaseMapper<KaoqinbiaoEntity> {
	
	List<KaoqinbiaoView> selectListView(@Param("ew") Wrapper<KaoqinbiaoEntity> wrapper);

	List<KaoqinbiaoView> selectListView(Pagination page,@Param("ew") Wrapper<KaoqinbiaoEntity> wrapper);
	
	KaoqinbiaoView selectView(@Param("ew") Wrapper<KaoqinbiaoEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<KaoqinbiaoEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<KaoqinbiaoEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<KaoqinbiaoEntity> wrapper);



}
