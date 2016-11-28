// if($(window).height()>$("footer").position().top - 85){
// 	$("footer").css('position','absolute');
// 	$("footer").css('bottom','0px');
// 	$("footer").css('width','100%');
// }
// alert($(window).height())
$("div.ui.dropdown.item").has("div.menu a.item.active").css('padding-bottom','-3px');
$("div.ui.dropdown.item").has("div.menu a.item.active").css('border-bottom','3px solid #FBBD08');
$("div.ui.dropdown.item").has("div.menu a.item.active").css('background','rgba(0,0,0,.05)');
$(".ui.dropdown").dropdown();
$('.ui.checkbox').checkbox();
$('.ui.rating').rating();
$('.accordion').accordion({selector: {trigger: '.title'}});
$('.message .close').click(function() { 
	$(this).parent().transition('fade');
});
$(".ui.modal").modal();
$('.menu .item.item-tab').tab();
$(".ui.progress").progress();
$(".fullcalendar").fullCalendar({
	header: {
		left: 'prev,next today',
		center: 'title',
		right: 'month,basicWeek,basicDay'
	},
	navLinks: true,
	editable: true,
	eventLimit: true,
	events: [
		{
			title: 'Penyerahan Hadiah',
			start: '2016-11-28',
			color: '#A333C8'
		},
		{
			id: 999,
			title: 'Pengumuman',
			start: '2016-11-25',
			color: '#6435C9'
		},
		{
			title: 'Presentasi',
			start: '2016-11-16',
			end: '2016-11-19',
			color: '#00B5AD'
		},
		{
			title: 'Seleksi Panitia',
			start: '2016-11-10',
			end: '2016-11-16',
			color: '#21BA45'
		},
		{
			title: 'Pendaftaran Lomba',
			start: '2016-10-27',
			end: '2016-11-06',
			color: '#2185D0'
		},
		{
			title: 'Submit Template',
			url: '#',
			start: '2016-11-07',
			end: '2016-11-10',
			color: '#DB2828'
		}
	]
});
$(".clickable.message").click(function(){
	$(this).transition('slide down');
});
$("span.option-header-button.minimise-button").click(function(){
	if($(this).children('i').attr('title')=='minimise'){
		$(this).children('i').attr('title','tampilkan');
		$(this).parent().parent().siblings().transition('slide down');
	}else{
		$(this).children('i').attr('title','minimise');
		$(this).parent().parent().siblings().transition('slide down');
	}
});
$("span.option-header-button.close-button").click(function(){
	$(this).parent().parent().parent().transition('fade out');
});
$('.range').not('.single').not('.time').daterangepicker({
    opens: 'center',
    format: 'YYYY-MM-DD'
});
$(".single.range").daterangepicker({
	opens: 'center',
	format: 'YYYY-MM-DD',
	singleDatePicker: true
});
$(".range.time").daterangepicker({
	opens: 'center',
	format: 'YYYY-MM-DD hh:mm:ss',
	timePicker: true,
	timePicker12Hour: false
});