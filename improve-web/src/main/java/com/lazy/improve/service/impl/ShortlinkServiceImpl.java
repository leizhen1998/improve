package com.lazy.improve.service.impl;

import com.lazy.improve.service.ShortlinkService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDateTime;

/**
 * ClassName: ShortlinkServiceImpl
 * Package: com.lazy.improve.service.impl
 * Description:
 *
 * @Author leizhen
 * @Create 2023/3/4 20:44
 * @Version 1.0
 */
@Slf4j
@Service
public class ShortlinkServiceImpl implements ShortlinkService {
    @Override
    public void skip(String urlId, HttpServletRequest request, HttpServletResponse response) {
        LocalDateTime clickTime = LocalDateTime.now();
        String ip = request.getRemoteAddr();
        String referer = request.getHeader("referer");
        String userAgent = request.getHeader("User-Agent");
        log.info("ip={}, referer={}, userAgent={}", ip, referer, userAgent);
    }
}
