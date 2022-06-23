package com.geekli.model;

import java.io.Serializable;

public class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    private String productId;// 商品ID
    private String subject;//订单名称
    private String body;// 商品描述
    private String totalFee;// 总金额(单位是分)
    private String outTradeNo;// 订单号(唯一)
    private String spbillCreateIp;// 发起人IP地址
    private String attach;// 附件数据主要用于商户携带订单的自定义数据
    private String frontUrl;// 前台回调地址  非扫码支付使用

    public Product() {
        super();
    }

    public Product(String productId, String subject, String body,
                   String totalFee, String outTradeNo, String spbillCreateIp,
                   String attach, Short payType, Short payWay, String frontUrl) {
        super();
        this.productId = productId;
        this.subject = subject;
        this.body = body;
        this.totalFee = totalFee;
        this.outTradeNo = outTradeNo;
        this.spbillCreateIp = spbillCreateIp;
        this.attach = attach;
        this.frontUrl = frontUrl;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(String totalFee) {
        this.totalFee = totalFee;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public String getSpbillCreateIp() {
        return spbillCreateIp;
    }

    public void setSpbillCreateIp(String spbillCreateIp) {
        this.spbillCreateIp = spbillCreateIp;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public String getFrontUrl() {
        return frontUrl;
    }

    public void setFrontUrl(String frontUrl) {
        this.frontUrl = frontUrl;
    }
}
