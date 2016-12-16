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
            <a class="" href="/"><img style="width: 20%" src="/images/Logo_PENS.png" /></a>
            <div class="right menu">
                <div class="ui dropdown item">
                    <i class="user icon"></i>
                    Developer
                    <div class="menu">
                        <a href="https://www.facebook.com/kevin.andrean.52" class="item"><i class="user icon"></i> Kevin Andrean 2103141055</a>
                        <a href="https://www.facebook.com/ovanqizri" class="item"><i class="user icon"></i> Nova Rizqi 2103141059</a>
                    </div>
                </div>
            </div>
        </div>
	</header>

	<div class="ui container">
		<h3 class="ui header title-page">Peramalan Penjualan Kaos PPSS</h3>
	</div>

	<div class="content">
		<div class="ui container">
			<div class="ui stackable grid">
				<div class="two column row">
					<div class="column">						
						<div class="ui stacked segments">
							<div class="ui violet inverted segment">
								Model Input
							</div>
                            <form action="/userview/hasil" name="form_ma" id="form_ma">
								<div class="ui segment">
									<div class="ui form">
										<div class="inline fields">
											<label>Input manual </label>
											<div class="ui checkbox" id="wrapper_input_manual">
												<input type="checkbox" name="input_manual" id="input_manual">
											</div>
										</div>
										<div class="inline fields" id="n_manual_area">
											<label>n manual </label>
											<div class="ui checkbox" id="wrapper_n_manual">
												<input type="checkbox" name="n_manual" id="n_manual">
											</div>
										</div>
										<div class="inline fields" id="jml_n_area">
											<label>Inputkan n </label>
											<div class="ui mini input" id="wrapper_jml_n">
												<input type="number" placeholder="n" style="text-align:center; width: 50px;" name="jml_n" id="jml_n">
											</div>
										</div>
										<table style="margin-top: 0px;width: calc(30% + 1.1px);" class="ui celled structured table" id="tabel_tdt">
											<thead>
											<tr>
												<th>t</th>
												<th>d(t)</th>
											</tr>
											</thead>
											<tbody id="tabel_tdt_body">

											</tbody>
										</table>
										<div class="inline fields" id="T_manual_area">
											<label>T manual </label>
											<div class="ui checkbox" id="wrapper_T_manual">
												<input type="checkbox" name="T_manual" id="T_manual">
											</div>
										</div>
										<div class="inline fields" id="T_area">
											<label>Inputkan T </label>
											<div class="ui mini input">
												<input type="number" placeholder="n" style="text-align:center; width: 50px;" name="T" id="T">
											</div>
										</div>
									</div>
								</div>
								<div class="ui right aligned segment">
									<a href="/"><button class="ui secondary button">Cancel</button></a>
									<button class="ui primary button" type="submit">Submit</button>
								</div>
                            </form>
						</div><!-- segments -->
					</div><!-- column -->
				</div>
			</div>
		</div><!-- container -->
	</div><!-- content -->

	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script type="text/javascript" src="semantic/semantic.min.js"></script>
	<script type="text/javascript" src="plugins/chartjs/Chart.bundle.min.js"></script>
	<script type="text/javascript" src="plugins/jqvmap/jquery.vmap.min.js"></script>
	<script type="text/javascript" src="plugins/jqvmap/maps/jquery.vmap.world.js"></script>
	<script type="text/javascript" src="plugins/daterangepicker/moment.min.js"></script>
	<script type="text/javascript" src="plugins/daterangepicker/daterangepicker.min.js"></script>
	<script type="text/javascript" src="plugins/inputmask/jquery.inputmask.bundle.min.js"></script>
	<script type="text/javascript" src="plugins/ckeditor/ckeditor.js"></script>
	<script type="text/javascript" src="plugins/tinymce/tinymce.min.js"></script>
	<script type="text/javascript" src="plugins/datatables/js/jquery.dataTables.min.js"></script>
	<script type="text/javascript" src="plugins/datatables/js/dataTables.semanticui.min.js"></script>
	<script type="text/javascript" src="plugins/slick/slick.min.js"></script>
	<script type="text/javascript" src="plugins/fullcalendar/fullcalendar.min.js"></script>
	<script type="text/javascript" src="js/app.js"></script>
    <script type="text/javascript">
		$("#n_manual_area").hide();
        $("#jml_n_area").hide();
        $("#tabel_tdt").hide();
        $("#T_manual_area").hide();
        $("#T_area").hide();

		$("#wrapper_input_manual").checkbox({
		    onChecked: function () {
				$("#n_manual_area").show();
                $("#T_manual_area").show();
            },
			onUnchecked: function () {
                $("#n_manual_area").hide();
                $("#T_manual_area").hide();
            }
		});

		$("#wrapper_n_manual").checkbox({
		    onChecked: function () {
                $("#jml_n_area").show();
                $("#tabel_tdt").show();
			},
			onUnchecked: function () {
                $("#jml_n_area").hide();
                $("#tabel_tdt").hide();
            }
		});

        $("#wrapper_T_manual").checkbox({
            onChecked: function () {
                $("#T_area").show();
            },
            onUnchecked: function () {
                $("#T_area").hide();
            }
        });

		var jml_n = document.getElementById("jml_n");
		jml_n.addEventListener("keydown", function (e) {

			if(e.keyCode === 13){
                e.preventDefault();
				generate_table_n();
			}
        });

		function generate_table_n() {
			var n = $("#jml_n").val();
            $("#tabel_tdt_body").html('');
			for(var i = 0;i < n; i++){
			    $("#tabel_tdt_body").append("<tr>" +
						"<td><input type='number' name='tvalue[]' </td>" +
						"<td><input type='number' name='dtvalue[]' </td>" +
						"</tr>"
				);
			}
        }
	</script>

</body>
</html>