<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page
	import="helper.House2Helper,model.House2,controller.*, java.util.ArrayList, java.sql.*"%>

<!-- update-house2.jsp. This jsp page allows the user to update houses' details in the system,
 @author Sumithraarachchi D.H.G(IT18123982) -->

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit House Details</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

<link	href="../../plugins/overlayScrollbars/css/OverlayScrollbars.min.css">
<!-- Theme style -->
<link rel="stylesheet" href="../dist/css/adminlte.min.css">
<!-- Google Font: Source Sans Pro -->
<link
	href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700"
	rel="stylesheet">
	
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
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
						<a href="dashboard-house2.jsp"
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
						<h1>Edit House Details</h1>
					</div>
					<div class="col-sm-6">
						<ol class="breadcrumb float-sm-right">
							<li class="breadcrumb-item"><a href="../home.jsp">Home</a></li>
							<li class="breadcrumb-item"><a href="dashboard-house2.jsp">House Allocation Dashboard</a></li>
							<li class="breadcrumb-item active">Edit House Details</li>
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
				 <a href="dashboard-house2.jsp"><button type="button" class="btn btn-default btn-sm">
           <i class="fa fa-angle-left"></i> Back  
        </button></a>
				</div>
							</div>
							<div class="card-body">
							
			<%
				House2Helper h2h = new House2Helper();
				ArrayList<House2> house2List = h2h.displayHouse2();

				for (House2 house : house2List) {
			%>


	


				<form method="post" action="../AddHouse2Controller">

					<fieldset class="form-group">
						<label>Floor No</label><select class="form-control" type="number"
							name="h2FloorNo">
							<option value="<%=house.getH2FloorNo()%>"><%=house.getH2FloorNo()%></option>
							<option value="1" >1</option>
							<option value="2">2</option>
							<option value="3">3</option>
							<option value="4">4</option>
							<option value="5">5</option>
							<option value="6">6</option>
							<option value="7">7</option>
						</select>
					</fieldset>

					<fieldset class="form-group">
						<label>No of Bedrooms</label><select class="form-control"
							type="number" name="h2NoBeds">
							<option value="<%=house.getH2NoBeds()%>"><%=house.getH2NoBeds()%></option>
							<option value="1" >1</option>
							<option value="2">2</option>
							<option value="3">3</option>
							<option value="4">4</option>
							<option value="5">5</option>
						</select>
					</fieldset>

					<fieldset class="form-group">
						<label>No of Bathrooms</label><select class="form-control"
							type="number" name="h2NoBaths">
							<option value="<%=house.getH2NoBaths()%>"><%=house.getH2NoBaths()%></option>
							<option value="1" >1</option>
							<option value="2">2</option>
							<option value="3">3</option>
						</select>
					</fieldset>

					<fieldset class="form-group">
						<label>Sqft</label><input type="number" class="form-control"
							name="h2Sqft" value="<%=house.getH2Sqft()%>">
					</fieldset>

					<fieldset class="form-group">
						<label>House Type</label><select class="form-control" type="text"
							name="h2HouseType">
							<option value="<%=house.getH2HouseType()%>"><%=house.getH2HouseType()%></option>
							<option value="studio" >Studio</option>
							<option value="loft">Loft</option>
							<option value="duplex/triplex">Duplex/Triplex</option>
							<option value="garden">Garden</option>
						</select>
					</fieldset>

					<fieldset class="form-group">
						<label>Status</label><select class="form-control" type="text"
							name="h2Status">
							<option value="<%=house.getH2Status()%>"><%=house.getH2Status()%></option>
							<option value="available" >Available</option>
							<option value="underConstruction">Under Construction</option>
						</select>
					</fieldset>

					<fieldset class="form-group">
						<label>Price</label><input type="number" class="form-control"
							name="h2Price" value="<%=house.getH2Price()%>">
					</fieldset>

					<fieldset class="form-group">
						<label>Advance Payment / Bond</label><input type="number"
							class="form-control" name="h2AdvancePayment" value="<%=house.getH2AdvancePayment()%>">
					</fieldset>

					<fieldset class="form-group">
						<label>Per Month Rate</label><input type="number"
							class="form-control" name="h2PerMonthRate" value="<%=house.getH2PerMonthRate()%>">
					</fieldset>

					<fieldset class="form-group">
						<label>Rent</label><select class="form-control" name="h2Rent">
						<option value="<%=house.getH2Rent()%>"><%=house.getH2Rent()%></option>
							<option value="true" >Yes</option>
							<option value="false">No</option>
						</select>
					</fieldset>

					<fieldset class="form-group">
						<label>Gas Supply</label><select class="form-control"
							name="h2GasSupply">
							<option value="<%=house.getH2GasSupply()%>"><%=house.getH2GasSupply()%></option>
							<option value="true">Yes</option>
							<option value="false">No</option>
						</select>
					</fieldset>

					<fieldset class="form-group">
						<label>Hot Water</label><select class="form-control"
							name="h2HotWater">
							<option value="<%=house.getH2HotWater()%>"><%=house.getH2HotWater()%></option>
							<option value="true">Yes</option>
							<option value="false">No</option>
						</select>
					</fieldset>

					<div class="w3-container w3-center">
					<div class="w3-bar">
					<button type="submit" class="btn btn-success">Update</button></div></div>

				</form>

			
			<h6 class="container text-right">By Sumithraarachchi D.H.G(IT18123982)</h6>
	
	
	<%
				}
			%>
		
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