<?php
$id = filter_input(INPUT_GET, 'id');
$fname = filter_input(INPUT_GET, 'fname');
$lname = filter_input(INPUT_GET, 'lname');
$date  = filter_input(INPUT_GET, 'date');

require '../db/connector.php';
$conn=conectarse();

// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
} 

$sql="UPDATE client SET fname = '".$fname."', lname = '".$lname."', date = '".$date."' WHERE id=".$id;
	if($conn->query($sql)===TRUE){
		echo '<center> Success </center>';
	}
	else{
		echo '<center>'.'Error update '.$conn->error.'</center>';
	}
$conn->close();
?>
<script language="javascript">
    window.location.href = "../crud/list_form.php"
</script>

