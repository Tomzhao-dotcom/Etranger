package com.etranger.web.service.impl;

import com.etranger.web.entity.EtrangerDataSourceEntity;
import com.etranger.web.repository.EtrangerDataSourceRepository;
import com.etranger.web.service.EtrangerDataSourceService;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
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
        if(dataSourceRepository.findById(id).isPresent()){
            return dataSourceRepository.findById(id).get();
        }
        return new EtrangerDataSourceEntity();
    }

    @Override
    //@Transactional( rollbackFor = Exception.class )
    public void save(EtrangerDataSourceEntity dataSourceEntity) {
        //dataSourceRepository.save(dataSourceEntity);
        this.dataSourceRepository.saveAndFlush(dataSourceEntity);

    }

    @Override
    //@Transactional( rollbackFor = Exception.class )
    public void edit(EtrangerDataSourceEntity dataSourceEntity) {
        dataSourceRepository.save(dataSourceEntity);
    }

    @Override
    //@Transactional( rollbackFor = Exception.class )
    public void delete(String id) {
        dataSourceRepository.deleteById(id);
    }

    @Override
    public String saveValidate(EtrangerDataSourceEntity dataSourceEntity) {
        return null;
    }
}
