package com.example;

import com.example.models.Account;
import com.example.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Random;

@SpringBootApplication
public class SpringJpaDataApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(SpringJpaDataApplication.class, args);
    }
    @Autowired
    private AccountRepository accountRepository;
    @Override
    public void run(String... args) throws Exception {
        Random random = new Random();
//        for (long i = 1; i < 100; i++) {
//            Account account = new Account(i, "Name of #"+i, random.nextDouble(10000));
//            accountRepository.save(account);
//        }
//        accountRepository.findAll().forEach(System.out::println);
        PageRequest pageRequest = PageRequest.of(1, 10);

        // Sử dụng Pageable để in lại tất cả các Account

//        Page<Account> content = accountRepository.findAll(pageRequest);
//        List<Account> accounts = content.getContent();
//        accounts.forEach(System.out::println);

        // Sử dụng Pageable tìm ra các Account có Balance lớn hơn 5000

        accountRepository.findAccountByBalanceGreaterThan(5000, pageRequest).forEach(System.out::println);
    }
}
