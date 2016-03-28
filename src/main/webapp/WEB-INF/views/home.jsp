<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  <%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
<link href="<%=request.getContextPath()%>/resources/assets/css/bootstrap.css" rel="stylesheet" type="text/css">
<link href="<%=request.getContextPath()%>/resources/css/styleClient.css" rel="stylesheet" type="text/css">
</head>
<body>
<h1>
	Hello world!  
</h1>

<!--------------------------- la listes des cheveaux  ---------------------------------->
<div class="spacer container">
    <div class="row">
        <div class="panel panel-primary filterable">
            <div class="panel-heading">
                <h2 class="panel-title">La liste des cheveaux</h2>
                <div class="pull-right">
                    <button class="btn btn-default btn-xs btn-filter"><span class="glyphicon glyphicon-filter"></span> Filter</button>
                </div>
            </div>
            <table class="table">
                <thead>
                    <tr class="filters">
                        <th><input type="text" class="form-control" placeholder="idCheval" disabled></th>
                        <th><input type="text" class="form-control" placeholder="nomCheval" disabled></th>
                        <th><input type="text" class="form-control" placeholder="dateDeNaissance" disabled></th>
                        <th><input type="text" class="form-control" placeholder="dateCreation" disabled></th>
                        <th><input type="text" class="form-control" placeholder="poidsDateEntree" disabled></th>
                    </tr>
                </thead>
					<tbody>
						<c:forEach items="${chevalModel}" var="ch">
							<tr>
								<td>${ch.idCheval}</td>
								<td>${ch.nomCheval}</td>
								<td>${ch.dateDeNaissance}</td>
								<td>${ch.dateCreation}</td>
								<td>${ch.poidsDateEntree}</td>
								<td><a href="removechev?idCheval=${ch.idCheval}">Supprimer</a></td>
								
								
							</tr>
						</c:forEach>
					 </tbody>
				</table>
        </div>
    </div>
</div>

<form  class="form-horizontal" action="addChevale" method="post">
		<fieldset>
			<!-- Form Name -->
			<legend>ajouter un chevale :</legend>
			
			<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="textinput">nomCheval:</label>
				<div class="col-md-4">
					<input id="textinput"name="nomCheval"  type="text"
						placeholder="placeholder" class="form-control input-md"/>
				</div>
				
			</div>
			
			<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="textinput">dateDeNaissance:</label>
				<div class="col-md-4">
					<input id="textinput"name="dateDeNaissance" type="text" placeholder="placeholder" class="form-control input-md"/>
				</div>
			</div>
			<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="textinput">dateCreation:</label>
				<div class="col-md-4">
					<input id="textinput"name="dateCreation" type="text" placeholder="placeholder" class="form-control input-md"/>
				</div>
			</div>
			
			<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="textinput">poidsDateEntree</label>
				<div class="col-md-4">
					<input id="textinput"name="poidsDateEntree" type="text" placeholder="placeholder" class="form-control input-md"/>
				</div>
			</div>
			<!-- Button -->
			<div class="form-group">
				<label class="col-md-4 control-label" for="singlebutton"></label>
				<div class="col-md-4">
					<button id="singlebutton"name="singlebutton"
						class="btn btn-primary" >Enregistrer</button>
				</div>
			</div>
		</fieldset>
	</form>
    <script src="<%=request.getContextPath()%>/resources/assets/js/jquery-1.12.0.min.js"></script>
    <script src="<%=request.getContextPath()%>/resources/assets/js/bootstrap.min.js"></script>
    <script src="<%=request.getContextPath()%>/resources/js/myfunction.js"></script>

</body>
</html>
