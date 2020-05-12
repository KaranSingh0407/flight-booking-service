package com.cg.fms.repository;

import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;

import com.cg.fms.dto.User;


/**
 * @author karan
 *
 */
public interface UserRepository extends CrudRepository<User, BigInteger> {


}