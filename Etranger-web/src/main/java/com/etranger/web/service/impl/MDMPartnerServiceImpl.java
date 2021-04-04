package com.etranger.web.service.impl;

import com.etranger.web.entity.MdmpartnerEntity;
import com.etranger.web.repository.MDMPartnerRepository;
import com.etranger.web.service.MDMPartnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MDMPartnerServiceImpl implements MDMPartnerService {

    @Autowired
    private MDMPartnerRepository partnerRepository;

    @Override
    public List<MdmpartnerEntity> findAll() {
        return partnerRepository.findAll();
    }
}
