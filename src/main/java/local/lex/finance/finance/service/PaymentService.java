package local.lex.finance.finance.service;

import local.lex.finance.finance.entity.PaymentEntity;
import local.lex.finance.finance.repository.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    private final PaymentRepo paymentRepo;

    @Autowired
    public PaymentService(PaymentRepo paymentRepo) {
        this.paymentRepo = paymentRepo;
    }

    public PaymentEntity savePayments(PaymentEntity payment) {
        return paymentRepo.save(payment);
    }

    public Iterable<PaymentEntity> getPayments() {
        return paymentRepo.findAll();
    }
}
