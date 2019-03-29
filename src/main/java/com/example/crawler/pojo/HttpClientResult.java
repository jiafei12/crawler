package com.example.crawler.pojo;

import lombok.Data;

/**
 * @author liuyh
 * @description: 封装http返回参数
 * @date 2019/3/29 16:56
 */
@Data
public class HttpClientResult {
    private static final long serialVersionUID = 2168152194164783950L;

    /**
     * 响应状态码
     */
    private int code;

    /**
     * 响应数据
     */
    private String content;


    public HttpClientResult(int code) {
        this.code = code;
    }


    public HttpClientResult(int code, String content) {
        this.code = code;
        this.content = content;
    }
}
