<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="zh-CN">
<head>
<title>Change Own Password</title>
<%@ include file="../inc/header.jsp" %>
<body>
	<%@ include file="../inc/nav.jsp" %>
  <!-- CONTENT BEGIN -->
  <div class="body content rows scroll-y admin-body">
    <div class="row">
      <div class="col-xs-12">
        <div class="container-fluid">
          <div class="row">
            <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 main" id="rightContent" style="padding:20px">
              <form id="changeOwnPwd_form" class="form-horizontal" role="form" method="POST" action="" autocomplete="off" 
              onsubmit="return submitForm()" >
                <div class="page-heading" >
                  <h2 > <strong>重置密码</strong>
                    <small></small>
                  </h2>
                </div>
                <div class="form-group">
                    <label for="lastname" class="col-xs-3 col-sm-2 control-label">旧密码</label>
                    <div class="col-xs-7 col-sm-3">
                      <input type="password" id="oldPassword" name="oldPassword" class="required form-control passwordCheck" maxlength="8" placeholder="输入旧密码">
					</div>
                </div> 
                  <input name="userId" value="${user.userId }" type="hidden" >                
                  <div class="form-group">
                    <label for="lastname" class="col-xs-3 col-sm-2 control-label">密码</label>
                    <div class="col-xs-7 col-sm-3">
                      <input type="password" id="password" name="password" class="required form-control passwordCheck "  maxlength="8" placeholder="输入密码">
                     </div>
                  </div>
                  <div class="form-group">
                    <label for="lastname" class="col-xs-3 col-sm-2 control-label">确认密码</label>
                    <div class="col-xs-7 col-sm-3">
                      <input type="password" id="confirmPassword" name="confirmPassword" class="required form-control passwordCheck" equalto="#password"  maxlength="8" placeholder="输入确认密码">
                    </div>
                  </div>            
                <div class="form-group">
                  <div class="col-sm-offset-2 col-sm-5 col-xs-offset-3 col-xs-12">
                    <button type="sumbit"  class="btn btn-primary">确认</button>
                    <a href="<%=request.getContextPath() %>/user/list"><button type="button"  class="btn btn-primary">取消</button></a>
                  </div>
                </div>
              </form>

            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
  <!-- END -->
  <%@ include file="../inc/footer.jsp" %>

  <script type="text/javascript">
      var isClick = false;
        function submitForm() {
          if (isClick) {
            return false;
          }
          if($('#changeOwnPwd_form').valid()){
              isClick = true;
              $.ajax({
                url: '<%=request.getContextPath() %>/user/changeOwnPwd',
                type: 'POST',
                dataType: 'json',
                data: $('#changeOwnPwd_form').serialize(),
                success:function(data){

                  if(data.busiStatus == 'success'){
                    createAlert({
                      statusCode:200,
                      message:data.message
                    })
                    
                    //changeOwnPwd success,switch to listUser Page
                    setTimeout(function(){
                      isClick = false;
                      window.location.href = '<%=request.getContextPath() %>/user/list';
                    },2000);
                  }else{

                    createAlert({
                      statusCode:300,
                      message:String(data.errorMsg)
                    })
                    isClick = false;
                  }
                  
                },
                error:function(data){
                  isClick = false;
                  console.log(data)
                  createAlert({
                      statusCode:300,
                      message:"出错了,请重试"
                    })
                  
                }
              });
              return false;
          }else{
             return false;
          }
            
        }
</script>

</body>