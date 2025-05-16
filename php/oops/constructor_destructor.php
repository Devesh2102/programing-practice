<?php
class Fruit {
    private $name;

    public function __construct($name) {
        $this->name = $name;
        echo "Fruit '{$this->name}' has been created.\n";
    }

    public function describe() {
        echo "This is a {$this->name}.\n";
    }

    // Destructor - called automatically when object is destroyed
    public function __destruct() {
        echo "Fruit '{$this->name}' is being destroyed.\n";
    }
}

$apple = new Fruit("Apple");
$apple->describe();
?>
