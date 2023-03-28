<?php
// Connect to the database
$servername = "localhost";
$username = "root";
$password = "pass@word1";
$dbname = "sona";

$conn = new mysqli($servername, $username, $password, $dbname);

// Check connection
if ($conn->connect_error) {
  die("Connection failed: " . $conn->connect_error);
}

// Get the form data
$name = $_POST['name'];
$id = $_POST['id'];
$location = $_POST['location'];
$address = $_POST['address'];
$bloodgroup = $_POST['bloodgroup'];
$experience = $_POST['experience'];
$skills = $_POST['skills'];

// Insert the data into the database
$sql = "INSERT INTO employees (name, id, location, address, bloodgroup, experience, skills) VALUES ('$name', '$id', '$location', '$address', '$bloodgroup', '$experience', '$skills')";

if ($conn->query($sql) === TRUE) {
  echo "Employee data submitted successfully";
} else {
  echo "Error: " . $sql . "<br>" . $conn->error;
}

$conn->close();
?>
