package com.lazy.improve.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ClassName: ShortlinkService
 * Package: com.lazy.improve.service
 * Description:
 *
 * @Author leizhen
 * @Create 2023/3/4 20:43
 * @Version 1.0
 */
public interface ShortlinkService {

    void skip(String urlId, HttpServletRequest request, HttpServletResponse response);
}
