package cc.ryanc.halo.model.dto;

import lombok.Data;

/**
 * @author : RYAN0UP
 * @version : 1.0
 * @date : 2018/5/24
 */
@Data
public class JsonResult {

    /**
     * 返回的状态码，0：失败，1：成功
     */
    private Integer code;

    /**
     * 返回信息
     */
    private String msg;

    /**
     * 返回的数据
     */
    private Object result;

    /**
     * 不返回数据的构造方法
     * @param code 状态码
     * @param msg 信息
     */
    public JsonResult(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 返回数据的构造方法
     * @param code 状态码
     * @param msg 信息
     * @param result 数据
     */
    public JsonResult(Integer code, String msg, Object result) {
        this.code = code;
        this.msg = msg;
        this.result = result;
    }
}