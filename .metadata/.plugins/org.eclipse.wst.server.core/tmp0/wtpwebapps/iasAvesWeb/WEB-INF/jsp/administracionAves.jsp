<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Administracion Aves</title>
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
	app.controller('administracionAves', [ '$scope', '$http', '$rootScope',
			function($scope, $http, $rootScope) {
				listarAves($scope, $http, $rootScope);
				ingresarAve($scope, $http, $rootScope);
			} ]);

	function listarAves($scope, $http, $rootScope) {
		$http({
			url : '/iasAvesWeb/AvesServicio/listarAves',
			method : 'GET'
		})
				.then(
						function mySuccess(response) {
							$scope.listaAves = response.data;
						},
						function myError(response) {
							alert("Error cargando el servicio : /iasAvesWeb/AvesServicio/listarAves, causa: "
									+ response.statusText);
						});
	}

	function ingresarAve($scope, $http, $rootScope) {
		$scope.ingresarAve = function(cdave, dsnombreComun, dsnombreCientifico) {
			if (cdave === undefined || dsnombreComun === undefined
					|| dsnombreCientifico === undefined) {
				alert("Ingrese ID, Nombre Comun o Nombre Cientifico para realizar el ingreso");
				return;
			}
			$http({
				url : '/iasAvesWeb/AvesServicio/ingresarAve',
				method : 'GET',
				params : {
					cdave : cdave,
					dsnombreComun : dsnombreComun,
					dsnombreCientifico : dsnombreCientifico
				}
			})
					.then(
							function mySuccess(response) {
								$scope.listaAvesNombre = response.data;
							},
							function myError(response) {
								alert("Error cargando el servicio : /iasAvesWeb/AvesServicio/ingresarAve, causa: "
										+ response.statusText);
							});
		}

	}
</script>
</head>
<body>
	<div ng-app="iasAvesWeb" ng-controller="administracionAves"
		class="container">
		<h2>Administracion Aves</h2>
		<form class="form-horizontal" action="/action_page.php">
			<div class="form-group">
				<label class="control-label col-sm-2" for="cdave">ID :</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="cdave" ng-model="cdave"
						placeholder="Codigo Ave" name="cdave">
				</div>
			</div>
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
						ng-click="ingresarAve(cdave,dsNombreComun,dsNombreCientifico)">ingresar</button>
					<button type="button" class="btn btn-default"
						ng-click="ingresarAve(cdave,dsNombreComun,dsNombreCientifico)">Eliminar</button>
				</div>
			</div>
		</form>
		<table class="table table-striped table-bordered">
			<tr>
				<th>ID</th>
				<th>NOMBRE COMUN</th>
				<th>NOMBRE CIENTIFICO</th>
			</tr>
			<tr ng-repeat="ave in listaAves">
				<td>{{ave.cdave}}</td>
				<td>{{ave.dsnombreComun}}</td>
				<td>{{ave.dsnombreCientifico}}</td>
			</tr>
		</table>
	</div>
</body>
<p align="left">Powered By: Andres Jurado</p>
</html>






