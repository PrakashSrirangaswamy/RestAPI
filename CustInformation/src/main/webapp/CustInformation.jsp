<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
 
 <link href = "https://code.jquery.com/ui/1.10.4/themes/ui-lightness/jquery-ui.css"
         rel = "stylesheet">
      <script src = "https://code.jquery.com/jquery-1.10.2.js"></script>
      <script src = "https://code.jquery.com/ui/1.10.4/jquery-ui.js"></script>

<script>
$(document).ready(function(){
  $("#create").click(function(){
	  var email = $("#eMail").val();
      if(email != 0)
      {
          if(isValidEmailAddress(email) == false)
          {
        	  $("#eMail").parent().after("<div class='validation' style='color:red;margin-bottom: 20px;'>Invalid email address</div>");
          }
      } else {
          
          $("#eMail").parent().after("<div class='validation' style='color:red;margin-bottom: 20px;'>Please enter email address</div>");
          
      }
    
  });
  $("#cancel").click(function(){
	  
	  alert("Please enter your details");
  });
  $( function() {
	    $( "#dob" ).datepicker();
	  } );
  
});

function isValidEmailAddress(emailAddress) {
    var pattern = new RegExp(/^(("[\w-\s]+")|([\w-]+(?:\.[\w-]+)*)|("[\w-\s]+")([\w-]+(?:\.[\w-]+)*))(@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$)|(@\[?((25[0-5]\.|2[0-4][0-9]\.|1[0-9]{2}\.|[0-9]{1,2}\.))((25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-9]{1,2})\.){2}(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-9]{1,2})\]?$)/i);
    return pattern.test(emailAddress);
}
</script>
</head>
<body>
<form action= "CustInformation">
<div>First Name 	:<input type="text" id="FName" name="FName"> </div>
<div>Last Name  	:<input type="text" id="LName" name="LName"> </div>
<div>Date of Birth	:<input type="text" id="dob"> </div>
<div>Email			:<input type="text" id="eMail" name="eMail"> </div>
<button id="create">Create</button>
<button id="cancel">Cancel</button>
</form>
</body>
</html>