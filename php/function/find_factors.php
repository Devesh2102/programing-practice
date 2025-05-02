<?php
//To find and print all proper factors of a positive integer

function findProperFactors(int $number): array {
    $factors = [];

    for ($divisor = 1; $divisor <= $number / 2; $divisor++) {
        if ($number % $divisor === 0) {
            $factors[] = $divisor;
        }
    }

    return $factors;
}

echo "Enter a positive number: ";
$userInput = trim(fgets(STDIN));

if (!is_numeric($userInput) || (int)$userInput <= 0) {
    echo "Invalid input. Please enter a valid positive integer.\n";
    exit(1);
}

$number = (int)$userInput;
$factorsList = findProperFactors($number);

echo "Factors of $number are: " . json_encode($factorsList) . "\n";
?>
