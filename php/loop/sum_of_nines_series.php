<?php
// PHP script to calculate the sum of the series: 9 + 99 + 999 + 9999 + ... for 6 terms

$totalSum = 0;
$currentTerm = 9;
$terms = 6; // We want 6 terms: 9, 99, 999, ...

for ($i = 0; $i < $terms; $i++) {
    $totalSum += $currentTerm;
    $currentTerm = $currentTerm * 10 + 9;
}

echo "The sum is: " . $totalSum . "\n";
?>
