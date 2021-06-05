package com.example.demo.Controller;


import com.example.demo.Entity.VisitorTypeTable;
import com.example.demo.Service.IVisitRequestTableService;
import com.example.demo.Service.IVisitorTypeTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author wudi
 * @since 2021-06-02
 */
@RestController
@RequestMapping("/")
public class VisitorTypeTableController {

    @Autowired
    private IVisitorTypeTableService service;
    @Autowired
    private IVisitRequestTableService visitRequestTableService;

    @GetMapping("index")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("JMJ");
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("something",service.list());
        model.put("pending",visitRequestTableService.countPendingRequest());
        modelAndView.addObject("model",model);
        //testing
        return modelAndView;
    }
    @GetMapping("testing")
    public ModelAndView getId(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("test");
        modelAndView.addObject("list",service.list());
        return modelAndView;
    }

    @Secured("ROLE_GUARD")
    @GetMapping("/api/xd")
    public List<VisitorTypeTable> visitorTypeTableList(){
        return service.list();
    }

}

