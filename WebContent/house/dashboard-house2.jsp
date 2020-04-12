<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">
<meta charset="ISO-8859-1">
<title>House Allocation</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">    
    
<link	href="../../plugins/overlayScrollbars/css/OverlayScrollbars.min.css">
<!-- Theme style -->
<link rel="stylesheet" href="../dist/css/adminlte.min.css">
<!-- Google Font: Source Sans Pro -->
<link
	href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700"
	rel="stylesheet">
	
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">


<link rel="stylesheet" href="../css/house.css">
</head>
<body>

<!-- new things -->
<!-- Site wrapper -->
	<div class="wrapper">
		<!-- Navbar -->
		<nav
			class="main-header navbar navbar-expand navbar-white navbar-light">
		<!-- Left navbar links -->
		<ul class="navbar-nav">
			<li class="nav-item"><a class="nav-link" data-widget="pushmenu"
				href="#" role="button"><i class="fas fa-bars"></i></a></li>
			<li class="nav-item d-none d-sm-inline-block"><a
				href="../home.jsp" class="nav-link">Home</a></li>
			<li class="nav-item d-none d-sm-inline-block"><a href="#"
				class="nav-link">Contact</a></li>
		</ul>

		<!-- SEARCH FORM -->
		<form class="form-inline ml-3">
			<div class="input-group input-group-sm">
				<input class="form-control form-control-navbar" type="search"
					placeholder="Search" aria-label="Search">
				<div class="input-group-append">
					<button class="btn btn-navbar" type="submit">
						<i class="fas fa-search"></i>
					</button>
				</div>
			</div>
		</form>

		<!-- Right navbar links -->
		<ul class="navbar-nav ml-auto">
			<!-- Messages Dropdown Menu -->
			<li class="nav-item dropdown"><a class="nav-link"
				data-toggle="dropdown" href="#"> <i class="far fa-comments"></i>
					<span class="badge badge-danger navbar-badge">3</span>
			</a>
				<div class="dropdown-menu dropdown-menu-lg dropdown-menu-right">
					<a href="#" class="dropdown-item"> <!-- Message Start -->
						<div class="media">
							<img src="../../dist/img/user1-128x128.jpg" alt="User Avatar"
								class="img-size-50 mr-3 img-circle">
							<div class="media-body">
								<h3 class="dropdown-item-title">
									Brad Diesel <span class="float-right text-sm text-danger"><i
										class="fas fa-star"></i></span>
								</h3>
								<p class="text-sm">Call me whenever you can...</p>
								<p class="text-sm text-muted">
									<i class="far fa-clock mr-1"></i> 4 Hours Ago
								</p>
							</div>
						</div> <!-- Message End -->
					</a>
					<div class="dropdown-divider"></div>
					<a href="#" class="dropdown-item"> <!-- Message Start -->
						<div class="media">
							<img src="../../dist/img/user8-128x128.jpg" alt="User Avatar"
								class="img-size-50 img-circle mr-3">
							<div class="media-body">
								<h3 class="dropdown-item-title">
									John Pierce <span class="float-right text-sm text-muted"><i
										class="fas fa-star"></i></span>
								</h3>
								<p class="text-sm">I got your message bro</p>
								<p class="text-sm text-muted">
									<i class="far fa-clock mr-1"></i> 4 Hours Ago
								</p>
							</div>
						</div> <!-- Message End -->
					</a>
					<div class="dropdown-divider"></div>
					<a href="#" class="dropdown-item"> <!-- Message Start -->
						<div class="media">
							<img src="../../dist/img/user3-128x128.jpg" alt="User Avatar"
								class="img-size-50 img-circle mr-3">
							<div class="media-body">
								<h3 class="dropdown-item-title">
									Nora Silvester <span class="float-right text-sm text-warning"><i
										class="fas fa-star"></i></span>
								</h3>
								<p class="text-sm">The subject goes here</p>
								<p class="text-sm text-muted">
									<i class="far fa-clock mr-1"></i> 4 Hours Ago
								</p>
							</div>
						</div> <!-- Message End -->
					</a>
					<div class="dropdown-divider"></div>
					<a href="#" class="dropdown-item dropdown-footer">See All
						Messages</a>
				</div></li>
			<!-- Notifications Dropdown Menu -->
			<li class="nav-item dropdown"><a class="nav-link"
				data-toggle="dropdown" href="#"> <i class="far fa-bell"></i> <span
					class="badge badge-warning navbar-badge">15</span>
			</a>
				<div class="dropdown-menu dropdown-menu-lg dropdown-menu-right">
					<span class="dropdown-item dropdown-header">15 Notifications</span>
					<div class="dropdown-divider"></div>
					<a href="#" class="dropdown-item"> <i
						class="fas fa-envelope mr-2"></i> 4 new messages <span
						class="float-right text-muted text-sm">3 mins</span>
					</a>
					<div class="dropdown-divider"></div>
					<a href="#" class="dropdown-item"> <i class="fas fa-users mr-2"></i>
						8 friend requests <span class="float-right text-muted text-sm">12
							hours</span>
					</a>
					<div class="dropdown-divider"></div>
					<a href="#" class="dropdown-item"> <i class="fas fa-file mr-2"></i>
						3 new reports <span class="float-right text-muted text-sm">2
							days</span>
					</a>
					<div class="dropdown-divider"></div>
					<a href="#" class="dropdown-item dropdown-footer">See All
						Notifications</a>
				</div></li>
			<li class="nav-item"><a class="nav-link"
				data-widget="control-sidebar" data-slide="true" href="#"
				role="button"> <i class="fas fa-th-large"></i>
			</a></li>
			
			<li class="nav-item d-none d-sm-inline-block"><a
				href="#" class="nav-link">Logout</a></li>
		</ul>
		</nav>



		<!--  -->
		<!-- /.navbar -->

		<!-- Main Sidebar Container -->
		<aside class="main-sidebar sidebar-dark-primary elevation-4">
		<!-- Brand Logo --> <a href="../home.jsp" class="brand-link">
			<img src="../images/logo.png" alt="AdminLTE Logo"
			class="brand-image img-circle elevation-3" style="opacity: .8">
			<span class="brand-text font-weight-light"><b><i>Sunshine Apartments</i></b></span>
		</a> <!-- Sidebar -->
		<div class="sidebar">
			<!-- Sidebar user (optional) -->
			<div class="user-panel mt-3 pb-3 mb-3 d-flex">
				<div class="image">
					<img src="../images/userIcon.png"
						class="img-circle elevation-2" alt="User Image">
				</div>
				<div class="info">
					<a href="#" class="d-block">Alexander Pierce</a>
				</div>
			</div>

			<!-- Sidebar Menu -->
			<nav class="mt-2">
			<ul class="nav nav-pills nav-sidebar flex-column"
				data-widget="treeview" role="menu" data-accordion="false">
				<!-- Add icons to the links using the .nav-icon class
               with font-awesome or any other icon font library -->
				<li class="nav-item has-treeview"><a href="#" class="nav-link">
						<i class="nav-icon fas fa-tachometer-alt"></i>
						<p>
							Dashboard <i class="right fas fa-angle-left"></i>
						</p>
				</a>
					<ul class="nav nav-treeview">
						<li class="nav-item"><a href="#"
							class="nav-link"> <i class="far fa-circle nav-icon"></i>
								<p>Dashboard v1</p>
						</a></li>
						<li class="nav-item"><a href="#"
							class="nav-link"> <i class="far fa-circle nav-icon"></i>
								<p>Dashboard v2</p>
						</a></li>
						<li class="nav-item"><a href="#"
							class="nav-link"> <i class="far fa-circle nav-icon"></i>
								<p>Dashboard v3</p>
						</a></li>
					</ul></li>
				<li class="nav-item has-treeview menu-open">
					<ul class="nav nav-treeview">
						<li class="nav-item"><a href="#"
							class="nav-link"> <i class="far fa-circle nav-icon"></i>
							<p>
							Floors <span class="right badge badge-danger">New</span>
						</p>	
						</a></li>
						<li class="nav-item"><a href="#"
							class="nav-link"> <i class="far fa-circle nav-icon"></i>
								<p>Employees</p>
						</a></li>
						<li class="nav-item"><a href="#"
							class="nav-link"> <i class="far fa-circle nav-icon"></i>
								<p>Owners</p>
						</a></li>
						<li class="nav-item"><a href="#"
							class="nav-link active"> <i class="far fa-circle nav-icon"></i>
								<p>Tenants</p>
						</a></li>
						<li class="nav-item"><a href="#"
							class="nav-link"> <i class="far fa-circle nav-icon"></i>
								<p>Funds</p>
						</a></li>
						<li class="nav-item"><a href="#"
							class="nav-link"> <i class="far fa-circle nav-icon"></i>
								<p>Complaints</p>
						</a></li>
						<li class="nav-item"><a
							href="#" class="nav-link"> <i
								class="far fa-circle nav-icon"></i>
								<p>Facilities</p>
						</a></li>
						<li class="nav-item"><a
							href="#" class="nav-link"> <i
								class="far fa-circle nav-icon"></i>
								<p>Assets</p>
						</a></li>
						<li class="nav-item"><a
							href="#" class="nav-link"> <i
								class="far fa-circle nav-icon"></i>
								<p>Visitors</p>
						</a></li>
						<a href="#"
					class="nav-link active"> <i class="nav-icon fas fa-copy"></i>
						<p>
							House Allocation <i class="fas fa-angle-left right"></i> <span
								class="badge badge-info right">6</span>
						</p>
				</a>
					</ul></li>
			</ul>
			</nav>
			<!-- /.sidebar-menu -->
		</div>
		<!-- /.sidebar --> </aside>
		//end
		

		
		<!-- Content Wrapper. Contains page content -->
		<div class="content-wrapper">
			<!-- Content Header (Page header) -->
			<section class="content-header">
			<div class="container-fluid">
				<div class="row mb-2">
					<div class="col-sm-6">
						<h1>House Management Dashboard</h1>
					</div>
					<div class="col-sm-6">
						<ol class="breadcrumb float-sm-right">
							<li class="breadcrumb-item"><a href="../home.jsp">Home</a></li>
							<li class="breadcrumb-item active">House Allocation Dashboard</li>
						</ol>
					</div>
				</div>
			</div>
			<!-- /.container-fluid --> </section>

			<!-- Main content -->
			<section class="content">

			<div class="container-fluid">
				<div class="row">
					<div class="col-12">
						<!-- Default box -->
						<div class="card">
							<div class="card-header">
								<div class="container text-right">
				 <a href="../home.jsp"><button type="button" class="btn btn-default btn-sm">
           <i class="fa fa-angle-left"></i> Back  
        </button></a>	
				</div>
							</div>
							<div class="card-body">
			
	
			<a href="add-house2.jsp"><div class="container text-center">
			<div class="w3-card-4" style="width:100%;">
    <header class="w3-container w3-blue">
      <h1>Add Houses</h1>
    </header>
    <footer class="w3-container w3-blue">
      <h5>Keep Records of Houses</h5>
    </footer>
  </div>
