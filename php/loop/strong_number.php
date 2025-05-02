<?php
// Program to check whether a given number is a Strong Number or not
// A Strong Number is one where the sum of the factorials of its digits equals the number itself (e.g., 145 = 1! + 4! + 5!)

echo "Enter a positive integer:\n";
$input = trim(fgets(STDIN));

if (!is_numeric($input) || (int)$input < 1) {
    echo "Invalid input! Please enter a valid positive integer.\n";
    exit(1);
}

$number = (int)$input;
$originalNumber = $number;
$sum = 0;

while ($number > 0) {
    $digit = $number % 10;
    $factorial = 1;

    for ($i = 1; $i <= $digit; $i++) {
        $factorial *= $i;
    }

    $sum += $factorial;
    $number = (int)($number / 10);
}

if ($originalNumber === $sum) {
    echo "\n$originalNumber is a Strong Number.\n";
} else {
    echo "\n$originalNumber is NOT a Strong Number.\n";
}
?>
