package com.etranger.source.repository;

import com.etranger.source.entity.EtrangerDataSourceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataSourceRepository extends JpaRepository<EtrangerDataSourceEntity,String> {

}
