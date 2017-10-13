$( document ).ready(function() {
	
	var url = window.location;
	
	// SUBMIT FORM
    $("#frm").submit(function(event) {
		ajaxPost();
	});
    
    
    function ajaxPost(){
    	
    	// PREPARE FORM DATA
    	var formData = {
    		name : $("#id").val(),
    		name :  $("#name").val()
    	}
    	
    	// DO POST
    	$.ajax({
			type : "POST",
			contentType : "application/json",
			url : url,
			data : JSON.stringify(formData),
			dataType : 'json',
			success : function(result) {
				console.log(result);
			},
		});
    	
    	// Reset FormData after Posting
    	resetData();
 
    }
    
    function resetData(){
    	$("#id").val("");
    	$("#name").val("");
    }
})