package com.galvanize.tmo.paspringstarter;


import org.springframework.data.jpa.repository.JpaRepository;

interface BooksRepository extends JpaRepository<Books, Long> {

}