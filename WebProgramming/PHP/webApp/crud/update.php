<?php
$id = $_GET["id"];
$fname = "";
$lname = "";
$date = "";

require '../db/connector.php';
$conn=conectarse();

// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
} 

$sql = "SELECT * from client where id=".$id;
$result = $conn->query($sql);
if ($result->num_rows > 0) {
    while($row = $result->fetch_assoc()) {
        $fname=$row["fname"];
        $lname=$row["lname"];
        $date=$row["date"];
        }
}

$conn->close();

echo "<html>";
echo "<body>";
echo "<form action=\"../controllers/update_controller.php\" method=\"get\">";
echo  "<fieldset>";
echo  "<legend>Personal information:</legend>";
echo "First name:<br>";
echo "<input type=\"text\" name=\"fname\" value=\"$fname\">";
echo "<input type=\"hidden\" id=\"id\" name=\"id\" value=\"$id\">";
echo "<br>";
echo "Last name:<br>";
echo "<input type=\"text\" name=\"lname\" value=\"$lname\">";
echo "<br>";
echo "Fecha:<br>";
echo "<input type=\"date\" name=\"date\" value=\"$date\">";
echo "<br><br>";

echo "<input type=\"submit\" value=\"Submit\">";
echo "</fieldset>";
echo "</form>";
echo "</body>";
echo "</html>";
?>
