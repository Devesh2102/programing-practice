<?php
class Person {
    private $name;
    private $age;

    // Setter for name
    public function setName($name) {
        $this->name = $name;
    }

    // Getter for name
    public function getName() {
        return $this->name;
    }

    // Setter for age
    public function setAge($age) {
        if ($age > 0) {
            $this->age = $age;
        }
    }

    // Getter for age
    public function getAge() {
        return $this->age;
    }
}

// Creating a new object
$person = new Person();
$person->setName("Test");
$person->setAge(25);

echo "Name: " . $person->getName() . "\n";
echo "Age: " . $person->getAge()."\n";
?>
