package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.KaoqinbiaoEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.KaoqinbiaoView;


/**
 * 考勤表
 *
 * @author 
 * @email 
 * @date 2024-03-10 16:38:22
 */
public interface KaoqinbiaoService extends IService<KaoqinbiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KaoqinbiaoView> selectListView(Wrapper<KaoqinbiaoEntity> wrapper);
   	
   	KaoqinbiaoView selectView(@Param("ew") Wrapper<KaoqinbiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KaoqinbiaoEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<KaoqinbiaoEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<KaoqinbiaoEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<KaoqinbiaoEntity> wrapper);



}

