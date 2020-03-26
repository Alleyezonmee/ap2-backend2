package com.soulinc.ap2backend.service;

import com.soulinc.ap2backend.model.BaseResponse;
import com.soulinc.ap2backend.model.College2;

public interface CollegeService {
    BaseResponse getCollege(String college_id);
    BaseResponse addCollege(College2 college2);
    BaseResponse removeCollege(String college_id);
}
