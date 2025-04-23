<?php
// PHP script to calculate the factorial of a number entered by the user via command line

// Prompt user for input
echo "Enter a number to calculate its factorial: ";
$number = trim(fgets(STDIN));

// Validate input
if (!is_numeric($number) || $number < 0) {
    echo "Please enter a valid non-negative number.\n";
    exit(1);
}

$factorial = 1;
for ($i = 1; $i <= $number; $i++) {
    $factorial *= $i;
}

echo "Factorial of $number is: $factorial\n";
?>
