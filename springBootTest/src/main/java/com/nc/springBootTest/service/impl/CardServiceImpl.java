package com.nc.springBootTest.service.impl;

import java.util.IllformedLocaleException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nc.springBootTest.dao.CardMapper;
import com.nc.springBootTest.entity.Cards;
import com.nc.springBootTest.service.CardService;

@Service("cardService")
public class CardServiceImpl implements CardService{
	@Autowired
	CardMapper cardMapper;
	public int inMoney(double money,int cardID){
		return cardMapper.inMoney(money,cardID);
	}
	public int outMoney(double money,int cardID){
		return cardMapper.outMoney(money,cardID);
	}
	public List<Cards> queryAll(){
		return cardMapper.queryAll();
	}
	public double queryMoney(int cardId){
		return cardMapper.queryMoney(cardId);
	}
	@Transactional
	public void ioMoney(double money,int fromId,int toId){
		double m = cardMapper.queryMoney(fromId);
		System.out.println("���-----: "+m);
		cardMapper.outMoney(money, fromId);
		if (m<money) {
			throw new IllformedLocaleException("����!!!");
		}
		cardMapper.inMoney(money, toId);
	}
}
