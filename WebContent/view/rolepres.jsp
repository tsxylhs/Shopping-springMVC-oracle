<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html class="no-js">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Amaze UI Admin index Examples</title>
<meta name="description" content="这是一个 index 页面">
<meta name="keywords" content="index">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<meta name="renderer" content="webkit">
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="icon" type="image/png" href="images/favicon.png">
<link rel="apple-touch-icon-precomposed" href="images/app-icon72x72@2x.png">
<meta name="apple-mobile-web-app-title" content="Amaze UI" />
<link rel="stylesheet" href="css/amazeui.min.css"/>
<link rel="stylesheet" href="css/admin.css">
<script src="js/jquery.min.js"></script>
<script src="js/app.js"></script>
</head>
<body>
<!--[if lte IE 9]><p class="browsehappy">升级你的浏览器吧！ <a href="http://se.360.cn/" target="_blank">升级浏览器</a>以获得更好的体验！</p><![endif]-->






</head>

<body>
<header class="am-topbar admin-header">
  <div class="am-topbar-brand"><img src="images/logo.png"></div>

  <div class="am-collapse am-topbar-collapse" id="topbar-collapse">
    <ul class="am-nav am-nav-pills am-topbar-nav admin-header-list">

   <li class="am-dropdown tognzhi" data-am-dropdown>
  <button class="am-btn am-btn-primary am-dropdown-toggle am-btn-xs am-radius am-icon-bell-o" data-am-dropdown-toggle> 消息管理<span class="am-badge am-badge-danger am-round">6</span></button>
  <ul class="am-dropdown-content">
  	
  	
  	
    <li class="am-dropdown-header">所有消息都在这里</li>

    

    <li><a href="#">未激活会员 <span class="am-badge am-badge-danger am-round">556</span></a></li>
    <li><a href="#">未激活代理 <span class="am-badge am-badge-danger am-round">69</span></a></a></li>
    <li><a href="#">未处理汇款</a></li>
    <li><a href="#">未发放提现</a></li>
    <li><a href="#">未发货订单</a></li>
    <li><a href="#">低库存产品</a></li>
    <li><a href="#">信息反馈</a></li>
    
    
    
  </ul>
</li>

 <li class="kuanjie">
 	
 	<a href="#">会员管理</a>          
 	<a href="#">奖金管理</a> 
 	<a href="#">订单管理</a>   
 	<a href="#">产品管理</a> 
 	<a href="#">个人中心</a> 
 	 <a href="#">系统设置</a>
 </li>

 <li class="soso">
 	
<p>   
	
	<select data-am-selected="{btnWidth: 70, btnSize: 'sm', btnStyle: 'default'}">
          <option value="b">全部</option>
          <option value="o">产品</option>
          <option value="o">会员</option>
          
        </select>

</p>

<p class="ycfg"><input type="text" class="am-form-field am-input-sm" placeholder="圆角表单域" /></p>
<p><button class="am-btn am-btn-xs am-btn-default am-xiao"><i class="am-icon-search"></i></button></p>
 </li>




      <li class="am-hide-sm-only" style="float: right;"><a href="javascript:;" id="admin-fullscreen"><span class="am-icon-arrows-alt"></span> <span class="admin-fullText">开启全屏</span></a></li>
    </ul>
  </div>
</header>

<div class="am-cf admin-main"> 

<div class="nav-navicon admin-main admin-sidebar">
    
    
    <div class="sideMenu am-icon-dashboard" style="color:#aeb2b7; margin: 10px 0 0 0;"> 欢迎系统管理员：${sessionScope.user.username}</div>
  <div class="sideMenu">
      <h3 class="am-icon-flag"><em></em> <a href="#">管理</a></h3>
      <ul>
  <c:forEach items="${sessionScope.role}" var="node2">
       
        <li><a href="${node2.PER_URL }">${node2.PER_NAME}</a></li>
        
          
           </c:forEach>
        <c:if test="${sessionScope.user.username==null}">
         <li> <a href="initlogin">后台登陆</a></li>
         </c:if>
      </ul>
    </div> 
    <!-- sideMenu End --> 
    
    <script type="text/javascript">
			jQuery(".sideMenu").slide({
				titCell:"h3", //鼠标触发对象
				targetCell:"ul", //与titCell一一对应，第n个titCell控制第n个targetCell的显示隐藏
				effect:"slideDown", //targetCell下拉效果
				delayTime:300 , //效果时间
				triggerTime:150, //鼠标延迟触发时间（默认150）
				defaultPlay:true,//默认是否执行效果（默认true）
				returnDefault:true //鼠标从.sideMen移走后返回默认状态（默认false）
				});
		</script> 

    
    
    
    
    
    
    
</div>

