package com.soulinc.ap2backend.service.impl;

import com.soulinc.ap2backend.entity.College;
import com.soulinc.ap2backend.model.BaseErrorResponse;
import com.soulinc.ap2backend.model.BaseResponse;
import com.soulinc.ap2backend.model.College2;
import com.soulinc.ap2backend.repository.CollegeRepository;
import com.soulinc.ap2backend.service.CollegeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollegeServiceImpl implements CollegeService {

    @Autowired
    CollegeRepository collegeRepository;

    private BaseResponse baseResponse;

    @Override
    public BaseResponse getCollege(String college_id) {
        if (collegeRepository.existsById(college_id)) {
            College college = collegeRepository.getCollegeByCollege_Id(college_id);
            College2 college2 = new College2();
            BeanUtils.copyProperties(college, college2);
            return new BaseResponse(200, college2, null);
        } else {
            BaseErrorResponse errorResponse = new BaseErrorResponse("NO_COLLEGE_FOUND", "No College Found", "Please check the provided id.");
            return new BaseResponse(404, null, errorResponse);
        }
    }

    @Override
    public BaseResponse addCollege(College2 college2) {
        return null;
    }

    @Override
    public BaseResponse removeCollege(String college_id) {
        return null;
    }
}
