<?php

$name = $_POST['name'];
$email   = $_POST['email'];
$number = $_POST['number'];

$conn = new mysqli('localhost', 'root', '', 'do mens shop');
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
} elseif ($name == '') {
    echo "Please enter a valid username";

} else {
    $stmt = $conn->prepare("INSERT INTO contact details( name, email, number) VALUES (?, ?, ?)");
    $stmt->bind_param("sss",$name, $email, $number);
    $stmt->execute();
    echo "feedback submitted successfully";
    $stmt->close();
    $conn->close();
}   
?>
