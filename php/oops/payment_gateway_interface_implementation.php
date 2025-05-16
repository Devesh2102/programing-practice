<?php
// Interface: PaymentGateway
interface PaymentGateway {
    public function charge(float $amount, string $currency): PaymentResponse;
}

// Class: PaymentResponse (simple value object)
class PaymentResponse {
    public function __construct(
        public bool $success,
        public string $message,
        public ?string $transactionId = null
    ) {}
}

// Implementation: Stripe
class StripeGateway implements PaymentGateway {
    public function charge(float $amount, string $currency): PaymentResponse {
        // Simulate Stripe charge
        if ($amount < 1) {
            return new PaymentResponse(false, "Amount too low for Stripe.");
        }
        return new PaymentResponse(true, "Payment successful with Stripe.", uniqid("stripe_"));
    }
}

// Implementation: Razorpay
class RazorpayGateway implements PaymentGateway {
    public function charge(float $amount, string $currency): PaymentResponse {
        // Simulate Razorpay logic
        if ($currency !== 'INR') {
            return new PaymentResponse(false, "Razorpay supports INR only.");
        }
        return new PaymentResponse(true, "Payment successful with Razorpay.", uniqid("rzp_"));
    }
}

// Business logic: OrderService
class OrderService {
    public function __construct(private PaymentGateway $gateway) {}

    public function processOrder(float $amount, string $currency) {
        $response = $this->gateway->charge($amount, $currency);

        if ($response->success) {
            echo "Success: {$response->message}\nTransaction ID: {$response->transactionId}\n";
        } else {
            echo "Error: {$response->message}\n";
        }
    }
}


$order1 = new OrderService(new StripeGateway());
$order1->processOrder(1000, "USD");

$order2 = new OrderService(new RazorpayGateway());
$order2->processOrder(500, "INR");

$order3 = new OrderService(new RazorpayGateway());
$order3->processOrder(500, "USD"); // Razorpay doesn't support USD
?>
