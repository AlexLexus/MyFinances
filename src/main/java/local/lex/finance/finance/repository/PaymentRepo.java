package local.lex.finance.finance.repository;

import local.lex.finance.finance.entity.PaymentEntity;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepo extends CrudRepository<PaymentEntity, Long> {

    Iterable<PaymentEntity> findAll();
}
