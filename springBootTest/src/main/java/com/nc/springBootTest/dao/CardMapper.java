package com.nc.springBootTest.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.nc.springBootTest.entity.Cards;
@Mapper
public interface CardMapper {
	public int inMoney(double money,int cardId);
	public int outMoney(double money,int cardId);
	public List<Cards> queryAll();
	public double queryMoney(int cardId);
}
