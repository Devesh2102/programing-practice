<?php
class Fruit {
    public $name;
    public $color;

    public function __construct($name, $color) {
        $this->name = $name;
        $this->color = $color;
        echo "Fruit constructor called.\n";
    }

    public function intro() {
        echo "This is a {$this->name}, and its color is {$this->color}.(from parent)\n";
    }
}

class Strawberry extends Fruit {
    public $weight;

    public function __construct($name, $color, $weight) {
        parent::__construct($name, $color); // call parent constructor
        $this->weight = $weight;
        echo "Strawberry constructor called.\n";
    }

    // Overridden method
    public function intro() {
        echo "This is a {$this->name}, it's {$this->color}, and it weighs {$this->weight} grams.(from child)\n";
    }

    public function wash() {
        echo "Washing the {$this->name} before eating.\n";
    }
	
    public function callParentFunction() {
        parent::intro();	// Call parent method explicitly
    }
}

//Create object using parent class
echo "== Using Parent Class ==\n";
$fruit = new Fruit("Mango", "yellow");
$fruit->intro();            // Parent method

//Create object using child class
echo "\n== Using Child Class ==\n";
$strawberry = new Strawberry("Strawberry", "red", 150);
$strawberry->intro();       // Overridden child method
$strawberry->wash();        // Child-specific method

//Call parent method explicitly
echo "\n== Calling Parent Method from Child ==\n";
$strawberry->callParentFunction(); // Call method
?>
