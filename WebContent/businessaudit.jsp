<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
	<head>
	    
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>管理员审核</title>

		<!-- Bootstrap -->
		<link href="audit/css/bootstrap.css" rel="stylesheet">
		<link href="audit/css/font-awesome.css" rel="stylesheet">
		<link href="audit/css/style.css" rel="stylesheet">

		<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
		<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
		<!--[if lt IE 9]>
		  <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
		  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
		<![endif]-->
		<style type="text/css">
		    .font-size{
		      font:20px/30px "微软雅黑";
		      margin-left:800px;
		    }
		    .sss{
		    	margin:100px 0 0 390px;
		    }
		</style>
		
	</head>
	<body>
		<div class="home">
			<div class="container">			
				<header>
					<h1>注册情况审核
					</h1>	
				</header> 
			</div>
		</div>
	   <form action="getAllItems" method="post">
       <div class="font-size">
	       <span>用户名：</span><s:property value="cBusiness.id"/><br>
	       <span>商家名：</span><s:property value="cBusiness.name"/><br>
	       <span>手机号：</span><s:property value="cBusiness.phone"/><br>
	       <span> 地址：</span><s:property value="cBusiness.address"/><br>
       </div>

       </form>
			<div class="container">	
				<div class="smart-body">
					<div class="row">
					 <form action="pass" method="post">
						<div class="col-xs-2">
						  <input type="submit" class="sss btn btn-block btn-lg btn-success btn-icon" value = "通过">
						</div>
					 </form>
						
                     <form action="unpass" method="post">
						<div class="col-xs-2">
						  <input type="submit" class="sss btn btn-block btn-lg btn-danger btn-icon" value = "不通过">
						</div>
					 </form>	
					</div>
				</div>
			</div>
			<!-- END BUTTONS ELEMENTS -->
		<body background="audit/images/bkg.jpg" style="background-repeat:no-repeat; background-size:100% 100%; background-attachment: fixed;" >	
	</body>
</html>
