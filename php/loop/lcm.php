<?php
// Program to find the LCM (Least Common Multiple) of three numbers entered by the user (No function used)

echo "Enter three numbers:\n";
$num1 = (int)trim(fgets(STDIN));
$num2 = (int)trim(fgets(STDIN));
$num3 = (int)trim(fgets(STDIN));

$max = ($num1 > $num2 && $num1 > $num3) ? $num1 : (($num2 > $num3) ? $num2 : $num3);

$lcm = $max;
while (true) {
    if ($lcm % $num1 === 0 && $lcm % $num2 === 0 && $lcm % $num3 === 0) {
        echo "LCM of $num1, $num2, and $num3 is: $lcm\n";
        break;
    }
    $lcm += $max;
}
?>
