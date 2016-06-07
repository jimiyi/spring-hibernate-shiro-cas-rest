package com.ums.umsAdmin.sys.service;

import java.util.List;

import com.ums.umsAdmin.sys.model.UMSApp;

public interface UMSAppService {
	/**
	 * ��ȡ����Ӧ��
	 * @return list<UMSApp>
	 */
	public List<UMSApp> findAll();
	
	/**
	 * ͨ���û�idȡ��Ӧ��
	 * @param id
	 * @return UMSApp
	 */
	public UMSApp findAppById(Long id);

}
