<?php
echo "Enter the number of rows: \n";
$rowCount = trim(fgets(STDIN));

for ($currentRow = 1; $currentRow <= $rowCount; $currentRow++) {
    echo str_repeat("* ", $currentRow) . "\n";
}
?>
