<?php
echo "Enter the number of rows: \n";
$rowCount = trim(fgets(STDIN));

for ($currentRow = 1; $currentRow <= $rowCount; $currentRow++) {
    $leadingSpaces = str_repeat("  ", $rowCount - $currentRow);
    $stars = str_repeat("* ", $currentRow);
    echo $leadingSpaces . $stars . "\n";
}
?>
