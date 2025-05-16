<?php
// Abstract class as a blueprint
abstract class Vehicle {
    protected $brand;
    protected $model;
    protected $year;

    public function __construct($brand, $model, $year) {
        $this->brand = $brand;
        $this->model = $model;
        $this->year = $year;
    }

    // Abstract methods to be implemented by child classes
    abstract public function startEngine();
    abstract public function fuelType();

    //Abstract class can include concrete methods too
    public function vehicleInfo() {
        echo "[$this->year] $this->brand $this->model\n";
    }
}

class Car extends Vehicle {
    private $seats;

    public function __construct($brand, $model, $year, $seats) {
        parent::__construct($brand, $model, $year);
        $this->seats = $seats;
    }

    public function startEngine() {
        echo "Starting car engine of $this->brand $this->model...\n";
    }

    public function fuelType() {
        echo "This car uses petrol.\n";
    }

    public function seatInfo() {
        echo "This car has $this->seats seats.\n";
    }
}

// Truck class extends Vehicle
class Truck extends Vehicle {
    private $loadCapacity;

    public function __construct($brand, $model, $year, $loadCapacity) {
        parent::__construct($brand, $model, $year);
        $this->loadCapacity = $loadCapacity;
    }

    public function startEngine() {
        echo "Starting diesel engine of truck $this->brand $this->model...\n";
    }

    public function fuelType() {
        echo "This truck uses diesel.\n";
    }

    public function loadInfo() {
        echo "This truck can carry $this->loadCapacity tons.\n";
    }
}

echo "=== Car Info ===\n";
$car = new Car("Honda", "Civic", 2022, 5);
$car->vehicleInfo();
$car->startEngine();
$car->fuelType();
$car->seatInfo();

echo "\n=== Truck Info ===\n";
$truck = new Truck("Volvo", "FH16", 2020, 18);
$truck->vehicleInfo();
$truck->startEngine();
$truck->fuelType();
$truck->loadInfo();
?>
