package com.humber.spring.service;

import java.util.List;
import com.humber.spring.model.Invoice;

public interface IInvoiceService {

	public Invoice saveInvoice(Invoice invoice);

	public List<Invoice> getAllInvoices();

	public Invoice getInvoiceById(Long id);

	public void deleteInvoiceById(Long id);

	public void updateInvoice(Invoice invoice);

}
