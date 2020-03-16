package com.benben.health.service.impl;

import com.benben.health.entity.Form;
import com.benben.health.mapper.FormMapper;
import com.benben.health.service.FormService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zeny
 * @since 2020-03-15
 */
@Service
public class FormServiceImpl extends ServiceImpl<FormMapper, Form> implements FormService {

    @Override
    public Form selectByEmployId(Integer id) {
        return baseMapper.selectByEmployId(id);
    }
}
