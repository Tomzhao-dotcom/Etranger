package com.etranger.web.controller.source;


import com.etranger.web.entity.EtrangerDataSourceEntity;
import com.etranger.web.service.EtrangerDataSourceService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
public class DataSourceController {
    @Resource
    EtrangerDataSourceService dataSourceService;

    @RequestMapping("/source")
    public String index() {
        return "redirect:/source/DataSourceList";
    }

    @RequestMapping( "/source/DataSourceList" )
    public String list(Model model) {
        List<EtrangerDataSourceEntity> dataSourceEntityList=dataSourceService.getDataSourceList();
        model.addAttribute("dataSourceEntityList", dataSourceEntityList);
        return "source/DataSourceList";
    }

    @RequestMapping( "/source/toAdd" )
    public String toAdd() {
        return "source/DataSourceAdd";
    }


    @RequestMapping( "/source/DataSourceAdd" )
    public String add(EtrangerDataSourceEntity sourceEntity) {
        sourceEntity.setId(UUID.randomUUID().toString());
        dataSourceService.save(sourceEntity);
        return "redirect:/source/DataSourceList";
    }

    @RequestMapping( "/source/toEdit" )
    public String toEdit(Model model, String id) {
        EtrangerDataSourceEntity sourceEntity = dataSourceService.findDataSouceById(id);
        model.addAttribute("sourceEntity", sourceEntity);
        return "source/DataSourceEdit";
    }


    @RequestMapping( "/source/DataSourceEdit" )
    public String edit(EtrangerDataSourceEntity sourceEntity) {
        dataSourceService.edit(sourceEntity);
        return "redirect:/source/DataSourceList";
    }

    @RequestMapping("/source/delete")
    public String delete(String id) {
        dataSourceService.delete(id);
        return "redirect:/source/DataSourceList";
    }

    @RequestMapping("/source/DataSourceView")
    public String view(Model model, String id){
        EtrangerDataSourceEntity sourceEntity = dataSourceService.findDataSouceById(id);
        model.addAttribute("sourceEntity", sourceEntity);
        return "source/DataSourceView";
    }

}
