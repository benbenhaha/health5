package com.benben.health.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.benben.health.entity.Form;
import com.benben.health.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zeny
 * @since 2020-03-12
 */
@RestController
@RequestMapping("/health/form")
public class FormController {

    @Autowired
    private FormService formService;

    @PostMapping("/user")
    public Form subm(@RequestBody Form form) throws ParseException {
        String messageDay = form.getMessageDay();
        messageDay = messageDay.replace("Z", " UTC");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS Z");
        Date parse = format.parse(messageDay);
        String format1 = new SimpleDateFormat("yyyy-MM-dd:hh-mm-ss").format(parse);
        form.setMessageDay(format1);
        formService.save(form);
        return form;
    }
    @GetMapping("/getDataById")
    public Form getDataById(@RequestParam Integer id) {
        Form form = formService.selectByEmployId(id);
        return form;
    }

}


