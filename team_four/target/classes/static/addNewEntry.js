$(document).ready(function(){
    /* $("#addNew").on('click', function(){
        $(".topRow").toggle();
        var $this = $(this);
        $this.toggleClass('btn-warning btn-danger');
        if($this.hasClass('btn-warning')){
        	$this.text('Add New');
        } else {
        	$this.text('Cancel');
        }
    }); */
    
    $(".insertNewRow").on('click',function(){
    	var data="<tr><td>123456</td> <td>John Mckinstry</td> <td><button>Info</button></td></tr>";
        $('table').append(data);
        return false;
	});
});