package com.yf.model.service;

public interface IBankService {

    /**
     * 转账业务
     * @param outNo 扣款方账号
     * @param inNo 收款方账号
     * @param salary 转账金额
     */
    public void transfer(String outNo,String inNo,int salary)throws Exception;


}
