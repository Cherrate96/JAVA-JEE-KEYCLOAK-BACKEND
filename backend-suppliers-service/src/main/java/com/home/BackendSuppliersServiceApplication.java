package com.home;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.home.domain.Supplier;
import com.home.repository.SupplierRepository;

@SpringBootApplication
public class BackendSuppliersServiceApplication implements CommandLineRunner{

	@Autowired
	private SupplierRepository supplierRepository;
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;
	public static void main(String[] args) {
		SpringApplication.run(BackendSuppliersServiceApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repositoryRestConfiguration.exposeIdsFor(Supplier.class);
		supplierRepository.save(new Supplier(null, "adam", "adam@gmail.com"));
		supplierRepository.save(new Supplier(null, "ahmed", "ahmed@gmail.com"));
		List<Supplier> suppliers=supplierRepository.findAll();
		for (int i = 0; i < suppliers.size(); i++) {
			System.out.println(suppliers.get(i).getName());
		}

	}

}
