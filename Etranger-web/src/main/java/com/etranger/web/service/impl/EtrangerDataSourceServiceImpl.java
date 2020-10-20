package com.etranger.web.service.impl;

import com.etranger.web.entity.EtrangerDataSourceEntity;
import com.etranger.web.repository.EtrangerDataSourceRepository;
import com.etranger.web.service.EtrangerDataSourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtrangerDataSourceServiceImpl implements EtrangerDataSourceService {

    @Autowired
    private EtrangerDataSourceRepository dataSourceRepository;
    @Override
    public List<EtrangerDataSourceEntity> getDataSourceList() {
        return dataSourceRepository.findAll();
    }

    @Override
    public EtrangerDataSourceEntity findDataSouceById(String id) {
        return dataSourceRepository.getOne(id);
    }

    @Override
    public void save(EtrangerDataSourceEntity dataSourceEntity) {
        dataSourceRepository.save(dataSourceEntity);
    }

    @Override
    public void edit(EtrangerDataSourceEntity dataSourceEntity) {
        dataSourceRepository.save(dataSourceEntity);
    }

    @Override
    public void delete(String id) {
        dataSourceRepository.deleteById(id);
    }
}
