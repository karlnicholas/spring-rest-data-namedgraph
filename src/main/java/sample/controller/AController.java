package sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sample.model.A;
import sample.repo.ARepository;

    @RestController
    @RequestMapping("/a")
    public class AController {
        @Autowired 
        private ARepository repo;
    
        @GetMapping("{id}")
        public A getA(@PathVariable Long id) {
            A a = repo.findAFetchBById(id);
            return a;
        }
    
        @Transactional
        @DeleteMapping("{id}")
        public A deleteA(@PathVariable Long id) {
            A a = getA(id);
            repo.delete(id);
            return a;
        }
    }