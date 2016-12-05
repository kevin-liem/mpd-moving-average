<!DOCTYPE html>
<html>
<head>
	<title>Moving Average</title>
	<link rel="stylesheet" type="text/css" href="/semantic/semantic.min.css">
	<link rel="stylesheet" type="text/css" href="/plugins/fontawesome/css/font-awesome.min.css">
	<link rel="stylesheet" type="text/css" href="/plugins/jqvmap/jqvmap.min.css">
	<link rel="stylesheet" type="text/css" href="/plugins/daterangepicker/daterangepicker.min.css">
	<link rel="stylesheet" type="text/css" href="/plugins/datatables/css/jquery.dataTables.min.css">
	<link rel="stylesheet" type="text/css" href="/plugins/datatables/css/dataTables.semanticui.min.css">
	<link rel="stylesheet" type="text/css" href="/plugins/slick/slick.css">
	<link rel="stylesheet" type="text/css" href="/plugins/fullcalendar/fullcalendar.min.css">
	<link rel="stylesheet" type="text/css" href="/plugins/fullcalendar/fullcalendar.print.css" media='print'>
	<link rel="stylesheet" type="text/css" href="/css/app.css">

	<style type="text/css">
		footer div.ui.dark-gray, footer div.ui.inverted.segment{
			background-image: url('images/black-orchid.png');
			background-repeat: repeat;
		}
		body{
			background-image: url('images/fabric-1-light.png');
		}
	</style>
</head>
<body>
	<div class="line-top"></div>
	<header class="ui labeled icon stackable tiny menu no-radius">
		<div class="ui container">
			<a class="item" href="ma-method.html"><i class="dashboard icon"></i>Dashboard</a>
			<div class="right menu">
				<div class="ui dropdown item">
					<i class="user icon"></i>
					Akun
					<div class="menu">
						<a class="item"><i class="sign out icon"></i> Keluar</a>
					</div>
				</div>
			</div>
		</div>
	</header>

	<center>
	<div class="ui container">
		<h3 class="ui header title-page">Metode Moving Average</h3>
	</div>
	</center>
		<div class="ui container">
			<div class="ui stackable grid">
					<div class="column">						
						<div class="ui stacked segments">
							<div class="ui blue inverted segment">
								Tabel Moving Average
							</div>
							<div class="ui segment">
								<div class="ui form">			
									<table style="margin-top: 0px;width: calc(100% + 1.1px);" class="ui celled structured table">
									<thead>
										<tr>
											<th>t</th>
											<th>d(t)</th>
											<th>T=${Tdata}</th>
											<th>error T=${Tdata}</th>
										</tr>
									</thead>
                                        <tbody id="main_table_body">
                                          <#if datainput??>
                                              <#list datainput as data>
                                                  <tr>
                                                      <td>${data.xAxis}</td>
                                                      <td>${data.yAxis}</td>
                                                      <td>
                                                          <#if data.t?has_content>
                                                              <#if data.t[result.t-2]??>
                                                                <#if data.t[result.t-2].tvalue??>
                                                                    ${data.t[result.t-2].tvalue}
                                                                </#if>
                                                              </#if>
                                                          </#if>

                                                      </td>
                                                      <td>
														  <#if data.t?has_content>
                                                              <#if data.t[result.t-2]??>
															  <#if data.t[result.t-2].errorValue??>
															  ${data.t[result.t-2].errorValue}
															  </#if>
														  </#if>
                                                          </#if>
                                                      </td>
                                                  </tr>
                                              </#list>
                                          </#if>
                                        </tbody>
									  <tfoot>
									    <th colspan="20">
									      <div class="ui right floated pagination menu">
									      <button class="ui primary button" onclick="showModalStandart()">Kesimpulan</button>
									      </div>
									    </th>
									  </tfoot>
									</table>
								</div>
							</div>
						</div><!-- segments -->						
					</div><!-- column -->
				</div>
			</div>

				<div class="ui modal" id="modal1">
					<i class="close icon"></i>
					<div class="header"></div>
					<center>
						<div class="ui message">
							<div class="header">
								Kesimpulan :
							</div>
							<p>
								Peramalan bulan ke ${timeseries.n + 1} adalah ${result.tvalue}
								dengan T = ${result.t} dan error = ${result.errorValue}
							</p>
						</div>
					</div>
					</center>
				</div>

	<script type="text/javascript" src="/js/jquery.min.js"></script>
	<script type="text/javascript" src="/semantic/semantic.min.js"></script>
	<script type="text/javascript" src="/plugins/chartjs/Chart.bundle.min.js"></script>
	<script type="text/javascript" src="/plugins/jqvmap/jquery.vmap.min.js"></script>
	<script type="text/javascript" src="/plugins/jqvmap/maps/jquery.vmap.world.js"></script>
	<script type="text/javascript" src="/plugins/daterangepicker/moment.min.js"></script>
	<script type="text/javascript" src="/plugins/daterangepicker/daterangepicker.min.js"></script>
	<script type="text/javascript" src="/plugins/inputmask/jquery.inputmask.bundle.min.js"></script>
	<script type="text/javascript" src="/plugins/ckeditor/ckeditor.js"></script>
	<script type="text/javascript" src="/plugins/tinymce/tinymce.min.js"></script>
	<script type="text/javascript" src="/plugins/datatables/js/jquery.dataTables.min.js"></script>
	<script type="text/javascript" src="/plugins/datatables/js/dataTables.semanticui.min.js"></script>
	<script type="text/javascript" src="/plugins/slick/slick.min.js"></script>
	<script type="text/javascript" src="/plugins/fullcalendar/fullcalendar.min.js"></script>
	<script type="text/javascript" src="/js/app.js"></script>

	<script type="text/javascript">
		function showModalStandart() {
			$("#modal1").modal('show');
		}
	</script>
</body>
</html>