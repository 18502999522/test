package com.yf.model.mapper;

import com.yf.entity.Bank;

public interface BankMapper {

    /**
     * 给目标账户加上转账金额
     * @param no 账号
     * @param salary  转账金额
     */
    int in(String no,int salary);

    /**
     * 从原目标账户扣掉转账金额
     * @param no 账号
     * @param salary  转账金额
     */
    int out(String no,int salary);


}