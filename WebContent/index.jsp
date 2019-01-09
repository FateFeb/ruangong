<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>主页</title>
</head>
<body>
<head>
<s:head theme="xhtml"/>
<sx:head parseContent="true"  extraLocales="UTF-8"/>	
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <title>菜单栏</title>
  <!-- plugins:css -->
  <link rel="stylesheet" href="node_modules/mdi/css/materialdesignicons.min.css">
  <!-- endinject -->
  <!-- plugin css for this page -->
  <!-- End plugin css for this page -->
  <!-- inject:css -->
  <link rel="stylesheet" href="css/style.css">
  <!-- endinject -->
  <link rel="shortcut icon" href="images/favicon.png" />
  <style type="text/css">
  	.hhh{
  		font:22px/30px "微软雅黑";
  	}
  </style>
</head>

<body>
  <div class="body-wrapper">
    <!-- partial:partials/_sidebar.html -->
    <aside class="mdc-persistent-drawer mdc-persistent-drawer--open">
      <nav class="mdc-persistent-drawer__drawer">
        <div class="mdc-persistent-drawer__toolbar-spacer">
          <a href="index.jsp" class="brand-logo">
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
              <div class="mdc-expansion-panel" id="ui-sub-menu">
                <nav class="mdc-list mdc-drawer-submenu">
                  <div class="mdc-list-item mdc-drawer-item">
                    <a class="mdc-drawer-link" href="pages/ui-features/buttons.html">
                      Buttons
                    </a>
                  </div>
                  <div class="mdc-list-item mdc-drawer-item">
                    <a class="mdc-drawer-link" href="pages/ui-features/typography.html">
                      Typography
                    </a>
                  </div>
                </nav>
              </div>
            </div>
            <div class="mdc-list-item mdc-drawer-item">
              <a class="mdc-drawer-link" href="manager_select.jsp">
                <i class="material-icons mdc-list-item__start-detail mdc-drawer-item-icon" aria-hidden="true">grid_on</i>
                用户审核
              </a>
            </div>
            <div class="mdc-list-item mdc-drawer-item">
              <a class="mdc-drawer-link" href="#">
                <i class="material-icons mdc-list-item__start-detail mdc-drawer-item-icon" aria-hidden="true">pie_chart_outlined</i>
                用户处理
              </a>
            </div>
            <div class="mdc-list-item mdc-drawer-item" href="#" data-toggle="expansionPanel" target-panel="sample-page-submenu">
              <a class="mdc-drawer-link" href="#">
                <i class="material-icons mdc-list-item__start-detail mdc-drawer-item-icon" aria-hidden="true">pages</i>
               其它功能
                <i class="mdc-drawer-arrow material-icons">arrow_drop_down</i>
              </a>
              <div class="mdc-expansion-panel" id="sample-page-submenu">
                <nav class="mdc-list mdc-drawer-submenu">
                  <div class="mdc-list-item mdc-drawer-item">
                    <a class="mdc-drawer-link" href="pages/samples/blank-page.html">
                      Blank Page
                    </a>
                  </div>
                  <div class="mdc-list-item mdc-drawer-item">
                    <a class="mdc-drawer-link" href="pages/samples/403.html">
                      403
                    </a>
                  </div>
                  <div class="mdc-list-item mdc-drawer-item">
                    <a class="mdc-drawer-link" href="pages/samples/404.html">
                      404
                    </a>
                  </div>
                  <div class="mdc-list-item mdc-drawer-item">
                    <a class="mdc-drawer-link" href="pages/samples/500.html">
                      500
                    </a>
                  </div>
                  <div class="mdc-list-item mdc-drawer-item">
                    <a class="mdc-drawer-link" href="pages/samples/505.html">
                      505
                    </a>
                  </div>
                  <div class="mdc-list-item mdc-drawer-item">
                    <a class="mdc-drawer-link" href="pages/samples/login.html">
                      Login
                    </a>
                  </div>
                  <div class="mdc-list-item mdc-drawer-item">
                    <a class="mdc-drawer-link" href="pages/samples/register.html">
                      Register
                    </a>
                  </div>

                </nav>
              </div>
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
        <div class="mdc-layout-grid">
          <div class="mdc-layout-grid__inner">
            <div class="mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-12" style="display:none">
              <div class="mdc-card">
                <div class="mdc-layout-grid__inner">
                  <div class="mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-7">
                    <section class="purchase__card_section">
                      <p>Like what you see? Check out our premium version for more.</p>
                    </section>
                  </div>
                  <div class="mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-5">
                    <section class="purchase__card_section d-flex align-item-center">
                      <a href=" #themes/free-material-admin-template/" target="_blank" class="mdc-button mdc-button--stroked mdc-button--dense" data-mdc-auto-init="MDCRipple">
                        download free version
                      </a>
                      <a href=" #themes/free-material-admin-template/" target="_blank" class="mdc-button mdc-button--raised mdc-button--dense" data-mdc-auto-init="MDCRipple">
                        purchase
                      </a>
                    </section>
                  </div>
                </div>
              </div>
            </div>

            <div class="mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-8">
              <div class="mdc-layout-grid__inner">
                <div class="mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-6">
                  <div class="mdc-card py-3 pl-2 d-flex flex-row align-item-center">
                    <div class="mdc--tile mdc--tile-danger rounded">
                      <i class="mdi mdi-account-settings text-white icon-md"></i>
                    </div>
                    <div class="text-wrapper pl-1">
                      <h3 class="mdc-typography--display1 font-weight-bold mb-1">12</h3>
                      <p class="font-weight-normal mb-0 mt-0">待审核用户</p>
                    </div>
                  </div>
                </div>
                <div class="mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-6">
                  <div class="mdc-card py-3 pl-2 d-flex flex-row align-item-center">
                    <div class="mdc--tile mdc--tile-success rounded">
                      <i class="mdi mdi-basket text-white icon-md"></i>
                    </div>
                    <div class="text-wrapper pl-1">
                      <h3 class="mdc-typography--display1 font-weight-bold mb-1">1</h3>
                      <p class="font-weight-normal mb-0 mt-0">今日投诉数量</p>
                    </div>
                  </div>
                </div>
                <div class="mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-6">
                  <div class="mdc-card py-3 pl-2 d-flex flex-row align-item-center">
                    <div class="mdc--tile mdc--tile-warning rounded">
                      <i class="mdi mdi-ticket text-white icon-md"></i>
                    </div>
                    <div class="text-wrapper pl-1">
                      <h3 class="mdc-typography--display1 font-weight-bold mb-1">23</h3>
                      <p class="font-weight-normal mb-0 mt-0">今日订单数量</p>
                    </div>
                  </div>
                </div>
                <div class="mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-6">
                  <div class="mdc-card py-3 pl-2 d-flex flex-row align-item-center">
                    <div class="mdc--tile mdc--tile-primary rounded">
                      <i class="mdi mdi-account-star text-white icon-md"></i>
                    </div>
                    <div class="text-wrapper pl-1">
                      <h3 class="mdc-typography--display1 font-weight-bold mb-1">￥368.25</h3>
                      <p class="font-weight-normal mb-0 mt-0">今日订单总额</p>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <div class="mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-4">
              <div class="mdc-card d-flex flex-column">
                <div class="mdc-layout-grid__inner flex-grow-1">
                  <div class="mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-3"></div>
                  <div class="mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-6 d-flex align-item-center flex-column">
                    <h2 class="mdc-card__title mdc-card__title--large text-center mt-2 mb-2"><span class="hhh">公告</span>
                    <br>
                           元旦值班工时<br>
                           早班  8:00--18:00<br>
                           晚班  18:00--8:00<br>
                           工资按正常工资三倍发放<br>
                           请相互转告<br>
                           祝大家元旦愉快！
               </h2>
                    <div id="currentBalanceCircle" class="w-100"></div>
                  </div>
                  <div class="mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-3"></div>
                </div>
                <div class="mdc-layout-grid__inner">
                  <div class="mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-12">
                    <section class="mdc-card__action-footer mt-4 bg-red w-100">
                      <div class="col mdc-button" data-mdc-auto-init="MDCRipple">
                        <i class="mdi mdi-store icon-md"></i>
                      </div>
                      <div class="col mdc-button" data-mdc-auto-init="MDCRipple">
                        <i class="mdi mdi-phone-plus icon-md"></i>
                      </div>
                      <div class="col mdc-button" data-mdc-auto-init="MDCRipple">
                        <i class="mdi mdi-share-variant icon-md"></i>
                      </div>
                      <div class="col mdc-button" data-mdc-auto-init="MDCRipple">
                        <i class="mdi mdi-autorenew icon-md"></i>
                      </div>
                    </section>
                  </div>
                </div>
              </div>
            </div>
            <div class="mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-4">
              <div class="mdc-card card--with-avatar" style="display:none">
                <section class="mdc-card__primary">
                  <div class="card__avatar"><img src="images/faces/face1.jpg" alt=""></div>
                  <h1 class="mdc-card__title">Daniel Russel</h1>
                  <h2 class="mdc-card__subtitle">@danielrussel</h2>
                  <span class="social__icon-badge mdc-twitter mdi mdi-twitter"></span>
                </section>
                <section class="mdc-card__supporting-text pt-1">
                  <p class="mb-1">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam condimentum sem non mauris euismod hendrerit.Aliquam condimentum sem non mauris euismod hendrerit.</p>
                  <p class="mb-2">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam condimentum.</p>
                </section>
                <section class="mdc-card__social-footer bg-blue">
                  <div class="col">
                    <small>TWEETS</small>
                    <p>768.8k</p>
                  </div>
                  <div class="col">
                    <small>FOLLOWING</small>
                    <p>186.8k</p>
                  </div>
                  <div class="col">
                    <small>FOLLOWING</small>
                    <p>25.8k</p>
                  </div>
                </section>
              </div>
            </div>
            <div class="mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-8">
              <div class="mdc-card px-2 py-2" style="display:none">
                <div id="js-legend" class="chartjs-legend mb-2"></div>
                <canvas id="dashboard-monthly-analytics" height="205"></canvas>
              </div>
            </div>
            <div class="mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-12">
              <div class="mdc-card table-responsive">
                <div class="table-heading px-2 px-1 border-bottom">
                  <h1 class="mdc-card__title mdc-card__title--large">最新订单</h1>
                </div>
                <table class="table">
                  <thead>
                    <tr>
                      <th class="text-left">订单号</th>
                      <th>商家</th>
                      <th>骑手</th>
                      <th>货物</th>
                      <th>目的地</th>
                      <th>金额</th>
                      <th>下单时间</th>
                      <th>接单时间</th>
                      <th>运达时间</th>
                    </tr>
              <s:iterator value="#session.orderlist">
			   <tr>
				<th class="text-left">
				<s:property value="id" /></th>
				<th><s:property value="bid" /></th>
				<th><s:property value="rid" /></th>
				<th><s:property value="goods" /></th>
				<th><s:property value="end" /></th>
                <th><s:property value="price" /></th>
				<th><s:property value="starttime" /></th>
				<th><s:property value="gettime" /></th>
				<th><s:property value="endtime" /></th>
			   </tr>
		       </s:iterator>
                  </thead>
                  <tbody>
                    </tbody>
                  </table>
              </div>
            </div>
          </div>
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
</body>
</html>