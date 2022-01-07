package com.flong.springboot.bridge.refactor;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2021/10/21 4:23 下午
 */
public class PayHandler {

    /**
     * @param payEnum     支付方式
     * @param payModeEnum 安全验证方式
     * @param uId         用户ID
     * @param tradeId     单号ID
     * @param amount      金额
     * @author wangshuai
     * @date 2021/10/22 9:08 上午
     */
    public void payTransfer(PayEnum payEnum,
                            PayModeEnum payModeEnum,
                            String uId,
                            String tradeId,
                            BigDecimal amount) {
        Map<PayEnum, Pay> payMap = new HashMap<>();
        payMap.put(PayEnum.WX, new WxPay());
        payMap.put(PayEnum.ZFB, new ZfbPay());
        Map<PayModeEnum, IPayMode> payModeMap = new HashMap<>();
        payModeMap.put(PayModeEnum.Face, new PayFaceMode());
        payModeMap.put(PayModeEnum.Fingerprint, new PayFingerprintMode());
        payModeMap.put(PayModeEnum.Cypher, new PayCypher());
        IPayMode payMode = payModeMap.get(payModeEnum);
        Pay payWay = payMap.get(payEnum);
        payWay.setPayMode(payMode);
        payWay.transfer(uId, tradeId, amount);

    }
}
