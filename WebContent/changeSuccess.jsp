<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<s:head theme="xhtml"/>
<sx:head parseContent="true"  extraLocales="UTF-8"/>	
<title>查询商家</title>
<!-- plugins:css -->
  <link rel="stylesheet" href="node_modules/mdi/css/materialdesignicons.min.css">
  <!-- endinject -->
  <!-- plugin css for this page -->
  <!-- End plugin css for this page -->
  <!-- inject:css -->
  <link rel="stylesheet" href="css/style.css">
  <!-- endinject -->
  <link rel="shortcut icon" href="images/favicon.png" />
    <style>
    <!--
    .mdc-list-group{
       height:605px;
    }
    .page-wrapper{
       background-color: #FFF;
    }
    #css-only-text-field-box{
       height:40px;
    }
    .container{
       width:1094px;
    }
    .form1{
        width:200px;
        height:100px;
        margin:180px auto;
        box-shadow: 10px 10px 5px #888888;;
    }
    .input1{width:200px;height:33px;}
    .input2{width:196px;height:33px;}
    .input3{width:200px;height:33px;}
    footer{background-color: #FFF;}
    -->
    </style>
</head>
<body> 
<div class="body-wrapper">
    <!-- partial:partials/_sidebar.html -->
    <aside class="mdc-persistent-drawer mdc-persistent-drawer--open">
      <nav class="mdc-persistent-drawer__drawer">
        <div class="mdc-persistent-drawer__toolbar-spacer">
          <a href="index.html" class="brand-logo">
                        <img src="images/logo.svg" alt="logo">
                    </a>
        </div>
        <div class="mdc-list-group">
          <nav class="mdc-list mdc-drawer-menu">
            <div class="mdc-list-item mdc-drawer-item">
              <a class="mdc-drawer-link" href="myinfo.jsp">
                <i class="material-icons mdc-list-item__start-detail mdc-drawer-item-icon" aria-hidden="true">desktop_mac</i>
                公司信息
              </a>
            </div>
            <div class="mdc-list-item mdc-drawer-item">
              <a class="mdc-drawer-link" href="orderfind.jsp">
                <i class="material-icons mdc-list-item__start-detail mdc-drawer-item-icon" aria-hidden="true">track_changes</i>
                订单查询
              </a>
            </div>
            <div class="mdc-list-item mdc-drawer-item" href="userfind.jsp" data-toggle="expansionPanel" target-panel="ui-sub-menu">
              <a class="mdc-drawer-link" href="userfind.jsp">
                <i class="material-icons mdc-list-item__start-detail mdc-drawer-item-icon" aria-hidden="true">dashboard</i>
                用户查询
                <i class="mdc-drawer-arrow material-icons">arrow_drop_down</i>
              </a>
              
            </div>
            <div class="mdc-list-item mdc-drawer-item">
              <a class="mdc-drawer-link" href="manager_select.jsp">
                <i class="material-icons mdc-list-item__start-detail mdc-drawer-item-icon" aria-hidden="true">grid_on</i>
                用户审核
              </a>
            </div>
            <div class="mdc-list-item mdc-drawer-item">
              <a class="mdc-drawer-link" href="change_select.jsp">
                <i class="material-icons mdc-list-item__start-detail mdc-drawer-item-icon" aria-hidden="true">pie_chart_outlined</i>
                用户处理
              </a>
            </div>
            <div class="mdc-list-item mdc-drawer-item" href="#" data-toggle="expansionPanel" target-panel="sample-page-submenu">
              <a class="mdc-drawer-link" href="index.jsp">
                <i class="material-icons mdc-list-item__start-detail mdc-drawer-item-icon" aria-hidden="true">pages</i>
               其它功能
                <i class="mdc-drawer-arrow material-icons">arrow_drop_down</i>
              </a>
              
            </div>
            <div class="mdc-list-item mdc-drawer-item purchase-link">
              <a href="login.jsp" target="_blank" class="mdc-button mdc-button--raised mdc-button--dense mdc-drawer-link" data-mdc-auto-init="MDCRipple">
                退出
              </a>
            </div>
          </nav>
        </div>
      </nav>
    </aside>
    <!-- partial -->
    <!-- partial:partials/_navbar.html -->
    <header class="mdc-toolbar mdc-elevation--z4 mdc-toolbar--fixed">
      <div class="mdc-toolbar__row">
        <section class="mdc-toolbar__section mdc-toolbar__section--align-start">
          <a href="#" class="menu-toggler material-icons mdc-toolbar__menu-icon">menu</a>
          <span class="mdc-toolbar__input">
            <div class="mdc-text-field">
              <input type="text" class="mdc-text-field__input" id="css-only-text-field-box" placeholder="快速搜索">
            </div>
          </span>
        </section>
        <section class="mdc-toolbar__section mdc-toolbar__section--align-end" role="toolbar">
          <div class="mdc-menu-anchor">
            <a href="#" class="mdc-toolbar__icon toggle mdc-ripple-surface" data-toggle="dropdown" toggle-dropdown="notification-menu" data-mdc-auto-init="MDCRipple">
              <i class="material-icons">notifications</i>
              <span class="dropdown-count">3</span>
            </a>
            <div class="mdc-simple-menu mdc-simple-menu--right" tabindex="-1" id="notification-menu">
              <ul class="mdc-simple-menu__items mdc-list" role="menu" aria-hidden="true">
                <li class="mdc-list-item" role="menuitem" tabindex="0">
                  <i class="material-icons mdc-theme--primary mr-1">email</i>
                  One unread message
                </li>
                <li class="mdc-list-item" role="menuitem" tabindex="0">
                  <i class="material-icons mdc-theme--primary mr-1">group</i>
                  One event coming up
                </li>
                <li class="mdc-list-item" role="menuitem" tabindex="0">
                  <i class="material-icons mdc-theme--primary mr-1">cake</i>
                  It's Aleena's birthday!
                </li>
              </ul>
            </div>
          </div>
          <div class="mdc-menu-anchor">
            <a href="#" class="mdc-toolbar__icon mdc-ripple-surface" data-mdc-auto-init="MDCRipple">
              <i class="material-icons">widgets</i>
            </a>
          </div>
          <div class="mdc-menu-anchor mr-1">
            <a href="#" class="mdc-toolbar__icon toggle mdc-ripple-surface" data-toggle="dropdown" toggle-dropdown="logout-menu" data-mdc-auto-init="MDCRipple">
              <i class="material-icons">more_vert</i>
            </a>
            <div class="mdc-simple-menu mdc-simple-menu--right" tabindex="-1" id="logout-menu">
                <ul class="mdc-simple-menu__items mdc-list" role="menu" aria-hidden="true">
                  <li class="mdc-list-item" role="menuitem" tabindex="0">
                    <i class="material-icons mdc-theme--primary mr-1">settings</i>
                    Settings
                  </li>
                  <li class="mdc-list-item" role="menuitem" tabindex="0">
                    <i class="material-icons mdc-theme--primary mr-1">power_settings_new</i>
                    Logout
                  </li>
                </ul>
            </div>
          </div>
        </section>
      </div>
    </header>
    <!-- partial -->
    <div class="page-wrapper mdc-toolbar-fixed-adjust">
      <main class="content-wrapper">
      <div class="posi">
        修改成功！
	  </div>
      </main>
      <!-- partial:partials/_footer.html -->
      <footer>
        <div class="mdc-layout-grid">
          <div class="mdc-layout-grid__inner">
            <div class="mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-6">
              <span class="text-muted">Copyright © 2018 <a class="text-green" href="#" target="_blank">运到了平台</a>. All rights reserved.</span>
            </div>
          </div>
        </div>
      </footer>
      <!-- partial -->
    </div>
  </div>
  <!-- body wrapper -->
  <!-- plugins:js -->
  <script src="node_modules/material-components-web/dist/material-components-web.min.js"></script>
  <script src="node_modules/jquery/dist/jquery.min.js"></script>
  <!-- endinject -->
  <!-- Plugin js for this page-->
  <script src="node_modules/chart.js/dist/Chart.min.js"></script>
  <script src="node_modules/progressbar.js/dist/progressbar.min.js"></script>
  <!-- End plugin js for this page-->
  <!-- inject:js -->
  <script src="js/misc.js"></script>
  <script src="js/material.js"></script>
  <!-- endinject -->
  <!-- Custom js for this page-->
  <script src="js/dashboard.js"></script>
  <!-- End custom js for this page-->
  
</body>
</html>
