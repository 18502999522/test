package com.yf.model.service;

import com.yf.model.mapper.BankMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.FileNotFoundException;

@Service
@Transactional
public class BankService implements  IBankService{

    @Autowired
    BankMapper bankMapper;

    /**
     * 转账业务
     * @param outNo 扣款方账号
     * @param inNo 收款方账号
     * @param salary 转账金额
     */
    @Override
    //@Transactional
    public void transfer(String outNo, String inNo, int salary)throws Exception{

        //1.从出款方账户扣除转账金额
        bankMapper.out(outNo,salary);

        try {
            if(1==1){
                throw new FileNotFoundException();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        //2.给收款方账户加上转账金额
        bankMapper.in(inNo,salary);
    }



}

