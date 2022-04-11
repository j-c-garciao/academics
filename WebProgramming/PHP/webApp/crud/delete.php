<html>
<body>

<?php
require '../db/connector.php';
$conn=conectarse();

$id = filter_input(INPUT_GET, 'id');
$sql="DELETE FROM client WHERE ID ='$id'"; 
	if($conn->query($sql)===TRUE){
		echo '<center> Success </center>';
	}
	else{
		echo '<center> Error Delete '.$conn->error.'</center>';
	}
$conn->close();
?>
<script language="javascript">
    window.location.href = "list_form.php"
</script>
</body>
</html>