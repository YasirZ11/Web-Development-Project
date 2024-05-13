<?php

$username = $_POST['username'];
$email   = $_POST['email'];
$password = $_POST['password'];

$conn = new mysqli('localhost', 'root', '', 'do mens shop');
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
} elseif ($username == '') {
    echo "Please enter a valid username";

} else {
    $stmt = $conn->prepare("INSERT INTO register( username, email, password) VALUES (?, ?, ?)");
    $stmt->bind_param("sss",$username, $email, $password);
    $stmt->execute();
    echo "Register Successfully";
    $stmt->close();
    $conn->close();
}   
?>
