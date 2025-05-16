<?php
class Person {
    private $data = [];

    // Magic setter
    public function __set($key, $value) {
        $this->data[$key] = $value;
    }

    // Magic getter
    public function __get($key) {
        return isset($this->data[$key]) ? $this->data[$key] : null;
    }
}

$person = new Person();
$person->name = "Test";
$person->age = 25;

echo "Name: " . $person->name . "\n";
echo "Age: " . $person->age ."\n";
?>
