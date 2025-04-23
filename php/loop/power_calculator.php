<?php
// PHP script to calculate the result of a number raised to a power using user input

echo "Enter a base number: ";
$base = trim(fgets(STDIN));

echo "Enter exponent (power): ";
$exponent = trim(fgets(STDIN));


if (!is_numeric($base) || !is_numeric($exponent) || $exponent < 0) {
    echo "Please enter a valid base and a non-negative exponent.\n";
    exit(1);
}

$result = 1;
for ($i = 1; $i <= $exponent; $i++) {
    $result *= $base;
}

echo "$base raised to the power of $exponent is: $result\n";
?>
