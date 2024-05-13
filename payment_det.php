<?php

$cardNumber = $_POST['cardNumber'];
$expiration   = $_POST['expiration'];
$CVV = $_POST['CVV'];

$conn = new mysqli('localhost', 'root', '', 'do mens shop');
 $valid = true;
    
    if (empty($cardNumber) || strlen($cardNumber) != 16) {
        $valid = false;
    }
  
    if (empty($expiration) || strlen($expiration) != 5) {
        $valid = false;
    }
    if (empty($CVV) || strlen($CVV) != 3) {
        $valid = false;
    }
    
  
    if ($valid) {
     
        $payment_request = new PaymentRequest();
        
        $payment_request->setCardNumber($cardNumber);
        
        $payment_request->setCardExpiry($expiration);
        $payment_request->setCardCvv($CVV);
      
    }
}   
?>
