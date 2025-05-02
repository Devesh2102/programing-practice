<?php
echo "Enter the number of rows (odd number ≥ 5): ";
$user_input = (int)trim(fgets(STDIN));

if ($user_input < 5 || $user_input % 2 == 0) {
    echo "Please enter a valid odd number greater than or equal to 5.\n";
    exit;
}

$half = (int)($user_input / 2);

for ($i = 1; $i <= $user_input; $i++) {
    for ($j = 1; $j <= $user_input; $j++) {
        if (
            ($i == 1 && $j >= $half + 1) ||           // Top row, right half
            ($j == $half + 1) ||                      // Middle column
            ($i == $half + 1) ||                      // Middle row
            ($j == 1 && $i <= $half + 1) ||           // Left column, top half
            ($j == $user_input && $i >= $half + 1) || // Right column, bottom half
            ($i == $user_input && $j <= $half + 1)    // Bottom row, left half
        ) {
            echo "*  ";
        } else {
            echo "   ";
        }
    }
    echo "\n";
}
?>
