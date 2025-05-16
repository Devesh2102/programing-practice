<?php

class Vehicle {
    public $type;	// Public: accessible from anywhere
    private $vin;	// Private: accessible only within this class
    protected $owner;	// Protected: accessible in this class and subclasses

    public function __construct($type, $vin, $owner) {
        $this->type = $type;
        $this->vin = $vin;
        $this->owner = $owner;
    }

    public function showVehicleDetails() {
        echo "Vehicle Type is: {$this->type}\n";
        echo "Vehicle Identity Number is: {$this->vin}\n";
        echo "Owner is: {$this->owner}\n";
    }
}

class Car extends Vehicle {
    public $brand;

    public function __construct($type, $vin, $owner, $brand) {
        parent::__construct($type, $vin, $owner); // calling Vehicle constructor from child class
        $this->brand = $brand;
    }

    public function showCarDetails() {
        echo "Car Brand: {$this->brand}\n";
        echo "Vehicle Type: {$this->type}\n";         // public is accessible here
        echo "Owner (from Car): {$this->owner}\n";    // protected is also accessible here
        // echo $this->vin; 			      // private is not accessible here
    }
}

$car = new Car("Car", "VIN2025ABC", "Test Owner", "Toyota");

echo "\n--- Full Vehicle Details ---\n";
$car->showVehicleDetails();

echo "--- Car Details ---\n";
$car->showCarDetails();

?>
