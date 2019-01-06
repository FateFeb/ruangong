<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<s:head theme="xhtml"/>
<sx:head parseContent="true"  extraLocales="UTF-8"/>	

	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>注册选项</title>
	<link rel="stylesheet" type="text/css" href="reg_select/css/bootstrap-grid.min.css" />
	<link rel="stylesheet" type="text/css" href="reg_select/css/demo.css">
	
	<!--必要样式-->
	<link rel="stylesheet" type="text/css" href="reg_select/css/demo2.css">
</head>
<body>

	<div class="htmleaf-demo center">
	  <h1>通过审核</h1>
	  
	</div>
	
		<div class="demo2">
			<div class="container">
				<div class="row pad-15">
					<div class="col-sm-3">
						<!-- <a href="reg_rider.jsp" class="btn btn-lg red">注册成为骑手</a> -->
					</div>
                     <form action="getAllItems" method="post">
					<div class="col-sm-3">
					
						 <s:submit  value="继续审核" class="btn btn-lg blue"/>		
		            </div>
		            </form>
		            <div class="col-sm-3">
						<a href="index.jsp" class="btn btn-lg orange">返回主页</a>
					</div>
		       </div>
	       </div>
        </div>

</body>
</html>