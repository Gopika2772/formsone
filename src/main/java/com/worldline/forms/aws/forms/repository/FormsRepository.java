package com.worldline.forms.aws.forms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.worldline.forms.aws.forms.entity.Forms;

@Repository
public interface FormsRepository extends JpaRepository<Forms, Integer> {

}
