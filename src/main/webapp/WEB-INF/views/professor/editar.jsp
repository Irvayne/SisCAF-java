<!DOCTYPE html>
<html lang="en">

  <head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <meta name="description" content="">
    <meta name="author" content="">
    <title>SB Admin - Start Bootstrap Template</title>

    <!-- Bootstrap core CSS -->
    <link href="/siscaf/resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom fonts for this template -->
    <link href="/siscaf/resources/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- Plugin CSS -->
    <link href="/siscaf/resources/vendor/datatables/dataTables.bootstrap4.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="/siscaf/resources/css/sb-admin.css" rel="stylesheet">

  </head>

  <body class="fixed-nav sticky-footer bg-dark" id="page-top">

  <jsp:include page="../nav.jsp"/>
	
    <div class="content-wrapper">

      <div class="container-fluid">

    	<div class="card-header">
          Editar Professor
        </div>
        <div class="card-body">
          <form action="/siscaf/professor/editar" method="post">
			
			<input type="hidden" name="id" value="${professor.id}">
          
            <div class="form-group">           
                  <label  for="inputNome">Nome Completo</label>
                  <input value="${professor.nome}" name="nome" type="text" class="form-control" id="inputNome" aria-describedby="nameHelp" placeholder="Digite o nome completo">           
              </div>
        	
        	
        	
        	<div class="form-group">
              <div class="form-row">
                <div class="col-md-6">
                  <label for="inputCPF">CPF</label>
                  <input value="${professor.cpf}" name="cpf" type="number" class="form-control" id="inputCPF" placeholder="Digite o CPF">
                </div>
                <div class="col-md-6">
                  <label for="inputRG">RG</label>
                  <input value="${professor.rg}" name="rg" type="number" class="form-control" id="inputRG" placeholder="Digite o RG">
                </div>
              </div>
            </div>
        
            <div class="form-group">
              <label for="exampleInputEmail1">Endereço</label>
              <input value="${professor.endereco}" name="endereco" type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
            </div>
            
           <div class="form-group">
              <label for="inputEmail">Email address</label>
              <input value="${professor.email}" name="email" type="text" class="form-control" id="inputEmail" aria-describedby="emailHelp" placeholder="Digite o email">
            </div>
            
         
            
            <div class="form-group">
              <div class="form-row">
                <div class="col-md-6">
                  <label for="inputSenha">Password</label>
                  <input value="${professor.senha}" name="senha" type="password" class="form-control" id="inputSenha" placeholder="Password">
                </div>
                <div class="col-md-6">
                  <label for="inputSenha1">Confirm password</label>
                  <input type="password" class="form-control" id="inputSenha1" placeholder="Confirmar password">
                </div>
              </div>
            </div>
            <button class="btn btn-primary btn-block" type="submit" >Salvar</button>
          
          </form>

       
</div>


      </div>
      <!-- /.container-fluid -->

    </div>
    <!-- /.content-wrapper -->


	<jsp:include page="../footer.jsp"/>
   

    <!-- Logout Modal -->
    <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
      <div class="modal-dialog" role="document">
        <div class="modal-content">
          <div class="modal-header">
            <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
              <span aria-hidden="true">&times;</span>
            </button>
          </div>
          <div class="modal-body">
            Select "Logout" below if you are ready to end your current session.
          </div>
          <div class="modal-footer">
            <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
            <a class="btn btn-primary" href="login.html">Logout</a>
          </div>
        </div>
      </div>
    </div>

    <!-- Bootstrap core JavaScript -->
    <script src="/siscaf/resources/vendor/jquery/jquery.min.js"></script>
    <script src="/siscaf/resources/vendor/popper/popper.min.js"></script>
    <script src="/siscaf/resources/vendor/bootstrap/js/bootstrap.min.js"></script>

    <!-- Plugin JavaScript -->
    <script src="/siscaf/resources/vendor/jquery-easing/jquery.easing.min.js"></script>
    <script src="/siscaf/resources/vendor/chart.js/Chart.min.js"></script>
    <script src="/siscaf/resources/vendor/datatables/jquery.dataTables.js"></script>
    <script src="/siscaf/resources/vendor/datatables/dataTables.bootstrap4.js"></script>

    <!-- Custom scripts for this template -->
    <script src="/siscaf/resources/js/sb-admin.min.js"></script>

  </body>

</html>