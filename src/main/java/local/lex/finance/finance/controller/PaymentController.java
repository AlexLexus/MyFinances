package local.lex.finance.finance.controller;

import local.lex.finance.finance.entity.PaymentEntity;
import local.lex.finance.finance.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    private final PaymentService paymentService;

    @Autowired
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping
    public List<PaymentEntity> getPayments() {
        try {
            return (List<PaymentEntity>) paymentService.getPayments();
        } catch (Exception e) {
            return null;
        }
    }

    @PostMapping
    public ResponseEntity savePayment(@RequestBody PaymentEntity payment) {
        try {
            paymentService.savePayments(payment);
            return ResponseEntity.ok("Payment saved");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e);
        }
    }
}
