<!DOCTYPE html>
<html lang="en">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

  <head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <meta name="description" content="">
    <meta name="author" content="">
    <title>SB Admin - Start Bootstrap Template</title>

    <!-- Bootstrap core CSS -->
    <link href="../resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
   
   <link href="https://gitcdn.github.io/bootstrap-toggle/2.2.2/css/bootstrap-toggle.min.css" rel="stylesheet">

    <!-- Custom fonts for this template -->
    <link href="../resources/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
	
    <!-- Plugin CSS -->
    <link href="../resources/vendor/datatables/dataTables.bootstrap4.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="../resources/css/sb-admin.css" rel="stylesheet">

  </head>

  <body class="fixed-nav sticky-footer bg-dark" id="page-top">

  <jsp:include page="../nav.jsp"/>
	
    <div class="content-wrapper">
    <%String alunos = request.getParameter( "alunos" );
	session.setAttribute( "alunos", alunos );
	%>

      <div class="container-fluid">

    	<div class="card-header">
          Cadastrar Aluno
        </div>
        <div class="card-body">
          <form>
           
               <div class="form-group">
            	<div class="form-row">
            		<div class="col-md-6">
						<label  for="inputNome">Nome</label>
						<input name="nome" type="text" class="form-control" id="inputNome" aria-describedby="nameHelp" placeholder="Digite o nome completo">  
					</div>
            	
             		<div class="col-md-6">
            			<label  for="inputCurso">Curso</label>
        				<select id="inputCurso" class="form-control">
 			 				<option>Técnico em Mecânica</option>
  							<option>Técnico em Eletrotécnica</option>
  			
						</select>
					</div>
					
		 			
              </div>
			</div>
        	
        	<button class="btn btn-primary btn-block" type="button" id="adicionar" data-toggle="modal" data-target="#exampleModal" >Adicionar Aluno</button>
            <button class="btn btn-primary btn-block" type="submit" >Criar turma</button>
          
          </form>

       
</div>


      </div>
      <!-- /.container-fluid -->

    </div>
    <!-- /.content-wrapper -->


	<jsp:include page="../footer.jsp"/>
   

    <!-- Logout Modal -->
    <div class="modal fade bs-example-modal-lg" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
      <div class="modal-dialog modal-lg" role="document">
        <div class="modal-content ">
          <div class="modal-header">
            <h5 class="modal-title" id="exampleModalLabel"><i class="fa fa-table"></i> Alunos Cadastrados</h5>
            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
              <span aria-hidden="true">&times;</span>
            </button>
          </div>
          <div class="modal-body">
          
         	<!-- Example Tables Card -->
				<div class="card mb-3">
					
					<div class="card-body">
						<div class="table-responsive">
							<table class="table table-bordered" width="100%" id="dataTable"
								cellspacing="0">
								<thead>
									<tr>
										<th>Nome</th>
										<th>CPF</th>
										<th>Matricular</th>
								
									</tr>
								</thead>
								<tfoot>
									<tr>
										<th>Nome</th>
										<th>CPF</th>
										<th>Matricular</th>
								
									</tr>
								</tfoot>
								<tbody id="tabela-corpo">
									<c:forEach items="${alunos}" var="var" varStatus="it">
										<c:set value="${it.count}" var="i" />
										<input name ="alunos[${i}].cpf" value="${var.cpf}" type="hidden">
										<input name ="alunos[${i}].nome" value="${var.nome}" type="hidden">
										<input name ="alunos[${i}].rg" value="${var.rg}" type="hidden">
										<input name ="alunos[${i}].endereco" value="${var.endereco}" type="hidden">
										<input name ="alunos[${i}].email" value="${var.email}" type="hidden">
										<input name ="alunos[${i}].sexo" value="${var.sexo}" type="hidden">
										
									'	<input name ="alunos[${i}].curso" value="${var.curso}" type="hidden">
										<input name ="alunos[${i}].celular" value="${var.celular}" type="hidden">
										<input name ="alunos[${i}].telefoneFixo" value="${var.telefoneFixo}" type="hidden">
										<tr>
										
											<td> ${var.nome}</td>
											<td>${var.cpf}</td>
											<td>
												
												<input   type="checkbox" name ="alunos[${i}].telefoneFixo" data-toggle="toggle"  id="option" > 
												
<!-- 											 <a id="editar"  href=""  class="btn btn-primary"> -->
<!-- 													<i class="fa fa-fw fa-edit"> </i>  -->
<!-- 											</a> -->
											</td> 

										</tr>
									</c:forEach>
								
								</tbody>
							</table>
						</div>
					</div>
					<div class="card-footer small text-muted"></div>
				</div>
				
          </div>
          <div class="modal-footer">
          
            <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
            <form action="/siscaf/turma/cadastrarAluno" method="post">
            	<button type="submit" class="btn btn-primary" >Logout</button>
            </form>
            
            
            	
            
            
            
            
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

	
	<script src="https://gitcdn.github.io/bootstrap-toggle/2.2.2/js/bootstrap-toggle.min.js"></script>
    <!-- Custom scripts for this template -->
    <script src="../resources/js/sb-admin.min.js"></script>
    
    
  </body>

</html>