<?php
// PHP program to calculate the factorial of each digit of a number

echo "Enter a number: ";
$number = trim(fgets(STDIN));

if (!is_numeric($number) || $number < 0) {
    echo "Please enter a valid non-negative number.\n";
    exit(1);
}

// Convert to integer (if decimal entered)
$number = (int)$number;

while ($number > 0) {
    $digit = $number % 10;
    $fact = 1;

    // Calculate factorial
    for ($i = 1; $i <= $digit; $i++) {
        $fact *= $i;
    }

    echo "Factorial of $digit is $fact\n";

    $number = (int)($number / 10);
}
?>
