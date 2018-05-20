<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Consulta Aves</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script>
	var app = angular.module('iasAvesWeb', []);
	app.controller('consultaAves', [ '$scope', '$http', '$rootScope',
			function($scope, $http, $rootScope) {
				listarAvesNombre($scope, $http, $rootScope);
			} ]);

	function listarAvesNombre($scope, $http, $rootScope) {
		$scope.listarAvesNombre = function(dsnombreComun, dsnombreCientifico) {
			if (dsnombreComun === undefined || dsnombreCientifico === undefined) {
				alert("Ingrese Nombre Comun o Nombre Cientifico para realizar la busqueda o letras claves");
				return;
			}
			$http({
				url : '/iasAvesWeb/AvesServicio/listarAvesNombre',
				method : 'GET',
				params : {
					dsnombreComun : dsnombreComun,
					dsnombreCientifico : dsnombreCientifico
				}
			})
					.then(
							function mySuccess(response) {
								$scope.listaAvesNombre = response.data;
							},
							function myError(response) {
								alert("Error cargando el servicio : /iasAvesWeb/AvesServicio/listarAvesNombre, causa: "
										+ response.statusText);
							});
		}

	}
</script>
</head>
<body>
	<div ng-app="iasAvesWeb" ng-controller="consultaAves" class="container">
		<h2>Consulta de Aves</h2>
		<form class="form-horizontal" action="/action_page.php">
			<div class="form-group">
				<label class="control-label col-sm-2" for="dsNombreComun">Nombre
					Comun:</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="dsNombreComun"
						ng-model="dsNombreComun" placeholder="Nombre Comun"
						name="dsNombreComun">
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="dsNombreCientifico">Nombre
					Cientifico:</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="dsNombreCientifico"
						ng-model="dsNombreCientifico" placeholder="Nombre Cientifico"
						name="dsNombreCientifico">
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="button" class="btn btn-default"
						ng-click="listarAvesNombre(dsNombreComun,dsNombreCientifico)">Consultar</button>
				</div>
			</div>
		</form>
		<table class="table table-striped table-bordered">
			<tr>
				<th>ID</th>
				<th>NOMBRE COMUN</th>
				<th>NOMBRE CIENTIFICO</th>
			</tr>
			<tr ng-repeat="ave in listaAvesNombre">
				<td>{{ave.cdave}}</td>
				<td>{{ave.dsnombreComun}}</td>
				<td>{{ave.dsnombreCientifico}}</td>
			</tr>
		</table>
	</div>
</body>
<p align="left">Powered By: Andres Jurado</p>
</html>