</div></a>

<br>

	<a href="view-house2.jsp">
	<div class="container text-center">
			<div class="w3-card-4" style="width:100%;">
    <header class="w3-container w3-orange">
      <h1>List of Houses</h1>
    </header>
    <footer class="w3-container w3-orange">
      <h5>Manage House Details</h5>
    </footer>
  </div>
</div></a>

<br>

<a href="search-house2.jsp">
<div class="container text-center">
			<div class="w3-card-4" style="width:100%;">
    <header class="w3-container w3-red">
      <h1>Find Houses</h1>
    </header>
    <footer class="w3-container w3-red">
      <h5>Search For particular House</h5>
    </footer>
  </div>
</div></a>

<br>

<a href="report-house2.jsp">
<div class="container text-center">
			<div class="w3-card-4" style="width:100%;">
    <header class="w3-container w3-green">
      <h1>Generate Reports</h1>
    </header>
    <footer class="w3-container w3-green">
      <h5>Parameter/Non-Parameter wise Records</h5>
    </footer>
  </div>
</div></a>
			
			</div>
			
			
			
				


	
			
								<div class="card-footer"><h6 class="container text-right">By Sumithraarachchi D.H.G(IT18123982)</h6></div>
								<!-- /.card-footer-->
							</div>
							<!-- /.card -->
						</div>
					</div>
				</div>
			</section>
			<!-- /.content -->
		</div>
		<!-- /.content-wrapper -->

	
	<footer class="main-footer">
		<div class="float-right d-none d-sm-block">
			<b>Wellawatta,Colombo,</b> Sri Lanka
		</div>
		<strong>Copyright &copy; 2020<a
			href="#">Sunshine Apartments</a>.
		</strong> All rights reserved. </footer>













		
          
		
         

</body>
</html>