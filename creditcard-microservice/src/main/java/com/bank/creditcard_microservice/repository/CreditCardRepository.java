package com.bank.creditcard_microservice.repository;

import com.bank.creditcard_microservice.model.CreditCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditCardRepository extends JpaRepository<CreditCard, Long> {
}
