package com.example.demo.API;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.Entity.UserTable;
import com.example.demo.Entity.VisitorTypeTable;
import com.example.demo.Service.IUserTableService;
import com.example.demo.Service.IVisitRequestTableService;
import com.example.demo.Service.IVisitorTypeTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.management.Query;
import java.util.List;

@RestController
@RequestMapping("/api")
public class Common {

    private final IVisitorTypeTableService visitorTypeTableService;
    private final IUserTableService userTableService;
    private final IVisitRequestTableService visitRequestTableService;

    public Common(IVisitorTypeTableService visitorTypeTableService, IUserTableService userTableService, IVisitRequestTableService visitRequestTableService) {
        this.visitorTypeTableService = visitorTypeTableService;
        this.userTableService = userTableService;
        this.visitRequestTableService = visitRequestTableService;
    }

    @PreAuthorize("hasRole('GUARD')")
    @GetMapping("1")
    public List<VisitorTypeTable> visitorTypeTableList(){
        return visitorTypeTableService.list();
    }

    @GetMapping("2")
    public List<UserTable> userTableList() {
        return userTableService.list();
    }

    @GetMapping("3")
    public int countAdmin() {
        return userTableService.countAdmin();
    }

    @GetMapping("4")
    public int countRole(@RequestParam int role) {
        return userTableService.CountRole(role);
    }

    @GetMapping("/5")
    public int pendingRequest(){
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("status",0);
        return visitRequestTableService.list(queryWrapper).size();
    }

    @GetMapping("/6")
    public int getPending(){
       return visitRequestTableService.countPendingRequest();
    }



}