<div class=" admin-content">
	
		<div class="daohang">
			<ul>
				<li><a type="button" class="am-btn am-btn-default am-radius am-btn-xs" href="index"> 首页 </a></li>
				<li><button type="button" class="am-btn am-btn-default am-radius am-btn-xs">帮助中心<a href="javascript: void(0)" class="am-close am-close-spin" data-am-modal-close="">×</a></button></li>
				<li><button type="button" class="am-btn am-btn-default am-radius am-btn-xs">奖金管理<a href="javascript: void(0)" class="am-close am-close-spin" data-am-modal-close="">×</a></button></li>
				<li><button type="button" class="am-btn am-btn-default am-radius am-btn-xs">产品管理<a href="javascript: void(0)" class="am-close am-close-spin" data-am-modal-close="">×</a></button></li>
				
				
			</ul>

       

	
</div>



	
	<div class="am-popup am-popup-inner" id="my-popups-add">
	
	    <div class="am-popup-hd">
      <h4 class="am-popup-title">手动添加权限</h4>
      <span data-am-modal-close  class="am-close">&times;</span>
    </div>
	
	    <div class="am-popup-bd">
      

      <form class="am-form tjlanmu" action="addper" method="post">


       <div class="am-form-group">
        
          <div class="you">
         权限名   <input type="text" class="am-input-sm" id="doc-ipt-email-1" name="per_name" placeholder="请输入权限名">
          </div>
        </div>
         <div class="am-form-group">
       
          <div class="you">
           权限地址 <input type="text" class="am-input-sm" id="doc-ipt-email-1" name="per_url" placeholder="请输入权限对应地址">
          </div>
        </div>
          <div class="am-form-group">
      
          <div class="you">
           权限说明<input type="text" class="am-input-sm" id="doc-ipt-email-1" name="per_messger" placeholder="请输入说明">
          </div>
        </div>
        <div class="am-form-group am-cf">
          <div class="you">
            <p>
              <button type="submit" class="am-btn am-btn-success am-radius" >提交</button>
            </p>
          </div>
        </div>
      </form>
    











    </div>

	

</div>
	
	
	
	
	
	


