package com.humber.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.humber.spring.model.Invoice;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long>  {

}
