<?php
// Program to check whether a given number is a Perfect Number or not

echo "Enter a positive integer:\n";
$input = trim(fgets(STDIN));

if (!is_numeric($input) || (int)$input < 1) {
    echo "Invalid input! Please enter a valid positive integer.\n";
    exit(1);
}

$number = (int)$input;
$sumOfDivisors = 0;

for ($i = 1; $i <= $number / 2; $i++) {
    if ($number % $i == 0) {
        $sumOfDivisors += $i;
    }
}

if ($number === $sumOfDivisors) {
    echo "\n$number is a Perfect Number.\n";
} else {
    echo "\n$number is NOT a Perfect Number.\n";
}
?>
