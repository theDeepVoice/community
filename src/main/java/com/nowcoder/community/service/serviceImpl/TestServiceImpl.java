package com.nowcoder.community.service.serviceImpl;

import com.nowcoder.community.dao.TestDao;
import com.nowcoder.community.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao;

    @Override
    public String find() {
        return testDao.find();
    }
}
