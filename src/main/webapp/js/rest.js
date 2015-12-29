$(document).ready(function() {
	$('#clickMe').click(function() {
		alert('ajax');
		$.ajax({
			type : "GET",
			headers : {
				Accept : "application/json; charset=utf-8",
				"Content-Type": "application/json; charset=utf-8"
			},
			url : 'rest/messages/all',
			success : function(data) {
	     		alert('Data responded !!');
				var result = '';
				for(var i=0; i<data.length; i++)
					result += "<br>" + data[i].start_DATE + " - " + data[i].survey_ID;
				$('#show').html(result);
			},
	  		error : function() {
				alert('error');
			}
		});
		
	});
});