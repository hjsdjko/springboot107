package com.cl.entity.view;

import com.cl.entity.KaoqinbiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 考勤表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-10 16:38:22
 */
@TableName("kaoqinbiao")
public class KaoqinbiaoView  extends KaoqinbiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KaoqinbiaoView(){
	}
 
 	public KaoqinbiaoView(KaoqinbiaoEntity kaoqinbiaoEntity){
 	try {
			BeanUtils.copyProperties(this, kaoqinbiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