<div class="admin-biaogelist">
	
    <div class="listbiaoti am-cf">
      <ul class="am-icon-users"> 会员管理</ul>
      
      <dl class="am-icon-home" style="float: right;">当前位置： 首页 > <a href="#">会员列表</a></dl>
      
      <dl>
        <button type="button" class="am-btn am-btn-danger am-round am-btn-xs am-icon-plus"   data-am-modal="{target: '#my-popups-add'}"   > 手动添加权限</button>
      </dl>
   
    </div>

    <form class="am-form am-g">
          <table width="100%" class="am-table am-table-bordered am-table-radius am-table-striped">
            <thead>
              <tr class="am-success">
                <th class="table-check"><input type="checkbox" /></th>

                <th class="table-id">ID</th>
                <th class="table-title">角色名</th>
                <th class="table-author am-hide-sm-only">角色信息</th>
            
              </tr>
            </thead>
            <tbody>
            	<c:forEach items="${rolelist}" var="node">
			<tr>
				 <td><input type="checkbox" /></td>
				<td><c:out value="${node.id}"></c:out></td>
				<td><c:out value="${node.rolename}"></c:out></td>
				<td><c:out value="${node.massage}"></c:out></td>
             
                <td> 	
                	<div class="am-btn-toolbar">
                    <div class="am-btn-group am-btn-group-xs">
                      <button class="am-btn am-btn-default am-btn-xs am-text-success am-round"><span class="am-icon-search" title="查看订单详情"></span> </button>
                      <button class="am-btn am-btn-default am-btn-xs am-text-secondary am-round" data-am-modal="{target: '#my-popups'}" title="修改订单"><span class="am-icon-pencil-square-o"></span></button>
                      <a class="am-btn am-btn-default am-btn-xs am-text-danger am-round" title="删除会员" href="deleteshoppingUser?userid=${node.id}"><span class="am-icon-trash-o" ></span></a>
                    </div>
                  </div>
        	
     </td>
			</tr>
		</c:forEach>
            
              
            </tbody>
          </table>
          
                 <div class="am-btn-group am-btn-group-xs">
              <button type="button" class="am-btn am-btn-default"><span class="am-icon-plus"></span> 删除</button>
              <button type="button" class="am-btn am-btn-default"><span class="am-icon-save"></span> 上架</button>
              <button type="button" class="am-btn am-btn-default"><span class="am-icon-save"></span> 下架</button>
              <button type="button" class="am-btn am-btn-default"><span class="am-icon-save"></span> 移动</button>
              <button type="button" class="am-btn am-btn-default"><span class="am-icon-plus"></span> 新增</button>
              <button type="button" class="am-btn am-btn-default"><span class="am-icon-save"></span> 保存</button>
              <button type="button" class="am-btn am-btn-default"><span class="am-icon-archive"></span> 移动</button>
              <button type="button" class="am-btn am-btn-default"><span class="am-icon-trash-o"></span> 删除</button>
            </div>
          
          <ul class="am-pagination am-fr">
                <li class="am-disabled"><a href="#">«</a></li>
                <li class="am-active"><a href="inituser?pageNos=${pageNos}">1</a></li>
                <li><a href="inituser?pageNos=${pageNos+1 }">2</a></li>
                <li><a href="inituser?pageNos=${pageNos+2 }">3</a></li>
                <li><a href="inituser?pageNos=${pageNos+3 }">4</a></li>
                <li><a href="inituser?pageNos=${pageNos+4 }">5</a></li>
                <li><a href="inituser?pageNos=${pageNos+5 }">»</a></li>
              </ul>
          
          
          
      
          <hr />
          <p>注：.....</p>
        </form>
        
        <h3 center>角色权限显示</h3>
        
        
         <table width="100%" class="am-table am-table-bordered am-table-radius am-table-striped">
            <thead>
              <tr class="am-success">
               

                <th class="table-id">角色权限ID</th>
                <th class="table-title">角色名</th>
                <th class="table-author am-hide-sm-only">角色</th>
                <th class="table-author am-hide-sm-only">角色权限</th>
                  <th class="table-author am-hide-sm-only">权限地址</th>
                 <th class="table-author am-hide-sm-only">权限信息</th>
                <th width="130px" class="table-set">操作</th>
              </tr>
            </thead>
            <tbody>
          
            	<c:forEach items="${rplist}" var="node">
            	  
			    <tr>	
			    	<td><c:out value="${node.id}"></c:out></td>
				<td><c:out value="${node.rolename}"></c:out></td>
				<td><c:out value="${node.per_name}"></c:out></td>
				<td><c:out value="${node.per_url}"></c:out></td>
				<td><c:out value="${node.per_massger}"></c:out></td>
             	
                <td> 	
                	<div class="am-btn-toolbar">
                    <div class="am-btn-group am-btn-group-xs">
                       <button class="am-btn am-btn-default am-btn-xs am-text-success am-round"><span class="am-icon-search" title="查看订单详情"></span> </button>
                      <button class="am-btn am-btn-default am-btn-xs am-text-secondary am-round" data-am-modal="{target: '#my-popups'}" title="修改订单"><span class="am-icon-pencil-square-o"></span></button>
                      <a class="am-btn am-btn-default am-btn-xs am-text-danger am-round" title="删除会员" href="deleterolepri?rp_id=${node.id}"><span class="am-icon-trash-o" ></span></a>
                   
                      <%-- <a class="am-btn am-btn-default am-btn-xs am-text-danger am-round" title="删除会员" href="deleteshoppingUser?userid=${node.id}"><span class="am-icon-trash-o" ></span></a> --%>
                    </div>
                  </div>
              </td>
			</tr>
			
		</c:forEach>
            
              
            </tbody>
 </table>
        
        
        
        
        
        
        
        
        
        <h3 center>给角色添加权限</h3>

      <table width="100%" class="am-table am-table-bordered am-table-radius am-table-striped">
            <thead>
              <tr class="am-success">
               

               
                <th class="table-title">权限名称</th>
                <th class="table-author am-hide-sm-only">权限说明</th>
                <th class="table-author am-hide-sm-only">要添加本权限的角色ID</th>
                <th width="130px" class="table-set">操作</th>
              </tr>
            </thead>
            <tbody>
          
            	<c:forEach items="${perlist}" var="node">
            	   <form action="roleAddpri?perID=${node.id}" method="post">
			    <tr>	
				
				<td><c:out value="${node.per_name}"></c:out></td>
				<td><c:out value="${node.per_massger}"></c:out></td>
             	 <td><input type="text" name="roleID" ></td>
                <td> 	
                	<div class="am-btn-toolbar">
                    <div class="am-btn-group am-btn-group-xs">
                     <input type="submit" value="提交">
                      <%-- <a class="am-btn am-btn-default am-btn-xs am-text-danger am-round" title="删除会员" href="deleteshoppingUser?userid=${node.id}"><span class="am-icon-trash-o" ></span></a> --%>
                    </div>
                  </div>
              </td>
			</tr>
			</form>
		</c:forEach>
            
              
            </tbody>
 </table>
 
 
 
 
 <div class="foods">
  <ul>
    版权所有@2015. 模板收集自 <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> -  More Templates<a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a>
  </ul>
  <dl>
    <a href="" title="返回头部" class="am-icon-btn am-icon-arrow-up"></a>
  </dl>
</div>




</div>

</div>




</div>

<!--[if lt IE 9]>
<script src="http://libs.baidu.com/jquery/1.11.1/jquery.min.js"></script>
<script src="http://cdn.staticfile.org/modernizr/2.8.3/modernizr.js"></script>
<script src="assets/js/polyfill/rem.min.js"></script>
<script src="assets/js/polyfill/respond.min.js"></script>
<script src="assets/js/amazeui.legacy.js"></script>
<![endif]--> 

<!--[if (gte IE 9)|!(IE)]><!--> 
<script src="js/amazeui.min.js"></script>
<!--<![endif]-->



</body>
</html>