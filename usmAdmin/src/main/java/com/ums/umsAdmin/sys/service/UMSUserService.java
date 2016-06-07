package com.ums.umsAdmin.sys.service;

import java.util.List;
import java.util.Set;

import com.ums.umsAdmin.sys.form.QueryUserForm;
import com.ums.umsAdmin.sys.form.UMSUserForm;
import com.ums.umsAdmin.sys.model.UMSUser;
import com.ums.umsAdmin.sys.util.PageModel;
import com.ums.umsAdmin.sys.vo.UMSUserVo;

public interface UMSUserService {
	/**
	 * ͨ���û�idȡ���û�
	 * @param id
	 * @return UMSUser
	 */
	public UMSUser findUserById(Long id);
	
	
	/**
	 * ͨ���û�UUIDȡ���û�
	 * @param UUID
	 * @return UMSUser
	 */
	public UMSUser findUserByUUID(String UUID);
	/**
	 * ͨ���û�����ȡ���û�
	 * @param name
	 * @return UMSUser
	 */
	public UMSUser findUserByName(String name);
	/**
	 * ȡ�������û�
	 * @return UMSUsers' list
	 */
	public List<UMSUser> findAll();
	/**
	 * ͨ���û�idɾ�����û�
	 * @param id
	 */
	public void deleteUser(Long id);
	/**
	 * ����û�
	 * @param userForm �û����������
	 * @return user's id
	 */
	public Long addUser(UMSUserForm userForm);
	/**
	 * �����û�
	 * @param userForm
	 */
	public void updateUser(UMSUserForm userForm);
	/**
	 * �ж��û����Ƿ����
	 * @param userName
	 * @return 
	 */
	public boolean isExisted(String userName);
	
	/**
	 * �ж��û����Ƿ����
	 * @param userId
	 *  @return 
	 */
	public boolean isExisted(Long userId);
	/**
	 * ��ѯ�û������ط�ҳ�û�����
	 * @param queryUserForm
	 * @return PageModel �ں���ҳ���û��б�
	 */
	public PageModel<UMSUserVo> pageQueryOfVo(QueryUserForm queryUserForm);
	/**
	 * ��ѯ�û�ʱ�ṩ������ʾ����
	 * @param input
	 * @return
	 */
	public Set<String> searchUserHints(String input);
	/**
	 * �����û�����
	 * @param userForm
	 */
	public void changeUserPwd(UMSUserForm userForm);
	
	/**
	 * ��������
	 * @param userForm
	 */
	public void setPwd(UMSUserForm userForm);
	
	/**
	 * ��������
	 * @param userForm
	 */
	public void forgetPwd(UMSUserForm userForm);	
	
	/** ���µ�¼ʱ��
	 * @param userId
	 */
	public void updateLoginTime(Long userId);
}
