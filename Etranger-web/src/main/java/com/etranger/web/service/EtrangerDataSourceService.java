package com.etranger.web.service;

import com.etranger.web.entity.EtrangerDataSourceEntity;

import java.util.List;

public interface EtrangerDataSourceService {
    List<EtrangerDataSourceEntity> getDataSourceList();
    EtrangerDataSourceEntity findDataSouceById(String id);
    void save(EtrangerDataSourceEntity dataSourceEntity);
    void edit(EtrangerDataSourceEntity dataSourceEntity);
    void delete(String id);
    String saveValidate(EtrangerDataSourceEntity dataSourceEntity);
}
