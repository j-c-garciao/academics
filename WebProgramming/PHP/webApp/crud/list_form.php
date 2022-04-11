<?php
require '../db/connector.php';
$conn=conectarse();
// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
} 

$sql = "SELECT id,lname,fname,date FROM client";
$result = $conn->query($sql);

/*********************************

CREAR TABLA DINAMICA

*********************************/

echo "<html>\n";
echo "\t<head>\n";
echo "\t\t<title>Listar Datos</title>\n";
echo "\t\t<meta http-equiv= \"refresh\" content=\"5\" />\n";
echo "\t\t<meta charset=\"UTF-8\"/>\n";
echo "\t</head>\n";
echo "\t<body>\n";

if ($result->num_rows > 0) {
    echo "<div align=\"center\">\n";
    echo "<table border=2>\n";
    echo "<tr BGCOLOR=\"#D3D3D3\">\n";
    echo "<td>id</td>\n";
    echo "<td>fname</td>\n";
    echo "<td>lname</td>\n";
    echo "<td>date</td>\n";
    echo "<td colspan=\"2\">Acción</td>\n";
    echo "</tr>";       
    
    $fila=1;
    while($row = $result->fetch_assoc()) {
        if($fila % 2 == 0){
	        echo "<tr BGCOLOR=\"#D3D3D3\">\n";
        }
	else{
                echo "<tr>\n";
	}

        echo "<td>".$row["id"]."</td>\n<td>".$row["fname"]."</td>\n<td>".$row["lname"]."</td>\n<td>".$row["date"]."</td>\n<td><a href=\"delete.php?id=".$row["id"]."\">Delete </td> <td> <a href=\"update.php?id=".$row["id"]."\">Update </td>\n";
        echo "</tr>\n";
        $fila=$fila+1;        
    }
    echo "</table>\n";
echo "</div>\n";

echo "</body>\n";
echo "</html>\n";

} else {
    echo "0 results";
}

$conn->close();
?>
<br>
<center><a href="../index.php">Home</a>
</center>
