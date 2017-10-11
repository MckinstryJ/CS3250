$(document).ready(function(){
    $("#addNew").click(function(){
        $(".topRow").toggle();
        var $this = $(this);
        $this.toggleClass('btn-warning btn-danger');
        if($this.hasClass('btn-warning')){
        	$this.text('Add New');
        } else {
        	$this.text('Cancel');
        }
    });
});