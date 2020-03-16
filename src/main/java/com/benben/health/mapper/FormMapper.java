package com.benben.health.mapper;

import com.benben.health.entity.Form;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zeny
 * @since 2020-03-15
 */
public interface FormMapper extends BaseMapper<Form> {
    Form selectByEmployId(@Param("id") Integer id);
}
