package com.springboot.bookstore.repository.borrow;

import com.springboot.bookstore.model.borrow.BorrowModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowRepository extends JpaRepository<BorrowModel, Integer> {
}
