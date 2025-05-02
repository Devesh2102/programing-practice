<?php
// PHP script to calculate the sum of even digits in a given number

echo "Enter a number: ";
$inputNumber = trim(fgets(STDIN));

if (!is_numeric($inputNumber) || $inputNumber < 0) {
    echo "Please enter a valid non-negative number.\n";
    exit(1);
}

$originalNumber = $inputNumber;
$sumOfEvenDigits = 0;

while ($inputNumber > 0) {
    $digit = $inputNumber % 10;
    if ($digit % 2 == 0) {
        $sumOfEvenDigits += $digit;
    }
    $inputNumber = (int)($inputNumber / 10); // Typecast to int
}

echo "Sum of even digits in $originalNumber is: $sumOfEvenDigits\n";
?>
