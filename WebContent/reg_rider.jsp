<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "s" uri = "/struts-tags" %>
<%@ taglib prefix = "sx" uri = "/struts-dojo-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>骑手注册页面</title>
    <link rel="stylesheet" type="text/css" href="register/css/regist.css">
    <script type="text/javascript" src="register/js/jquery.min.js"></script>
</head>
<body>
    <div class="wrapper">
        <article>
            <h1><span>众包同城跑腿服务平台</span></h1>
                  <div class="main">
                <form action="riderreg" method="post">
                     <div class="userName">
                        <input type="text" name="registerUser.id" placeholder="用户名"><em>由5-8个字符组成！</em>
                    </div>
                    
                    <div class="password">
                        <input type="password" name="registerUser.pwd" placeholder="密码"><em>使用字母、数字、符号两种及以上的组合，8-12个字符</em>
                    </div>
                    
                    <div class="againpwd">
                        <input type="password" name="registerUser.repwd" placeholder="再次输入密码">
                    </div>
                    
                    <div>
                        <input type="text" name="registerUser.name" placeholder="姓名"><em>请输入真实姓名！</em>
                    </div>
                    
                    <div class="tel">
                        <input type="tel" name="registerUser.phone" placeholder="手机号"><em>由11个字符组成！</em>
                    </div>
                   
                    
                    
                    <input type = "submit"  value = "注册"/>
                    <!--<button>注册</button>-->
                </form>
            </div>
        </article>
        <footer>
            <ul>
                <li><a href="#">联系我们</a></li>
                <li><a href="#">关于我们</a></li>
                <li><a href="#">人才招聘</a></li>
                <li><a href="#">友情链接</a></li>
                <li><a href="#">公司地址</a></li>
                <li><a href="#">关注我们</a></li>
            </ul>
            
        </footer>
    </div>
</body>
</html>


