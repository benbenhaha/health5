package com.benben.health.service;

import com.benben.health.entity.Form;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zeny
 * @since 2020-03-15
 */
public interface FormService extends IService<Form> {
    Form selectByEmployId(Integer id);
}
