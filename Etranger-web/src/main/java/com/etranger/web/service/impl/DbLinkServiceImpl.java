package com.etranger.web.service.impl;

import com.etranger.source.jdbc.DataBaseType;
import com.etranger.source.jdbc.JdbcConnect;
import com.etranger.web.entity.EtrangerDataSourceEntity;
import com.etranger.web.repository.EtrangerDataSourceRepository;
import com.etranger.web.service.DbLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Optional;


@Service
public class DbLinkServiceImpl implements DbLinkService {

    @Autowired
    private EtrangerDataSourceRepository dataSourceRepository;


    @Override
    public String dbLinkTest(String id) {
        Optional<EtrangerDataSourceEntity> optional = dataSourceRepository.findById(id);
        if (optional.isPresent()) {
            EtrangerDataSourceEntity entity = optional.get();
            String ip = entity.getIp();
            String dbname = entity.getDbname();
            String user = entity.getUsername();
            String password = entity.getPassword();
            String dbtype = entity.getDbtype();
            if (StringUtils.isEmpty(ip) || StringUtils.isEmpty(dbname) || StringUtils.isEmpty(user) || StringUtils.isEmpty(password) || StringUtils.isEmpty(dbtype)) {
                return "false";
            }
            DataBaseType db = DataBaseType.valueOf(dbtype);
            String url = JdbcConnect.getUrl(db, ip, dbname);
            boolean state = JdbcConnect.testConnWithoutRetry(db, url, user, password, new ArrayList<>());
            if (state) {
                return "true";
            }
            return "false";
        }
        return "false";
    }


}
