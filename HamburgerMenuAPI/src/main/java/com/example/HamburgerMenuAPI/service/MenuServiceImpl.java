package com.example.HamburgerMenuAPI.service;

import java.util.ArrayList;
import java.util.List;

import com.example.HamburgerMenuAPI.entity.Datum;

public class MenuServiceImpl implements MenuService {

	ArrayList<Datum> datumlist=new ArrayList<Datum>();
	datumlist.add(new Datum("assets/icon/wealthIconforMenu.svg","Wealth"));
	datumlist.add(new Datum("assets/icon/healthiconforMenu.svg","Health"));
	
	public void getDetails()
	{
		
	}
}
