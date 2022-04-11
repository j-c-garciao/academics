<html>
<body>

<?php
$fname = filter_input(INPUT_GET, 'fname');
$lname = filter_input(INPUT_GET, 'lname');
$date  = filter_input(INPUT_GET, 'date');

require '../db/connector.php';
$conn=conectarse();

$sql="INSERT INTO client(fname,lname,date) values('".$fname."','".$lname."','".$date."')";
	if($conn->query($sql)===TRUE){
		echo '<center> Success </center>';
	}
	else{
		echo '<center> Error insert '.$conn->error.'</center>';
	}
$conn->close();
?>
<center>
    Welcome <?php echo $fname; ?> <?php echo $lname; ?><br>
<br>
<br>
<a href="../index.php">Home</a>
</center>
</body>
</html>