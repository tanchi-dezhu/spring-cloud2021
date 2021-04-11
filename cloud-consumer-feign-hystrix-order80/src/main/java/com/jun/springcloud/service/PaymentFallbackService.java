package com.jun.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author jun
 * @date 2021年04月11日 14:43
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "PaymentFallbackService:paymentInfo_OK降级处理";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "PaymentFallbackService:paymentInfo_TimeOut降级处理";
    }
}
