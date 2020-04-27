package com.shopping.bi.service;

import com.shopping.bi.bo.AdminDto;

import java.util.List;

public interface AdminService {

	int del(List<Long> ids);

	AdminDto login(String account, String password);

}
