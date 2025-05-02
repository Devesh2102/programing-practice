<?php
// Program to print all palindrome numbers from 1000 to 1500

function isPalindrome($number)
{
    $original = $number;
    $reverse = 0;

    while ($number > 0) {
        $digit = $number % 10;
        $reverse = $reverse * 10 + $digit;
        $number = (int) ($number / 10);
    }

    return $original == $reverse;
}

echo "Palindrome numbers from 1000 to 1500 are:\n";

for ($i = 1000; $i <= 1500; $i++) {
    if (isPalindrome($i)) {
        echo $i . "\n";
    }
}
?>