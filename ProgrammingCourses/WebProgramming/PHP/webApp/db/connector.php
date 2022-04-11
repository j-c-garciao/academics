<?php
    function conectarse(){
        if (!($conn = new mysqli("AWS_RDS_URL","USER","PASSWORD","DATABASE"))){
            echo "<center><b> Error de conexion a la Base de Datos SQL. </b></center>";
            exit;
        }
       return $conn;            
    }
?>