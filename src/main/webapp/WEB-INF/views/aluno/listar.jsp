<!DOCTYPE html>
<html lang="en">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<meta name="description" content="">
<meta name="author" content="">
<title>SB Admin - Start Bootstrap Template</title>

<!-- Bootstrap core CSS -->
<link href="../resources/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Custom fonts for this template -->
<link href="../resources/vendor/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">

<!-- Plugin CSS -->
<link href="../resources/vendor/datatables/dataTables.bootstrap4.css"
	rel="stylesheet">

<!-- Custom styles for this template -->
<link href="../resources/css/sb-admin.css" rel="stylesheet">

</head>

<body class="fixed-nav sticky-footer bg-dark" id="page-top">

	<jsp:include page="../nav.jsp" />

	<div class="content-wrapper">

		<div   class="container-fluid">
	<%String msg = request.getParameter( "msg" );
	session.setAttribute( "msg", msg );
	%>
	<div  id="alert-info" class="alert alert-info" role="alert">${msg}
		<button type="button" class="close" data-dismiss="alert" aria-label="Close">
  			<span aria-hidden="true">&times;</span>
		</button>
		
	</div>


				<!-- Example Tables Card -->
				<div class="card mb-3">
					<div class="card-header">
						<i class="fa fa-table"></i> Alunos Cadastrados
						<div></div>
						<a href="cadastrar" style="float: right;"
							class="btn btn-primary"> <i class="fa fa-fw fa-plus"> </i>

							Cadastro


						</a>


					</div>
					<div class="card-body">
						<div class="table-responsive">
							<table class="table table-bordered" width="100%" id="dataTable"
								cellspacing="0">
								<thead>
									<tr>
										<th>Nome</th>
										<th>CPF</th>
										<th>RG</th>
										<th>Endereco</th>
										<th>Email</th>
										<th>Sexo</th>
										<th>Curso</th>
										<th>Opções</th>
									</tr>
								</thead>
								<tfoot>
									<tr>
										<th>Nome</th>
										<th>CPF</th>
										<th>RG</th>
										<th>Endereco</th>
										<th>Email</th>
										<th>Sexo</th>
										<th>Curso</th>
										<th>Opções</th>
									</tr>
								</tfoot>
								<tbody>
									<c:forEach items="${lista}" var="var">
										<tr>
											<td >${var.nome}</td>
											<td>${var.cpf}</td>
											<td>${var.rg}</td>
											<td>${var.endereco}</td>
											<td>${var.email}</td>
											<td>${var.sexo}</td>
											<td>${var.curso}</td>
											<td ><a id="deletar" href="/siscaf/aluno/${var.id}/deletar"
												class="btn btn-danger"> <i class="fa fa-fw fa-remove">
												</i> 
											</a> <a id="editar"  href="/siscaf/aluno/${var.id}/editar"  class="btn btn-primary">
													<i class="fa fa-fw fa-edit"> </i> 
											</a> </td>


										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
					<div class="card-footer small text-muted"></div>
				</div>









		</div>
		<!-- /.container-fluid -->

	</div>
	<!-- /.content-wrapper -->


	<jsp:include page="../footer.jsp" />


	<!-- Logout Modal -->
	<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">Select "Logout" below if you are ready
					to end your current session.</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">Cancel</button>
					<a class="btn btn-primary" href="login.html">Logout</a>
				</div>
			</div>
		</div>
	</div>

	<!-- Bootstrap core JavaScript -->
	<script src="../resources/vendor/jquery/jquery.min.js"></script>
	<script src="../resources/vendor/popper/popper.min.js"></script>
	<script src="../resources/vendor/bootstrap/js/bootstrap.min.js"></script>

	<!-- Plugin JavaScript -->
	<script src="../resources/vendor/jquery-easing/jquery.easing.min.js"></script>
	<script src="../resources/vendor/chart.js/Chart.min.js"></script>
	<script src="../resources/vendor/datatables/jquery.dataTables.js"></script>
	<script src="../resources/vendor/datatables/dataTables.bootstrap4.js"></script>

	<!-- Custom scripts for this template -->
	<script src="../resources/js/sb-admin.min.js"></script>
	<script type="text/javascript">
	 $(document).ready (function(){
//             $("#alert-info").hide();
            $("#deletar").click(function showAlert() {
                $("#alert-info").show();
//                 window.setTimeout(function () { 
//                             $("#alert-info").alert('close'); }, 200);               
                  });       
                    });
	 </script>


</body>

</html>