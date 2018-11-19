package com.nc.springBootTest.service;

import java.util.IllformedLocaleException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nc.springBootTest.entity.Cards;


public interface CardService {
	public int inMoney(double money,int cardID);
	public int outMoney(double money,int cardID);
	public List<Cards> queryAll();
	public double queryMoney(int cardId);
	@Transactional 
	public void ioMoney(double money,int fromId,int toId);
}
