package com.ums.umsAdmin.sys.service;

import java.util.List;
import java.util.Set;

import com.ums.umsAdmin.sys.form.QueryRoleForm;
import com.ums.umsAdmin.sys.form.UMSRoleForm;
import com.ums.umsAdmin.sys.model.UMSRole;
import com.ums.umsAdmin.sys.util.PageModel;
import com.ums.umsAdmin.sys.vo.UMSRoleVo;

public interface UMSRoleService {
	/**
	 * ��ѯ��default��������н�ɫ
	 * @return List<UMSRole> ������default��ɫ
	 */
	public List<UMSRole> findAllNoDefault();
	
	/**
	 * ��ѯ��ɫ�����ط�ҳ�û�����
	 * @param queryRoleForm
	 * @return PageModel �ں���ҳ���û��б�
	 */
	public PageModel<UMSRoleVo> pageQueryOfVo(QueryRoleForm queryRoleForm);
	
	/**
	 * ��ѯ�û�ʱ�ṩ������ʾ����
	 * @param input
	 * @return
	 */
	public Set<String> searchUserHints(String input);
	
	/**
	 * ��ӽ�ɫ
	 * @param roleForm ��ɫ���������
	 * @return roleId
	 */
	public Long addRole(UMSRoleForm roleForm);
	
	/**
	 * ͨ���û�idȡ�ý�ɫ
	 * @param id
	 * @return UMSRole
	 */
	public UMSRole findRoleById(Long id);
	
	/**
	 * ͨ����ɫ��ȡ�ý�ɫ
	 * @param name
	 * @return UMSRole
	 */
	public UMSRole findRoleByName(String name);
	
	/**
	 * ͨ����ɫidɾ���ý�ɫ
	 * @param id
	 */
	public void deleteRole(Long id);
	
	/**
	 * �жϽ�ɫ���Ƿ����
	 * @param roleId
	 *  @return 
	 */
	public boolean isExisted(Long roleId);
	
	/**
	 * �ж�ͬӦ���½�ɫ���Ƿ����
	 * @param roleName,appId
	 *  @return 
	 */
	public boolean checkRoleName(String roleName,Long appId );
	
	/**
	 * ���½�ɫ
	 * @param roleForm
	 */
	public void updateRole(UMSRoleForm roleForm);
}
