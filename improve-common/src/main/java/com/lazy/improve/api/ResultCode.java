package com.lazy.improve.api;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * ClassName: ResultCode
 * Package: com.lazy.improve.api
 * Description: 响应状态码
 *
 * @Author leizhen
 * @Create 2023/3/4 22:08
 * @Version 1.0
 */
@Getter
@AllArgsConstructor
public enum ResultCode {
    SUCCESS(200, "操作成功"),
    FAILED(500, "操作失败"),
    VALIDATE_FAILED(404, "参数检验失败"),
    UNAUTHORIZED(401, "暂未登录或token已经过期"),
    FORBIDDEN(403, "没有相关权限");
    private long code;
    private String message;
}
